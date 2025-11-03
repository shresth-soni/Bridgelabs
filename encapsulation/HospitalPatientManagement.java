interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private String medicalRecord;

    public InPatient(int id, String name, int age, double roomCharge) {
        super(id, name, age);
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() {
        return roomCharge + 2000;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalRecord;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Rahul", 35, 5000),
            new OutPatient(2, "Sneha", 28, 800)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            ((MedicalRecord)p).addRecord("Diagnosis: Flu");
            ((MedicalRecord)p).viewRecords();
            System.out.println("-------------------");
        }
    }
}
