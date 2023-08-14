public class Items {
    
    int id;
    String nome;
    int quantidade;
    double mediaVendas;

    public Items(int id, String nome, int quantidade, double mediaVendas){
        this.id = id;        
        this.nome = nome;
        this.quantidade = quantidade;
        this.mediaVendas = mediaVendas;    

    }
    
    public Items(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Items other = (Items) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public double getMediaVendas() {
        return mediaVendas;
    }

    public void setMediaVendas(double mediaVendas) {
        this.mediaVendas = mediaVendas;
    }
    
    
    
}