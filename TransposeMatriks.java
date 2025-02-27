public class TransposeMatriks {

    public static void main(String[] args) {
        int[][] matriks = {
            {6, 7, 5},
            {5, 4, 3}
        };

        int[][] hasilTranspose = transposeMatriks(matriks);

        System.out.println("Hasil Transpose Matriks:");
        cetakMatriks(hasilTranspose);
    }

    public static int[][] transposeMatriks(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        int[][] hasil = new int[kolom][baris];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matriks[i][j];
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