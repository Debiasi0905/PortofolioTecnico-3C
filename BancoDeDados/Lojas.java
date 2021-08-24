package bd.pkg0207;
public class Lojas {
    
    private long cnpj;
    private String nome;
    private String contato;
    private String endereco;
    private String gerente;

    public Lojas(long cnpj, String nome, String contato, String endereco, String gerente) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}
