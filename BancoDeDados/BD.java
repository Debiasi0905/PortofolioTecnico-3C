package bd.pkg0207;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
    
    // Pacote Connection:
    private static Connection connection;
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "QWQN4383";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);           
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }else{try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    
    // Pacote cria_visualiza:
    public static void create (String tabela, String... atributo){
        try{
            Connection con = BD.getConnection();
            String comando = "CREATE TABLE " + tabela + "(";
            
            for(String i : atributo){
                comando = comando + i + ",";
            }
            comando = comando.substring(0, comando.length()-1);
            comando = comando + ");";
        
            PreparedStatement ps = con.prepareStatement(comando);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void select (String tabela, String... atributo){
        try{
            Connection con = BD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM " + tabela);
            ResultSet rs = ps.executeQuery();
            
            String s = "";
            
            while(rs.next()){
                for(String i : atributo){
                    s = s+ " | " + rs.getString(i);
            }
            s = s + "\n";
           }
            System.out.println(s);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Pacote Manutenção Lojas
    public static void insertLojas(Lojas lojas){
        try{
            Connection con = BD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Lojas (cnpj, nome, contato, endereco, gerente) values(?, ?, ?, ?, ?)");
            ps.setLong(1, lojas.getCnpj());
            ps.setString(2, lojas.getNome());
            ps.setString(3, lojas.getContato());
            ps.setString(4, lojas.getEndereco());
            ps.setString(5, lojas.getGerente());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteLojas(long cnpj){
        try{
            Connection con = BD.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM lojas WHERE cnpj = ?");
            ps.setLong(1, cnpj);
            ps.executeUpdate();
            }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaBanco(Lojas lojas){
        deleteLojas(lojas.getCnpj());
        insertLojas(lojas);
    }
    
    // Pacote Manutenção Sapatos
    public static void insertSapatos(Sapatos sapatos){try{
            Connection con = BD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO sapatos (cod_barras, marca, tamanho, valor, qtd_estoque, cod_loja) values(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, sapatos.getCod_barras());
            ps.setString(2, sapatos.getMarca());
            ps.setInt(3, sapatos.getTamanho());
            ps.setFloat(4, sapatos.getValor());
            ps.setInt(5, sapatos.getQtd_estoque());
            ps.setLong(6, sapatos.getCod_loja());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void deleteSapatos(int cod_barras){
        try{
            Connection con = BD.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM sapatos WHERE cod_barras = ?");
            ps.setInt(1, cod_barras);
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaBanco(Sapatos sapatos){
        deleteSapatos(sapatos.getCod_barras());
        insertSapatos(sapatos);
    }
}
