package KeyWordAndInstanceOperatorLevel1;
public class VehicleRegistration {
    static int registrationFee = 1000;
     String ownerNmae; 
     String vehicalType;
     final int  registrationNumber;
    public VehicleRegistration(String ownerNmae, String vehicalType, int registrationNumber) {
        this.ownerNmae = ownerNmae;
        this.vehicalType = vehicalType;
        this.registrationNumber = registrationNumber;
    }
    public void displayVehicleDetails(){
        if(this instanceof VehicleRegistration){
        System.out.println("Owner Name: " + ownerNmae);
        System.out.println("Vehical Type: " + vehicalType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}
    public void updateRegistrationFee(double newFee){
        registrationFee = (int) newFee;
    }
    public static void main(String []args){
        VehicleRegistration vehicle1 = new VehicleRegistration("Vishal", "Car", 1234);
        vehicle1.displayVehicleDetails();
        vehicle1.updateRegistrationFee(1500.0);
        vehicle1.displayVehicleDetails();
    }
}
