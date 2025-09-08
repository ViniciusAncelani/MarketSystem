import java.util.Scanner;

public class Cliente {
    String name, birthday, CPF;
    Scanner sc = new Scanner(System.in);

    Cliente() {

    }

    Cliente(String n, String c, String b) {
        this.name = n;
        this.CPF = c;
        this.birthday = b;
    }

    void setName(String n) {
        this.name = n;
    }

    void setBirthday(String b) {
        this.birthday = b;
    }

    void setCPF(String c) {
        this.CPF = c;
    }

    String getName() {
        return this.name;
    }

    String getCPF() {
        return this.CPF;
    }

    String getBirthday() {
        return this.birthday;
    }

    void getUserAtrributes() {
        System.out.println("Digite o seu nome: ");
        name = sc.nextLine();
        setName(name);

        System.out.println("Digite a sua data de nascimento: ");
        birthday = sc.nextLine();
        setBirthday(birthday);

        System.out.println("Digite o seu CPF: ");
        CPF = sc.nextLine();
        setCPF(CPF);
    }

    void ConsultarProduto() {

        while (true) {

            System.out.println("\nDigite o produto que deseja consultar: ");
            String requestForProduct = sc.nextLine();

            for (Produto pr : Produto.estoque) {
                if (pr.getName().equalsIgnoreCase(requestForProduct)) {
                    System.out.println("Nome do produto: ");
                    System.out.printf(pr.getName() + ",");
                } else {
                    System.out.println("Desculpa, mas o produto não foi cadastrado.");
                    System.out.println("Deseja verificar outro produto?");
                    String requestForFindProducts = sc.nextLine();

                    if (requestForFindProducts.equalsIgnoreCase("não")) {
                        break;
                    }
                }
            }
        }
    }

    void VerLista() {

        System.out.println("\nLista dos Produtos: ");

        for(Produto pr: Produto.estoque){
            System.out.printf(pr.getName() + ",");
        }
    }
}
