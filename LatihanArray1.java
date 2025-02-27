public class LatihanArray1 {

    public static void main(String[] args) {

        // buat program untuk :  
        // 1. membuat array dengan 10 bilangan bulat 
        // 2. mengisi array dengan bilangan genap mulai  dari 2
        // 3. menampilkan isi array
        // 4. menghitung jumlah semua elemen array

        int [] bilanganGenap = new int[10];
        int jumlah = 0;

       
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }

       
        System.out.println("isi array : ");
        for (int bilangan : bilanganGenap) {
            System.out.print(bilangan + " ");
            jumlah += bilangan;
        }

        System.out.println("\nJumlah semua elemen : " + jumlah);
    }
}