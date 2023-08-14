import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemsController {
    List<Items> items =new ArrayList<Items>();
    Items item;
    int id, quantidade ;
    String nome;
    boolean nAlerta;
    double mediaVendas;
    Scanner num = new Scanner(System.in);
    Scanner str = new Scanner(System.in);
    Scanner dbl = new Scanner(System.in);
    public boolean checkAlerta(){
        return nAlerta;
    }
    
    public void checkVendas(int quantidade, double mediaVendas){
        if(quantidade/mediaVendas <= 3){
            nAlerta=true;
        }
    }

    public void getAlertas(){
        for (int count = 0; count<items.size();count++) {
            item = items.get(count);
            id = item.getId();
            nome = item.getNome();
            quantidade = item.getQuantidade();
            mediaVendas = item.getMediaVendas();
            if(quantidade/mediaVendas <= 3 ){
                System.out.println("O item " + nome + " de ID " + id + " tem estoque para apenas " + quantidade/mediaVendas + " dias");
            }
            
        }
    }


    public void setItems(String nome, int quantidade, double mediaVendas){
        id = items.size() + 1;
        nome= nome.substring(0, 1).toUpperCase()+nome.substring(1);
        items.add(new Items(id, nome, quantidade, mediaVendas));
        System.out.println("Cadastro concluido!"); 
        findAll();
    }

    public void findAll(){
        System.out.println("ID | Nome | Quantidade | Media Vendas(Dia)");
        System.out.println("------------------------");
        for (int i = 0; i<items.size();i++) {
            item = items.get(i);
            id = item.getId();
            nome = item.getNome();
            quantidade = item.getQuantidade();
            mediaVendas = item.getMediaVendas();
            checkVendas(quantidade, mediaVendas);
            System.out.println(id + " | " + nome + " | " + quantidade + " | " + mediaVendas);
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
        System.out.println("[3] Media de Vendas");
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
            case 3:
                System.out.println("Qual a nova Media de Vendas do item? ");
                mediaVendas = dbl.nextDouble();
            default:
                break;
        }
        System.out.println("Item atualizado com sucesso!");
        findAll();
    }

    public void delete(int id){
        item = findById(id);
        items.remove(item);

        System.out.println("Item deletado com sucesso!");
        findAll();
    }
}
