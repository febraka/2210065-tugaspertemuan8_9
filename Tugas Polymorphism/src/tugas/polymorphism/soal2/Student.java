package tugas.polymorphism.soal2;

public class Student extends Person {
     public static final String mahasiswaBaru = "Mahasiswa Baru";
    public static final String mahasiswaTahunKedua = "Mahasiswa Tahun Kedua";
    public static final String junior = "Junior";
    public static final String senior = "Senior";

    private final String status;

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}
