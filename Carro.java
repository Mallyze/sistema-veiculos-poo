public class Carro extends Automovel{
    private String cor;
    private String modelo;


    public Carro (String cor, String modelo, String nome, String fabricante){
        super(nome, fabricante);
        this.cor=cor;
        this.modelo=modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return super.toString() + " Cor=" + cor + " Modelo=" + modelo;
    }
}
