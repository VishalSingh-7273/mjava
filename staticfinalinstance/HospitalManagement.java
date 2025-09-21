package KeyWordAndInstanceOperatorLevel1;

public class HospitalManagement {
    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;
    String name;
    String ailment;
    final int patientId;
    int age;
    public HospitalManagement(String name, int age, String ailment,int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }
    public static void getTotalPatients(){
        System.out.println("Total patients are "+totalPatients);
    }
    public void display(){
        if(this instanceof HospitalManagement){
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient Id: " + patientId);
    }
}
    public static void main(String []args){
        HospitalManagement h1 = new HospitalManagement("Rakesh", 25, "Cancer", 1);
        HospitalManagement h2 = new HospitalManagement("Jaani", 30, "Diabetes", 2);  

        h1.display();
        h2.display();

        HospitalManagement.getTotalPatients();

    }
}
