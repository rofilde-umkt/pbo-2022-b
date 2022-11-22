import perpus.Buku;

public class DaftarBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setData("Pergi untuk kembali", 1945, 100);
        Buku buku2 = new Buku();
        buku2.setData("Lari dari mata kuliah", 2022, 10);

        Buku bukuZamanPurba = new Buku();
        bukuZamanPurba.setData("NIUIOBT**&^*&G", 10);

        buku1.show();
        buku2.show();
        bukuZamanPurba.show();
        
        
    }
}
