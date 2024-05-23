package tugas.polymorphism.soal1;


public class GeometricObject {
    private String warna = "putih";
    private boolean filled;
    
    public GeometricObject(){    
    }
    
    public GeometricObject(String warna, boolean filled){
          this.warna = warna;
          this.filled = filled;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "warna : " + warna + "filled : " + filled;
    }
}
