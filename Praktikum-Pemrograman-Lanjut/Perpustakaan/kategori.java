package Perpustakaan;
import java.util.*;

class kategori {
  String nama;
  int ID;

  kategori(String nama, int ID) {
    this.nama = nama;
    this.ID = ID;
  }
}

class buku {
  String judul;
  int ID;
  String kategori;
  buku(String judul, int ID, String kategori) {
    this.judul = judul;
    this.ID = ID;
    this.kategori = kategori;
  }
}
