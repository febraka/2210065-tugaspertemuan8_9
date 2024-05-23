package tugas.polymorphism.soal2;

public class Employee extends Person {
    private final String kantor;
    private final double gaji;
    private final MyDate tanggalKerja;

    public Employee(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalKerja) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalKerja = tanggalKerja;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKantor: " + kantor + "\nGaji: " + gaji + 
                "\nTanggal Dipekerjakan: " + tanggalKerja;
    }
}
