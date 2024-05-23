package tugas.polymorphism.soal2;

public class Person {
    private final String nama;
    private final String alamat;
    private final String nomorTelepon;
    private final String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "\nNama: " + nama + "\nAlamat: " + alamat + 
                "\nTelepon: " + nomorTelepon + "\nEmail: " + email;
    }
}