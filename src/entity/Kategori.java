package entity;

public class Kategori {

    private int id;
    private String grup;
    private int stok;
   

    public Kategori(int id, String grup, int stok) {
        this.id = id;
        this.grup = grup;
        this.stok = stok;
    }

  
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Kategori{" + "id=" + id + ", grup=" + grup+ '}';
    }
   

}
