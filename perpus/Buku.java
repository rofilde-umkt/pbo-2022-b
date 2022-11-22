package perpus; 

public class Buku {
    public String judul;
    protected int tahun; 
    private int halaman; 

    public void setData(String j,  int h) {
        this.judul = j; 
        this.halaman = h;
    }

    public void setData(String j, int t, int h) {
        this.judul = j; 
        this.tahun = t;
        this.halaman = h;
    }

    public void show() {
        System.out.println("Judul " + this.judul);
        System.out.println("Tahun " + this.tahun);
        System.out.println("Halaman " + this.halaman);
    }
}