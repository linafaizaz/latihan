public class PerkalianMatriks {

    public static void main(String[] args) {
        int[][] matriks1 = {
            {4, 5},
            {7, 8}
        };

        int[][] matriks2 = {
            {7, 6},
            {2, 8}
        };

        int[][] hasilKali = perkalianMatriks(matriks1, matriks2);

        System.out.println("Hasil Perkalian Matriks:");
        cetakMatriks(hasilKali);
    }

    public static int[][] perkalianMatriks(int[][] matriks1, int[][] matriks2) {
        int baris1 = matriks1.length;
        int kolom1 = matriks1[0].length;
        int kolom2 = matriks2[0].length;
        int[][] hasil = new int[baris1][kolom2];

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }

        return hasil;
    }

    public static void cetakMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}