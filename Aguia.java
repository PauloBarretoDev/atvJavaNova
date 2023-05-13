public class Aguia extends Ave {

    private boolean gerouFilhos;
    
    public Aguia(){}
    
    public Aguia(int id, String nome, int idade, double peso, Familia familia, double envergaduraAsas, boolean voa, boolean gerouFilhos){
        super(id, nome, idade, peso, familia, envergaduraAsas, voa);
        this.gerouFilhos = gerouFilhos;
    }

    public boolean getGerouFilhos(){
        return this.gerouFilhos;
    }

    public void setGerouFilhos(boolean gerouFilhos) {
        this.gerouFilhos = gerouFilhos;
    }

    @Override
    public String ehVoador(){
       return "A ave águia, voa!";
    }

    @Override
    public String toString() {

        return "Informações do animal: \nId: " + this.getId() +
        "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nPeso: " + this.getPeso() +
        "\nFamilia: " + this.getFamilia() + "\nEnvergadura das asas: " + this.getEnvergaduraAsas() + 
        "\nVoador: " + this.ehVoador() + "\nGerou filhos? " + this.gerouFilhos;
    }
}
