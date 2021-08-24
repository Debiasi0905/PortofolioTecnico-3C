package bd.pkg0207;
import javax.swing.JOptionPane;

//@author Paulo, Leh, Rafa, Tutu

public class BD0207 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Bem vindo á Jorginho Sapatos - Disponível em todos os métodos!");
        
        // Criação de tabelas, só ocorre uma vez
        //BD.create("lojas", "cnpj BIGINT primary key", "nome varchar(30)", "contato varchar(45)", "endereco varchar(45)", "gerente varchar(30)");
        //BD.create("sapatos", "cod_barras INT primary key", "marca varchar(30)", "tamanho INT", "valor float", "qtd_estoque INT", "cod_loja BIGINT", "FOREIGN KEY(cod_loja) REFERENCES lojas (cnpj)");
        
        // Criação de Lojas
        
        //Lojas objeto = new Lojas(cnpj, "nome", "contato", "endereco", "gerente");
        //BD.insertLojas(objeto);
        
        //Lojas l1 = new Lojas(1230, "loja1", "loja1XXX@gmail.com", "Palhoça-SC", "Reberto");
        //BD.insertLojas(l1);
        
        
        
        // Exibindo tabelas no console
        System.out.println("TABELA LOJAS:");
        BD.select("lojas", "cnpj", "nome", "contato", "endereco", "gerente");
        System.out.println("TABELA SAPATOS:");
        BD.select("sapatos", "cod_barras", "marca", "tamanho", "valor", "qtd_estoque", "cod_loja");
    }
}
