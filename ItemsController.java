import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemsController {
    List<Items> items =new ArrayList<Items>();

    public void setItems(int id, String nome, int quantidade){
        items.add(new Items(id, nome, quantidade));
        System.out.println("Cadastro concluido!"); 
    }

    public void findAll(){
        System.out.println("ID | Nome | Quantidade");
        System.out.println("------------------------");
        for (int i = 0; i<items.size();i++) {
            Items item = items.get(i);
            int id = item.getId();
            String nome = item.getNome();
            int quantidade = item.getQuantidade();
            System.out.println(id + " | " + nome + " | " + quantidade);
        }
        
    }
    public Items findById(int id){
        Items item = items.get(id-1);
        return item;
    }


    public void update(int id){
        Items item = items.get(id-1);
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Qual campo deseja atualizar? ");
        System.out.println("[1] Nome;");
        System.out.println("[2] Quantidade; ");
        int res = num.nextInt();
        switch (res) {
            case 1:
                System.out.println("Qual o novo Nome do item? ");
                String nome = str.nextLine();
                item.setNome(nome);
                break;
            case 2:
                System.out.println("Qual a nova Quantidade do item? ");
                String quantidade = num.nextLine();
                item.setNome(quantidade);
                break;
            default:
                break;
        }
        System.out.println("Item atualizado com sucesso!");

    }
}
