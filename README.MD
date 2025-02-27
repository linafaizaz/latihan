public class latihan {} : untuk mendeklarasikan sebuah kelas.
public static void main(String[] args) {} : untuk menjalankan sebuah program java.
  // deklrasi dan inisialisasi
int[] number = new int[5]; : untuk menginisialisasi 5 elemen.

// Soal no 1
for (int i = 0; i < number.length; i++) {} : untuk mengulang setiap elemen dalam array "number" sebanyak 5 kali.
System.out.print(number[i]+" "); : mencetak nilai elemen array number.
System.out.println(" ") : mencetak baris().

// Soal no 2
System.out.println("\nSoal no 2"); : mencetak teks "Soal no 2".
for (int i = 0; i < number.length; i++) {} : mengulang proses setiap elemen dalam array number.
System.out.print(number[i]); : mencetak nilai elemen array number.
if (i<4) {} : mengecek kondisi nilai variabel "i" kurang dari 4.
System.out.print(","); : mencetak pada(",").
System.out.println(""); : mencetak baris baru kedalam layar.

// Soal no 3
System.out.println("\nSoal no 3"); : mencetak teks "Soal no 3".
for (int i = 0; i < number.length; i++) {} : mengulang proses untuk setiap elemen dalam array, dari indeks 0 hingga terakhir.
if (i%2==0) {} : Mengecek kondisi apakah nilai variabel "i" habis dibagi 2 yang berarti "i" adalah bilangan genap.
System.out.print(number[i]);  : mencetak nilai number pada indeks i.
if (i<4) {} : mengecek nilai variabel i apakah kurang dari 4.
System.out.print(","); : mencetak pada(",").
System.out.println(""); :mencetak baris baru kedalam layar.

// Soal no 4
System.out.println("\nSoal no 4"); : mencetak teks "Soal no 3".
for (int i = 4; i > -1; i--) {} :Mengulang proses dari i = 4 hingga i = 0 dengan penurunan nilai i.
if (i%2==0) {} : Mengecek nilai variabel "i" habis dibagi 2, yang berarti "i" adalah bilangan genap. 
System.out.print(+number[i]); : mencetak nilai number pada indeks i.
if (i>1) {} : mencetak variabel i apakah lebih besar dari 1.
System.out.print(","); : mencetak pada(",").
System.out.println(""); :mencetak baris baru kedalam layar.

// Soal no 5
System.out.println("\nSoal no 5"); : mencetak teks "Soal no 5".
for (int i = 0; i < number.length; i++) {} : mengulang proses untuk setiap elemen dalam array "number", dari indeks 0 hingga indeks terakhir.
if (i%2==0) {} : Mengecek nilai variabel "i" habis dibagi 2, yang berarti "i" adalah bilangan genap. 
System.out.print(+number[i]);  : mencetak nilai number pada indeks i.
if (i<2) {} : mencetak nilai variabel i kurang dari 2.
System.out.print(","); : mencetak pada (",");
System.out.println(""); : mencetak baris baru kedalam layar.

// Soal no 6
System.out.println("\nSoal no 6"); : mencetak teks "Soal no 6".
for (int i = 0; i <number.length; i++) {} : mencetak setiap elemen pada array number, dari indeks 0 hingga terakhir.
if (i== 1) {} : : mengecek apakah indeks i=1, jika sudah makan kode if dijalankan.
System.out.print(number[0] + " "); : mencetak nilai number 0.
else if (i == 3) {} : mengecek kondisi nilai variabel i=3.
System.out.print(number[1] + " "); : mencetak nilai number 1.
else {} : menjalankan pada sebuah kode jika kode sebelumnya (if, else if)tidak terpenuhi.
System.out.print(number[i] + " ");  : mencetak nilai elemen array number.
if (i< number.length - 1) {} : mengecek kondisi apakah nilai variabel "i" kurang dari panjang array "number" minus 1.
System.out.print(","); : mencetak pada (")





