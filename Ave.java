public class Ave extends Animal {
    private double envergaduraAsas;
    private boolean voa;

    private Ave(){}

    private Ave(int id, String nome, int idade, double peso, Familia familia, double envergaduraAsas, boolean voa){
        super(id, nome, idade, peso, familia);
        this.envergaduraAsas = envergaduraAsas;
        this.voa = voa;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public boolean getVoa(){
        return voa;
    }

    public void setVoa(boolean voa){
        this.voa = voa;
    }
    
}
