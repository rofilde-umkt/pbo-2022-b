import perpus.Buku;
import perpus.Dosen;

public class DaftarBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pergi untuk kembali", 1945, 100);
        Buku buku2 = new Buku("Lari dari mata kuliah", 2022, 10);
        Buku bukuZamanPurba = new Buku("NIUIOBT**&^*&G", 10);
        

        buku1.show();
        buku2.show();
        bukuZamanPurba.show();
        

        Dosen ali = new Dosen();
        
        
    }
}
