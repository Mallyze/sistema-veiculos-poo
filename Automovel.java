public class Automovel {
    protected String nome;
    protected String fabricante;

    public Automovel (String nome, String fabricante){
        this.nome=nome;
        this.fabricante=fabricante;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString(){
        return "Nome=" + nome + " Fabricante=" + fabricante;
    }
}
