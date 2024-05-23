package tugas.polymorphism.soal1;

public class Segitiga extends GeometricObject {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    Segitiga(){
        sisi1 = 1.0;
        sisi2 = 1.0;
        sisi3 = 1.0;
    }
    
    public Segitiga(double sisi1, double sisi2, double sisi3){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }
    
    public double getSisi2() {
        return sisi2;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }
    
    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
    
    public double getArea() {
        double s = (sisi1 + sisi2 + sisi3) / 2.0;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
    
    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }
    
    @Override
    public String toString() {
        return "Segitiga: sisi 1 = " + sisi1 + " sisi 2 = " + sisi2 + " sisi 3 = " + sisi3;
    }
}


