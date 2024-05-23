package tugas.polymorphism.soal2;

public class MyDate {
   private final int tahun;
    private final int bulan;
    private final int hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + hari;
    } 
}
