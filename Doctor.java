package com; 

import java.util.ArrayList; 
import java.util.List; 
 
public class Doctor extends Staff { 
    private String doctorId; 
    private String doctorName; 
    private String department; 
    private String shiftId; 
    private List<Patient> patients; // List to store assigned patients 
 
    public Doctor(String doctorId, String doctorName, String department, String shiftId) { 
        this.doctorId = doctorId; 
        this.doctorName = doctorName; 
        this.department = department; 
        this.shiftId = shiftId; 
        this.patients = new ArrayList<>(); 
    } 
 
    // Getters and setters 
    public String getDoctorId() { 
        return doctorId; 
    } 
 
    public String getDoctorName() { 
        return doctorName; 
    } 
 
    public String getDepartment() { 
        return department; 
    } 
 
    public String getShiftId() { 
        return shiftId; 
    } 
 
    public List<Patient> getPatients() { 
        return patients; 
    } 
 
    // Add patient to the doctor 
    public void addPatient(Patient patient) { 
        patients.add(patient); 
    } 
 
    // Remove patient from the doctor 
    public void removePatient(Patient patient) { 
        patients.remove(patient); 
    } 
 
    // Method to display the list of patients assigned to the doctor 
    public void displayPatients() { 
        if (patients.isEmpty()) { 
            System.out.println("No patients assigned."); 
        } else { 
            System.out.println("Patients assigned to " + doctorName + ":"); 
            for (Patient patient : patients) { 
                System.out.println("Patient ID: " + patient.getPatientId() + ", Name: " + patient.getPatientName()); 
            } 
        } 
    } 
}
