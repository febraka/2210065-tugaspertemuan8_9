package tugas.polymorphism.soal2;

public class Faculty extends Employee {
    private final int jamKerja;
    private final String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalKerja, int jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalKerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}
