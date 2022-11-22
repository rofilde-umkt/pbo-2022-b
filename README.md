## Cara Testing 


Untuk melakukan testing terhadap kelas yang telah kalian buat dalam paket, maka kalian dapat membuat satu buah kelas diluar misalkan dengan nama `Testing.java`. Isi `Testing.java` sangat sederhana, misalkan hanya membuat objek (variabel) menggunakan kelas yang terdapat pada paket, misalkan berisi seperti berikut:

```java
import perpus.Dosen; 

public Testing 
{
    public static void main(String[] args) {
        Dosen ali = new Dosen();
    }

}

```
Seperti contoh di atas, kita akan coba untuk mengetest apakah kelas Dosen pada paket sudah benar. Kita dapat mengkompilasi `Testing.java`, kemudian secara otomatis akan juga mengkompilasi `Dosen.java`. Jika terdapat kesalahan, maka akan muncul pesan error. Perbaiki error tersebut!.