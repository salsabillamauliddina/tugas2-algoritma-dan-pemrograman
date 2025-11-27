import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        // ! ini untuk menginput golongan berdasarkan inputan dari user 
        Scanner input = new Scanner(System.in);

        // ! membuat object dari class karyawan pada Karyawan.java
        Karyawan karyawan = new Karyawan();

        // ! panduan untuk user memasukkan golongan yaitu A/B/C
        System.out.print("Masukkan Golongan (A/B/C): ");
        // * .trim() dipakai saat user memasukkan spasi yang berlebih 
        karyawan.golongan = input.nextLine().trim();

        System.out.print("Masukkan Jam Lembur: ");
        // ? kondisi jika input bukan berupa angka, maka akan meminta user untuk mengisi dengan angka 
        while (!input.hasNextInt()) {
            System.out.print("Masukkan angka untuk jam lembur: ");
            input.next();
        }
        karyawan.jamLembur = input.nextInt();

        // ! untuk menentukan gaji pokok sesuai golongan 
        karyawan.setGajiPokok();
        // ! menentukan gaji lembur dengan jam * tarif perjamnya dan menghitung total 
        karyawan.hitungLembur();

        System.out.println("\n=== HASIL PERHITUNGAN TOTAL GAJI ===");
        System.out.println("Golongan        : " + karyawan.golongan);
        // * string format dipakai untuk memisahkan angka ribuan 
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.0f", karyawan.gajiPokok));
        System.out.println("Gaji Lembur     : Rp " + String.format("%,.0f", karyawan.gajiLembur));
        System.out.println("Total Penghasilan: Rp " + String.format("%,.0f", karyawan.totalGaji));

        input.close();
        // ! close inputan
    }
}
