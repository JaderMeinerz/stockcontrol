public class ItemsController {

    public Items setItems(int id, String nome, int quantidade){
        Items items = new Items();
        items.setId(id);
        items.setNome(nome);
        items.setQuantidade(quantidade);

        System.out.println(items);
        return items;
    }

}
