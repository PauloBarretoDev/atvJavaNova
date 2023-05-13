public class Pato extends Ave {
    private String corPenas;

    public Pato(){}

    public Pato(int id, String nome, int idade, double peso, Familia familia, double envergaduraAsas, boolean voa, String corPenas){
        super(id, nome, idade, peso, familia, envergaduraAsas, voa);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    @Override
    public String ehVoador(){
       return "A ave pato, plana";
    }

    @Override
    public String toString() {

        return "Informações do animal: \nId: " + this.getId() +
        "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nPeso: " + this.getPeso() +
        "\nFamilia: " + this.getFamilia() + "\nEnvergadura das asas: " + this.getEnvergaduraAsas() + 
        "\nVoador: " + this.ehVoador() + "\nCor das penas: " + this.corPenas;
    }
}
