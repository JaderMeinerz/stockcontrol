import java.util.Scanner;

/**
 * StockControl
 */
public class StockControl {

    public static void main(String[] args) {
    
    System.out.println("Qual o id do item a ser adicionado? ");
    Scanner num = new Scanner(System.in);
    Scanner str = new Scanner(System. in);
    int id = num.nextInt();
    
    System.out.println("Qual o nome do item a ser adicionado? ");
    String nome = str.nextLine();

    System.out.println("Qual a quantidade do item a ser adicionado? ");
    int quantidade = num.nextInt();

    System.out.println("Id: " + id + "Nome: " + nome + "Quantidade: " + quantidade);
    
    ItemsController itemsController = new ItemsController();

    itemsController.setItems(id, nome, quantidade);
   
    
    }
}