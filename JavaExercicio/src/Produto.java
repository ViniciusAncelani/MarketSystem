import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    private String prend, name, description;
    private Double price;
    private int amount;
    private long bytecode;
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Produto> estoque = new ArrayList<>();

    public Produto() {}

    public Produto(String p, String n, String d, Double pr, int a, long bc) {
        this.prend = p;
        this.name = n;
        this.description = d;
        this.price = pr;
        this.amount = a;
        this.bytecode = bc;
    }

    void setPrend(String prd) {this.prend = prd;}

    void setName(String nme) {this.name = nme;}

    void setDescription(String dcr) {this.description = dcr;}

    void setPrice(Double prc) {this.price = prc;}

    void setAmount(int amnt) {this.amount = amnt;}

    void setByteCode(long bc) {this.bytecode = bc;}

    String getPrend() {return prend;}

    String getName() {return name;}

    String getDescription() {return description;}

    Double getPrice() {return price;}

    int getAmount() {return amount;}

    long getBytecode() {return bytecode;}


    void Cadastrar() {

        while (true) {

            System.out.println("Digite o nome do produto(ou sair caso deseje parar): ");
            name = sc.nextLine();
            setName(name);

            if (name.equalsIgnoreCase("sair")) {
                System.out.println("Agradeçemos a sua presença, volte sempre!");
                break;
            }

            System.out.println("Digite a marca do produto: ");
            prend = sc.nextLine();
            setPrend(prend);

            System.out.println("Digite a descrição do produto: ");
            description = sc.nextLine();
            setDescription(description);

            System.out.println("Digite o preço do produto: ");
            price = sc.nextDouble();
            setPrice(price);
            sc.nextLine();

            System.out.println("Digite a quantidade pega do produto: ");
            amount = sc.nextInt();
            setAmount(amount);
            sc.nextLine();

            System.out.println("Digite o código de barra do produto: ");
            bytecode = sc.nextLong();
            setByteCode(bytecode);
            sc.nextLine();

            Produto p = new Produto(prend, name, description, price, amount, bytecode);
            estoque.add(p);

            System.out.println("Deseja continuar suas compras? ");
            String requestForBuy = sc.nextLine();

            if (requestForBuy.equalsIgnoreCase("não")) {
                System.out.println("Muito Obrigado, volte sempre!");
                break;
            }
        }
    }

    void ExibirProduto() {
            for(Produto p: estoque){
            System.out.println("-------Produto-------");
            System.out.println("Nomes dos produtos: " + p.getName());
            System.out.println("Marca dos produtos: " + p.getPrend());
            System.out.println("Digite a descrição do produto: " + p.getDescription());
            System.out.println("Preço: " +  p.getPrice());
            System.out.println("Quantidade: " + p.getAmount());
            System.out.println("Códigos de barras: " + p.getBytecode());
            System.out.println("--------------------");
        }
    }
}
