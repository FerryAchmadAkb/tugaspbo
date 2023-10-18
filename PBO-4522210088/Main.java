import pecahan.Pecahan;
import matriks.Matriks;

public class Main {
    public static void main(String[] args) {
        // Menguji operasi-operasi pada Pecahan
        Pecahan pecahan1 = new Pecahan(6, 4);
        Pecahan pecahan2 = new Pecahan(2, 7);

        Pecahan hasilTambah = pecahan1.tambah(pecahan2);
        Pecahan hasilKurang = pecahan1.kurang(pecahan2);
        Pecahan hasilKali = pecahan1.kali(pecahan2);
        Pecahan hasilBagi = pecahan1.bagi(pecahan2);

        System.out.println("Pecahan 1: " + pecahan1);
        System.out.println("Pecahan 2: " + pecahan2);
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);

        // Menguji operasi-operasi pada Matriks
        Pecahan[][] dataMatriks1 = {
                {new Pecahan(3, 9), new Pecahan(1, 3)},
                {new Pecahan(5, 3), new Pecahan(4, 6)}
        };
        Matriks matriks1 = new Matriks(dataMatriks1);

        Pecahan[][] dataMatriks2 = {
                {new Pecahan(8, 7), new Pecahan(4, 7)},
                {new Pecahan(1, 6), new Pecahan(6, 3)}
        };
        Matriks matriks2 = new Matriks(dataMatriks2);

        Matriks hasilTambahMatriks = matriks1.tambah(matriks2);
        Matriks hasilKurangMatriks = matriks1.kurang(matriks2);
        Matriks hasilDotMatriks = matriks1.kali(matriks2);
        Matriks hasilTransposisi = matriks1.transpose();

        System.out.println("Matriks 1:");
        System.out.println(matriks1);
        System.out.println("Matriks 2:");
        System.out.println(matriks2);
        System.out.println("Hasil Penjumlahan Matriks:");
        System.out.println(hasilTambahMatriks);
        System.out.println("Hasil Pengurangan Matriks:");
        System.out.println(hasilKurangMatriks);
        System.out.println("Hasil Perkalian Matriks:");
        System.out.println(hasilDotMatriks);
        System.out.println("Transposisi Matriks 1:");
        System.out.println(hasilTransposisi);
    }
}
