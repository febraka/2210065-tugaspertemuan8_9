package tugas.polymorphism.soal2;


public class TestPerson {
    
    public static void main(String[] args) {
        Person person = new Person("Febra Karunia Akbar", "Sukabumi", 
                "082310326187", "febraka0@gmail.com");
        Student student = new Student("Mufid", "Sukabumi", "089648130367", 
                "irsanmufid@gmail.com", Student.mahasiswaTahunKedua);
        
        MyDate tanggalKerja = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Dzikri", "Garut", "085216341632", 
                "dzikridzikir@gmail.com", "PT Cinta Sejati", 7000000, tanggalKerja);
        Faculty faculty = new Faculty("Raka", "Cirebon", "087747867296", 
                "rakaruby@gmail.com", "PT Durian Runtuh", 5000000, tanggalKerja, 6, "Direktur");
        Staff staff = new Staff("Yayas", "Cimahi", "082218584123", 
                "yayasboxing@gmail.com", "PT Aku Ultraman", 6000000, tanggalKerja, "Manager ");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
