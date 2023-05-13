public class Lobo extends Mamifero {
    private boolean ehAlpha;

    public Lobo(){}
    
    public Lobo(int id, String nome, int idade, double peso, Familia familia, String quantidadePelos, String ultimoAlimento, boolean ehAlpha){
        super(id, nome, idade, peso, familia, quantidadePelos, ultimoAlimento);
        this.ehAlpha = ehAlpha;
    }

    public boolean getAlpha(){
        return this.ehAlpha;
    }

    public void setEhAlpha(boolean ehAlpha) {
        this.ehAlpha = ehAlpha;
    }

    @Override
    public String toString() {

        return "Informações do animal: \nId: " + this.getId() +
        "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nPeso: " + this.getPeso() +
        "\nFamilia: " + this.getFamilia() + 
        "\nQuantidade de pelos: " + this.getQuantidadePelos() + "\nUltimo Alimento: " + this.ultimoAlimentoAnimal() + 
        "\nO lobo é alpha? " + this.ehAlpha;
    }
}
