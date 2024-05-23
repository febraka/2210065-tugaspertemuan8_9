package tugas.polymorphism.soal2;

public class Staff extends Employee {
    private final String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalKerja, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalKerja);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGelar: " + gelar;
    }
}
