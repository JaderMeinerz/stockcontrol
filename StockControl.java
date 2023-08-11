import java.util.Scanner;

/**
 * StockControl
 */
public class StockControl {
    static ItemsController itemsController = new ItemsController();

    public static void save(){
        
        System.out.println("Qual o id do item a ser adicionado? ");
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System. in);
        int id = num.nextInt();
    
        System.out.println("Qual o nome do item a ser adicionado? ");
        String nome = str.nextLine();

        System.out.println("Qual a quantidade do item a ser adicionado? ");
        int quantidade = num.nextInt();

        System.out.println("Id: " + id + " Nome: " + nome + " Quantidade: " + quantidade);
    
        itemsController.setItems(id, nome, quantidade);

        menu();
    };
    public static void update(){
        System.out.println("Qual o ID do item que deseja atualizar? ");
        Scanner num = new Scanner(System.in);
        int id = num.nextInt();

        Items item = itemsController.findById(id);
        String nome = item.getNome();
        int quantidade = item.getQuantidade();

        System.out.println("Id: " + id + " Nome: " + nome + " Quantidade: " + quantidade);

        itemsController.update(id);

        menu();
    }

    public static void menu(){
        System.out.println("Deseja realizar alguma operação?[y/n]" );
        Scanner t = new Scanner(System.in);
        String res = t.nextLine();
        if (res.equals("y")){
            boolean tf = true;
            if (tf) {
            System.out.println("[1] Cadastro de itens;");
            System.out.println("[2] Consulta de itens;");
            System.out.println("[3] Atualizar um item;");
            System.out.println("Qual função deseja efetuar? ");
            Scanner s = new Scanner(System.in);
            int op = s.nextInt();
            
            switch (op) {
                case 1:
                    save();
                    break;
    
                case 2:
                    itemsController.findAll();
                    break;
    
                case 3:
                    update();
                    break;
                default:
        
                    break;
            }
        }
        } else { 
            System.out.println("Até logo!");
        }
        
    }
    public static void main(String[] args) {
        menu();
    
    }
}