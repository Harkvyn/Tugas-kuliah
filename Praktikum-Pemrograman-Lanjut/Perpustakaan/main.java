package Perpustakaan;
import java.util.*;

class kategori {
    String nama;
    buku[] daftarBuku;

    kategori(String nama, buku[] daftarBuku) {
        this.nama = nama;
        this.daftarBuku = daftarBuku;
    }
}


class buku {
    String judul;
    int id;
    String kategori;
    String[] penulis;
    buku(String judul, int id, String kategori, String... penulis) {
        this.judul = judul;
        this.id = id;
        this.kategori = kategori;
        this.penulis = penulis;
    }

    void tampilkanInfo() {
        System.out.println("ID      : " + id);
        System.out.println("Judul   : " + judul);
        System.out.print("Penulis : ");
        for (int i = 0; i < penulis.length; i++) {
            System.out.print(penulis[i]);
            if (i < penulis.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}


class main {
  public static void main(String[] args) {
buku[] buku_teknologi = {
            new buku("Apa itu handphone", 1, "Teknologi", "Hamam"),
            new buku("Dasar AI", 2, "Teknologi", "B"),
            new buku("Pemrograman Java", 3, "Teknologi", "C"),
            new buku("Jaringan Komputer", 4, "Teknologi", "D"),
            new buku("Keamanan Siber", 5, "Teknologi", "E"),
            
  };

  buku[] buku_filsafat = {
            new buku("Dunia Sophie", 6, "Filsafat", "F"),
            new buku("Madilog", 7, "Filsafat", "G"),
            new buku("Republik", 8, "Filsafat", "H"),
            new buku("Etika Nikomakea", 9, "Filsafat", "I"),
            new buku("Fenomenologi Roh", 10, "Filsafat", "J")
  };
  buku[] buku_sejarah =  {
            new buku("sejarah1", 6, "Sejarah", "k"),
            new buku("sejarah2", 7, "Sejarah", "l"),
            new buku("sejarah3", 8, "Sejarah", "m"),
            new buku("sejarah4", 9, "Sejarah", "N"),
            new buku("sejarah5", 10, "Sejarah", "O")
  };
  buku[] buku_agama =  {
            new buku("AGAMA1", 6, "Agama", "P"),
            new buku("AGAMA2", 7, "Agama", "Q"),
            new buku("AGAMA3", 8, "Agama", "R"),
            new buku("AGAMA4", 9, "Agama", "S"),
            new buku("AGAMA5", 10, "Agama", "T")
  };
  buku[] buku_psikologi = {
            new buku("psiko1", 6, "psikologi", "U"),
            new buku("psiko2", 7, "psikologi", "V"),
            new buku("psiko3", 8, "psikologi", "W"),
            new buku("psiko4", 9, "psikologi", "X"),
            new buku("psiko5", 10, "psikologi", "Y")
  }; 
  buku[] buku_politik = {
            new buku("politik1", 6, "politik", "Z"),
            new buku("politik2", 7, "politik", "AA"),
            new buku("politik3", 8, "politik", "BB"),
            new buku("politik4", 9, "politik", "CC"),
            new buku("politik5", 10, "politik", "DD")

  } ; 
  buku[] buku_fiksi = {
            new buku("fiksi1", 6, "fiksi", "EE"),
            new buku("fiksi2", 7, "fiksi", "FF"),
            new buku("fiksi3", 8, "fiksi", "GG"),
            new buku("fiksi4", 9, "fiksi", "HH"),
            new buku("fiksi5", 10, "fiksi", "II")
  } ; 

        kategori teknologi = new kategori("Teknologi", buku_teknologi);
        kategori filsafat  = new kategori("Filsafat", buku_filsafat);
        kategori sejarah   = new kategori("Sejarah", buku_sejarah);
        kategori agama     = new kategori("Agama", buku_agama);
        kategori psikologi = new kategori("Psikologi", buku_psikologi);
        kategori politik   = new kategori("Politik", buku_politik); // Tambahkan politik
        kategori fiksi     = new kategori("Fiksi", buku_fiksi);

  for (int i = 0; i < teknologi.daftarBuku.length; i++) {
            teknologi.daftarBuku[i].tampilkanInfo();
        }
  }
}

