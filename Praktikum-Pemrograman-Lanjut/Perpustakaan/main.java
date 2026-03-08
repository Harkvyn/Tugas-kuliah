package Perpustakaan;
import java.util.*;

class main {
  public static void main(String[] args) {
  buku[] buku_teknologi = new buku[5];
  buku[] buku_filsafat = new buku[5];
  buku[] buku_sejarah = new buku[5];
  buku[] buku_agama = new buku[5];
  buku[] buku_psikologi = new buku[5];
  buku[] buku_politik = new buku[5];
  buku[] buku_fiksi = new buku[5];

    
  kategori[] teknologi = new kategori[5];
  kategori[] filsafat = new kategori[5];
  kategori[] sejarah = new kategori[5];
  kategori[] agama = new kategori[5];
  kategori[] psikologi = new kategori[5];
  kategori[] politik = new kategori[5];
  kategori[] fiksi = new kategori[5];


    // Teknologi (melanjutkan yang sudah ada)
  teknologi[0] = buku("Apa itu handphone", 1, "teknologi");
  teknologi[1] = buku("Dasar-Dasar AI", 2, "teknologi");
  teknologi[2] = buku("Pemrograman Java", 3, "teknologi");
  teknologi[3] = buku("Jaringan Komputer", 4, "teknologi");
  teknologi[4] = buku("Keamanan Siber", 5, "teknologi");

  // Filsafat
  filsafat[0] = buku("Dunia Sophie", 6, "filsafat");
  filsafat[1] = buku("Madilog", 7, "filsafat");
  filsafat[2] = buku("Republik", 8, "filsafat");
  filsafat[3] = buku("Etika Nikomakea", 9, "filsafat");
  filsafat[4] = buku("Fenomenologi Roh", 10, "filsafat");

  // Sejarah
  sejarah[0] = buku("Sapiens", 11, "sejarah");
  sejarah[1] = buku("Sejarah Dunia yang Disembunyikan", 12, "sejarah");
  sejarah[2] = buku("Guns, Germs, and Steel", 13, "sejarah");
  sejarah[3] = buku("Nusantara", 14, "sejarah");
  sejarah[4] = buku("Revolusi Prancis", 15, "sejarah");

  // Agama
  agama[0] = buku("Pelajaran Tauhid", 16, "agama");
  agama[1] = buku("Sejarah Pemikiran Islam", 17, "agama");
  agama[2] = buku("Perbandingan Agama", 18, "agama");
  agama[3] = buku("Filsafat Ketuhanan", 19, "agama");
  agama[4] = buku("Sosiologi Agama", 20, "agama");

  // Psikologi
  psikologi[0] = buku("Man's Search for Meaning", 21, "psikologi");
  psikologi[1] = buku("Thinking, Fast and Slow", 22, "psikologi");
  psikologi[2] = buku("Psikologi Kepribadian", 23, "psikologi");
  psikologi[3] = buku("The Interpretation of Dreams", 24, "psikologi");
  psikologi[4] = buku("Emotional Intelligence", 25, "psikologi");

  // Politik
  politik[0] = buku("The Prince", 26, "politik");
  politik[1] = buku("Das Kapital", 27, "politik");
  politik[2] = buku("Kontrak Sosial", 28, "politik");
  politik[3] = buku("Teori Demokrasi", 29, "politik");
  politik[4] = buku("Geopolitik Dunia", 30, "politik");

  // Fiksi
  fiksi[0] = buku("Laskar Pelangi", 31, "fiksi");
  fiksi[1] = buku("Bumi Manusia", 32, "fiksi");
  fiksi[2] = buku("Harry Potter", 33, "fiksi");
  fiksi[3] = buku("The Great Gatsby", 34, "fiksi");
  fiksi[4] = buku("Rumah Kaca", 35, "fiksi");
  }
}
