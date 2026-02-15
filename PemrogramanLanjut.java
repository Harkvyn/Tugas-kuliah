import java.util.*;

public class App {
    public static void main(String[] args) {
    bujurSangkar bujursangkar = new bujurSangkar(3);
        bujursangkar.info();
        System.out.println("Luas bujur sangkar: " + bujursangkar.luas());

        lingkaran Lingkaran = new lingkaran(3);
        Lingkaran.info();
        System.out.println("Luas lingkaran" + Lingkaran.luas());    
        
    }
}



class bidangDuaDimensi {
    private String nama;
    
    bidangDuaDimensi(String nama) {
        this.nama = nama;
    }
    
    void info() {
        System.out.println(this.nama);
    }
    
        int luas();
    
    
}

    class bujurSangkar extends bidangDuaDimensi{
        private int sisi;

        bujurSangkar(int sisi) {
            super("Bujur Sangkar")
            this.sisi = sisi;
        }

        int luas() {
            return sisi * sisi;
        }
    }

    class lingkaran extends bidangDuaDimensi{
        private int jari;

        lingkaran(int jari) {
            super("Lingkaran");
            this.jari = jari;
        }
        int luas() {
        return 3.14 * jari * jari;
        }
        
    }
