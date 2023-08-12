import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemsController {
    List<Items> items =new ArrayList<Items>();
    Items item;
    int id, quantidade;
    String nome;
    Scanner num = new Scanner(System.in);
    Scanner str = new Scanner(System.in);


    public void setItems(int id, String nome, int quantidade){
        items.add(new Items(id, nome, quantidade));
        System.out.println("Cadastro concluido!"); 
    }

    public void findAll(){
        System.out.println("ID | Nome | Quantidade");
        System.out.println("------------------------");
        for (int i = 0; i<items.size();i++) {
            item = items.get(i);
            id = item.getId();
            nome = item.getNome();
            quantidade = item.getQuantidade();
            System.out.println(id + " | " + nome + " | " + quantidade);
        }
        
    }
    public Items findById(int id){
        item = items.get(id-1);
        return item;
    }


    public void update(int id){
        item = findById(id);
        System.out.println("Qual campo deseja atualizar? ");
        System.out.println("[1] Nome;");
        System.out.println("[2] Quantidade; ");
        int res = num.nextInt();
        switch (res) {
            case 1:
                System.out.println("Qual o novo Nome do item? ");
                nome = str.nextLine();
                item.setNome(nome);
                break;
            case 2:
                System.out.println("Qual a nova Quantidade do item? ");
                quantidade = num.nextInt();
                item.setQuantidade(quantidade);
                break;
            default:
                break;
        }
        System.out.println("Item atualizado com sucesso!");

    }

    public void delete(int id){
        item = findById(id);
        items.remove(item);

        System.out.println("Item deletado com sucesso!");
    }
}
