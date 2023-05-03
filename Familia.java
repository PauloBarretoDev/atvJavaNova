public abstract class Familia {
    private String familiaBiologica;

    public Familia(){

    }

    public Familia(String familiaBiologica){
        this.familiaBiologica = familiaBiologica;
    }

    public String getFamiliaBiologica() {
        return familiaBiologica;
    }

    public void setFamiliaBiologica(String familiaBiologica) {
        this.familiaBiologica = familiaBiologica;
    }
}
