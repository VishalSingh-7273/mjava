package EncapsulationInterface;

import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int daysAdmitted;
    private List<String> records;

    public InPatient(String patientId, String name, int age, String diagnosis, double roomChargePerDay, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

public class HospitalSystem {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Bill: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }
    
    }

    public static void main(String[] args) {
        InPatient p1 = new InPatient("P101", "Nikhil", 30, "Pneumonia", 2000, 5);
        p1.addRecord("X-Ray done");
        p1.addRecord("Antibiotics prescribed");

        OutPatient p2 = new OutPatient("P202", "Rohit", 25, "Fever", 500);
        p2.addRecord("Blood Test done");
        p2.addRecord("Paracetamol prescribed");

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            processPatient(p);
        }
    }
}
