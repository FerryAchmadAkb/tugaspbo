package matriks;
import pecahan.Pecahan;

public class Matriks {
    private Pecahan[][] data;

    public Matriks(Pecahan[][] data) {
        this.data = data;
    }

    // Metode untuk penjumlahan matriks
    public Matriks tambah(Matriks other) {
        int numRows = data.length;
        int numCols = data[0].length;

        if (numRows != other.data.length || numCols != other.data[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki ukuran yang sama untuk ditambahkan.");
        }

        Pecahan[][] result = new Pecahan[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = data[i][j].tambah(other.data[i][j]);
            }
        }

        return new Matriks(result);
    }

    // Metode untuk pengurangan matriks
    public Matriks kurang(Matriks other) {
        int numRows = data.length;
        int numCols = data[0].length;

        if (numRows != other.data.length || numCols != other.data[0].length) {
            throw new IllegalArgumentException("Matriks harus memiliki ukuran yang sama untuk dikurangkan.");
        }

        Pecahan[][] result = new Pecahan[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = data[i][j].kurang(other.data[i][j]);
            }
        }

        return new Matriks(result);
    }

    // Metode untuk perkalian matriks
    public Matriks kali(Matriks other) {
        int numRows1 = data.length;
        int numCols1 = data[0].length;
        int numRows2 = other.data.length;
        int numCols2 = other.data[0].length;

        if (numCols1 != numRows2) {
            throw new IllegalArgumentException("Jumlah kolom pada matriks pertama harus sama dengan jumlah baris pada matriks kedua.");
        }

        Pecahan[][] result = new Pecahan[numRows1][numCols2];

        for (int i = 0; i < numRows1; i++) {
            for (int j = 0; j < numCols2; j++) {
                Pecahan sum = new Pecahan(0, 1);
                for (int k = 0; k < numCols1; k++) {
                    sum = sum.tambah(data[i][k].kali(other.data[k][j]));
                }
                result[i][j] = sum;
            }
        }

        return new Matriks(result);
    }

    // Metode untuk transpose matriks
    public Matriks transpose() {
        int numRows = data.length;
        int numCols = data[0].length;
        Pecahan[][] result = new Pecahan[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[j][i] = data[i][j];
            }
        }

        return new Matriks(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pecahan[] row : data) {
            for (Pecahan elem : row) {
                sb.append(elem.toString()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
