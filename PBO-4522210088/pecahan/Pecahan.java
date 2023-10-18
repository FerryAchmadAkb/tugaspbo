package pecahan;

public class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan(int pembilang, int penyebut) {
        // Memastikan penyebut selalu positif
        if (penyebut == 0) {
            throw new IllegalArgumentException("Penyebut tidak boleh nol.");
        }
        if (penyebut < 0) {
            pembilang = -pembilang;
            penyebut = -penyebut;
        }

        // Menggunakan metode fpb untuk menyederhanakan pecahan
        int fpb = hitungFPB(pembilang, penyebut);
        this.pembilang = pembilang / fpb;
        this.penyebut = penyebut / fpb;
    }

    // Metode untuk penjumlahan pecahan
    public Pecahan tambah(Pecahan other) {
        int newPembilang = this.pembilang * other.penyebut + other.pembilang * this.penyebut;
        int newPenyebut = this.penyebut * other.penyebut;
        return new Pecahan(newPembilang, newPenyebut);
    }

    // Metode untuk pengurangan pecahan
    public Pecahan kurang(Pecahan other) {
        int newPembilang = this.pembilang * other.penyebut - other.pembilang * this.penyebut;
        int newPenyebut = this.penyebut * other.penyebut;
        return new Pecahan(newPembilang, newPenyebut);
    }

    // Metode untuk perkalian pecahan
    public Pecahan kali(Pecahan other) {
        int newPembilang = this.pembilang * other.pembilang;
        int newPenyebut = this.penyebut * other.penyebut;
        return new Pecahan(newPembilang, newPenyebut);
    }

    // Metode untuk pembagian pecahan
    public Pecahan bagi(Pecahan other) {
        int newPembilang = this.pembilang * other.penyebut;
        int newPenyebut = this.penyebut * other.pembilang;
        return new Pecahan(newPembilang, newPenyebut);
    }

    // Menghitung Faktor Persekutuan Terbesar (FPB)
    private int hitungFPB(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hitungFPB(b, a % b);
        }
    }

    @Override
    public String toString() {
        return pembilang + "/" + penyebut;
    }
}
