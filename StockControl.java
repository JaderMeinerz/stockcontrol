import java.util.Scanner;

/**
 * StockControl
 */
public class StockControl {
    static ItemsController itemsController = new ItemsController();
    static Scanner num = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    static int id, quantidade;
    static String res, nome;
    static Items item;
    static boolean tf;
    public static void save(){
        
        System.out.println("Qual o id do item a ser adicionado? ");
        id = num.nextInt();
    
        System.out.println("Qual o nome do item a ser adicionado? ");
        nome = str.nextLine();

        System.out.println("Qual a quantidade do item a ser adicionado? ");
        quantidade = num.nextInt();

        System.out.println("Id: " + id + " Nome: " + nome + " Quantidade: " + quantidade);
    
        itemsController.setItems(id, nome, quantidade);

        menu();
    };
    public static void update(){
        System.out.println("Qual o ID do item que deseja atualizar? ");
        id = num.nextInt();

        

        item = itemsController.findById(id);
        nome = item.getNome();
        quantidade = item.getQuantidade();

        System.out.println("Id: " + id + " Nome: " + nome + " Quantidade: " + quantidade);

        itemsController.update(id);

        menu();
    }

    public static void read(){
        System.out.println("Qual item você deseja consultar? ");
        System.out.println("[1] Buscar todos");
        System.out.println("[2] Buscar por ID");
        id = num.nextInt();

        switch (id) {
            case 1:
                itemsController.findAll();
                break;
            case 2:
                System.out.println("Digite o ID do item: ");
                id = num.nextInt();
                item = itemsController.findById(id);
                nome = item.getNome();
                quantidade = item.getQuantidade();
                System.out.println(id + " | " + nome + " | " + quantidade);                
                break;
            default:
                break;
        }
        menu();
    }

    public static void del(){
        System.out.println("Qual o id do item a ser deletado? ");
        id = num.nextInt();
        itemsController.delete(id);
        menu();
    }

    public static void menu(){
        System.out.println("Deseja realizar alguma operação?[y/n]" );
        res = str.nextLine();
        if (res.equals("y")){
            tf = true;
            if (tf) {
            System.out.println("[1] Cadastro de itens;");
            System.out.println("[2] Consulta de itens;");
            System.out.println("[3] Atualizar um item;");
            System.out.println("[4] Excluir um item;");
            System.out.println("Qual função deseja efetuar? ");
            id = num.nextInt();
            
            switch (id) {
                case 1:
                    save();
                    break;
    
                case 2:
                    read();
                    break;
                
                case 3:
                    update();
                    break;
                
                case 4:
                    del();
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