public class Karyawan {
    //* ATRIBUT TIAP KARYAWAN  */
    public String golongan;
    public int jamLembur;
    public double gajiPokok;
    public double gajiLembur;
    public double totalGaji;

    // * METHOD / FUNCTION UNTUK MENENTUKAN GAJI POKOK TIAP KARYAWAN 
    public void setGajiPokok() {
        // ! UNTUK INPUTAN JIKA GOLONGAN null ATAU empty string
        if (golongan == null || golongan == "") {
            gajiPokok = 0;
            return;
        }
        // ! EqualsIgnoreCase digunakan untuk menyamakan inputan kapital atau tidak 
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000;
        } else {
            gajiPokok = 0;
        }
    }

    // * METHOD / FUNCTION UNTUK PERHITUNGAN UANG LEMBUR 
    public void hitungLembur() {
        // ! memakai double untuk perhitungan desimal, disini saya memilih desimal bukan persen
        double persen = 0.0;

        if (jamLembur <= 0) {
            persen = 0.0;
        } else if (jamLembur == 1) {
            persen = 0.30;
        } else if (jamLembur == 2) {
            persen = 0.32;
        } else if (jamLembur == 3) {
            persen = 0.34;
        } else if (jamLembur == 4) {
            persen = 0.36;
        } else if (jamLembur >= 5) {
            persen = 0.38;
        }

        // ? perhitungan untuk gaji lembur dan total gajinya 
        gajiLembur = gajiPokok * persen;
        totalGaji = gajiPokok + gajiLembur;
    }
}