public class Animal{
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private Familia familia;

    public Animal(){};
    
    public Animal(int id, String nome, int idade, double peso, Familia familia){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.familia = familia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public void aumentarIdade(){
        this.idade += 1;
    }

    public void comer(){
        this.peso += 1;
    }

    public void atividadesFisicas(){
        this.peso -= 2;
    }


}