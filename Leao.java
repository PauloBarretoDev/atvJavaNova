public class Leao extends Mamifero {
    private int qtdVacinas;
    
    public Leao(){}

    public Leao(int id, String nome, int idade, double peso, Familia familia, String quantidadePelos, String ultimoAlimento, int qtdVacinas){
        super(id, nome, idade, peso, familia, quantidadePelos, ultimoAlimento);
        this.qtdVacinas = qtdVacinas;
    }

    public int getQtdVacinas() {
        return qtdVacinas;
    }

    public void setQtdVacinas(int qtdVacinas) {
        this.qtdVacinas = qtdVacinas;
    }

    @Override
    public String toString() {

        return "Informações do animal: \nId: " + this.getId() +
        "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nPeso: " + this.getPeso() +
        "\nFamilia: " + this.getFamilia() + 
        "\nQuantidade de pelos: " + this.getQuantidadePelos() + "\nUltimo Alimento: " + this.ultimoAlimentoAnimal() + 
        "\nQuantidade de vacinas: " + this.qtdVacinas;
    }
}
