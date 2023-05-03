public class Mamifero extends Animal {
    private String quantidadePelos;
    private String ultimoAlimento;

    public Mamifero(){}

    public Mamifero(int id, String nome, int idade, double peso, Familia familia, String quantidadePelos){
        super(id, nome, idade, peso, familia);
        this.quantidadePelos = quantidadePelos;
        this.ultimoAlimento = "";
    }

    public String getQuantidadePelos() {
        return quantidadePelos;
    }

    public void setQuantidadePelos(String quantidadePelos) {
        this.quantidadePelos = quantidadePelos;
    }

    public String getUltimoAlimento() {
        return ultimoAlimento;
    }

    public void setUltimoAlimento(String ultimoAlimento) {
        this.ultimoAlimento = ultimoAlimento;
    }

    public String ultimoAlimentoAnimal(){
        return "O último alimento que o animal comeu foi: " + this.ultimoAlimento;
    }

}
