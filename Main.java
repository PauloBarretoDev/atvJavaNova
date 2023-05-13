import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> zoologico = new ArrayList<Animal>();
        System.out.println("Bem vindo ao Zoologico de Raccon City!");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar novos animais no sistema.");
        System.out.println("2 - Remover animais cadastrados no sistema.");
        System.out.println("3 - Sair do sistema.");
        int resposta = scanner.nextInt();
        while(resposta!=3){
            if(resposta == 1){
                System.out.println("Qual dos 4 animais deseja inserir?");
                System.out.println("1 - Leão");
                System.out.println("2 - Lobo");
                System.out.println("3 - Pato");
                System.out.println("4 - Águia");
                int animalEscolhido = scanner.nextInt();
                if(animalEscolhido == 1){
                    System.out.println("Animal escolhido: Leão");
                    System.out.println("Forneça os dados do Leão");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Familia: ");
                    String familia = scanner.next();
                    scanner.nextLine();
                    System.out.print("Quantidade de pelos(pouco, médio, muitos): ");
                    String quantidadePelos = scanner.next();
                    scanner.nextLine();
                    System.out.print("Último alimento: ");
                    String ultimoAlimento = scanner.nextLine();
                    System.out.print("Quantidade de vacinas: ");
                    int qtdVacinas = scanner.nextInt();
                    scanner.nextLine();
                    zoologico.add(new Leao(id,nome,idade,peso, new Familia(familia) ,quantidadePelos, ultimoAlimento, qtdVacinas ));
                    System.out.println("");
                    System.out.println("Animal cadastrado com sucesso!");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Cadastrar novos animais no sistema.");
                    System.out.println("2 - Remover animais cadastrados no sistema.");
                    System.out.println("3 - Sair do sistema.");
                    resposta = scanner.nextInt();
                }
                if(animalEscolhido == 2){
                    System.out.println("Animal escolhido: Lobo");
                    System.out.println("Forneça os dados do Lobo");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Familia: ");
                    String familia = scanner.next();
                    scanner.nextLine();
                    System.out.print("Quantidade de pelos(pouco, médio, muitos): ");
                    String quantidadePelos = scanner.next();
                    scanner.nextLine();
                    System.out.print("Último alimento: ");
                    String ultimoAlimento = scanner.nextLine();
                    System.out.print("O Lobo é o Alpha?[1 - Sim / 2 - Não ]");
                    boolean alpha = true;
                    if(scanner.nextInt() == 1){
                        alpha = true;
                    }
                    else{
                        alpha = false;
                    }
                    scanner.nextLine();
                    zoologico.add(new Lobo(id,nome,idade,peso, new Familia(familia) ,quantidadePelos, ultimoAlimento, alpha ));
                    System.out.println("");
                    System.out.println("Animal cadastrado com sucesso!");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Cadastrar novos animais no sistema.");
                    System.out.println("2 - Remover animais cadastrados no sistema.");
                    System.out.println("3 - Sair do sistema.");
                    resposta = scanner.nextInt();
                }
                if(animalEscolhido == 3){
                    System.out.println("Animal escolhido: Pato");
                    System.out.println("Forneça os dados do Pato");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Familia: ");
                    String familia = scanner.next();
                    System.out.print("Qual a envergadura das asas?");
                    double envergaduraAsas = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("O pato voa ou plana? [1 - Voa / 2 - Plana]");
                    boolean voa = false;
                    if(scanner.nextInt() == 1){
                        voa = true;
                    }
                    else{
                        voa = false;
                    }
                    System.out.print("Qual a cor das penas do pato?");
                    String corPenas = scanner.nextLine();
                    zoologico.add(new Pato(id,nome,idade,peso, new Familia(familia),envergaduraAsas,voa,corPenas));
                    System.out.println("");
                    System.out.println("Animal cadastrado com sucesso!");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Cadastrar novos animais no sistema.");
                    System.out.println("2 - Remover animais cadastrados no sistema.");
                    System.out.println("3 - Sair do sistema.");
                    resposta = scanner.nextInt();
                }
                if(animalEscolhido == 4){
                    System.out.println("Animal escolhido: Águia");
                    System.out.println("Forneça os dados do Águia");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Familia: ");
                    String familia = scanner.next();
                    System.out.print("Qual a envergadura das asas?");
                    double envergaduraAsas = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("A águia voa ou plana? [1 - Voa / 2 - Plana]");
                    boolean voa = false;
                    if(scanner.nextInt() == 1){
                        voa = true;
                    }
                    else{
                        voa = false;
                    }
                    System.out.print("Gerou filhos? [1 - Sim / 2 - Não]");
                    boolean gerouFilhos = true;
                    if(scanner.nextInt() == 1){
                        gerouFilhos = true;
                    }
                    else{
                        gerouFilhos = false;
                    }
                    zoologico.add(new Aguia(id,nome,idade,peso, new Familia(familia),envergaduraAsas,voa,gerouFilhos));
                    System.out.println("");
                    System.out.println("Animal cadastrado com sucesso!");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Cadastrar novos animais no sistema.");
                    System.out.println("2 - Remover animais cadastrados no sistema.");
                    System.out.println("3 - Sair do sistema.");
                    resposta = scanner.nextInt();
                }
            }
            if(resposta == 2){
                System.out.print("Informe o id do animal que deseja remover: ");
                int idRemover = scanner.nextInt();
                scanner.nextLine();
                removerAnimal(idRemover,zoologico);
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Cadastrar novos animais no sistema.");
                System.out.println("2 - Remover animais cadastrados no sistema.");
                System.out.println("3 - Sair do sistema.");
                resposta = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void removerAnimal(int id, ArrayList<Animal> ar){
        if(ar.size() == 0){
            System.out.println("");
            System.out.println("Nenhum animal foi cadastrado ainda!");
            System.out.println("");
            return;
        }
        for (Animal animal : ar) {
            if(animal.getId() != id){
                System.out.println("");
                System.out.println("Id informado não existente");
                System.out.println("");
                return;
            }
        }
        for (Animal animal : ar) {
            if(animal.getId() == id){
                System.out.println(animal);
                ar.remove(animal);               
                System.out.println("");
                System.out.println("Animal removido com sucesso!");
                System.out.println("");
                return;
            }
        }
    
    }
}
