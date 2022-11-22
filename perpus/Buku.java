package perpus; 

public class Buku {
    private String judul;
    private int tahun; 
    private int halaman; 
    private Penulis penulis; 
    private Penerbit penerbit;

    public Buku(String j,  int h) {
        this.judul = j; 
        this.halaman = h;
    }

    public Buku(String j, int t, int h) {
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