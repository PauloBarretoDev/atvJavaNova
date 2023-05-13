public class Familia {
    private String familia;

    public Familia(){

    }

    public Familia(String familia){
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return this.familia;
    }
}
