package bd.pkg0207;
public class Sapatos {
    
    private int cod_barras;
    private String marca;
    private int tamanho;
    private float valor;
    private int qtd_estoque;
    private long cod_loja;

    public Sapatos(int cod_barras, String marca, int tamanho, float valor, int qtd_estoque, long cod_loja) {
        this.cod_barras = cod_barras;
        this.marca = marca;
        this.tamanho = tamanho;
        this.valor = valor;
        this.qtd_estoque = qtd_estoque;
        this.cod_loja = cod_loja;
    }

    public int getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public long getCod_loja() {
        return cod_loja;
    }

    public void setCod_loja(long cod_loja) {
        this.cod_loja = cod_loja;
    }
}
