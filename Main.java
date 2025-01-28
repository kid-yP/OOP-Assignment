import java.util.List; 
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        List<Doctor> doctors = new ArrayList<>(); 
        List<Patient> patients = new ArrayList<>(); 
        List<String> availableRooms = new ArrayList<>(); 
        String lastDoctorId = "D0"; // Track the last doctor ID 
        String lastPatientId = "P0"; // Track the last patient ID 
 
        // Initial data and welcome message 
        String hospitalName = "City Hospital"; 
        String hospitalDetails = "We provide the best healthcare services with highly skilled doctors."; 
 
        // Initialize available rooms 
        availableRooms.add("101"); 
        availableRooms.add("102"); 
        availableRooms.add("103"); 
        availableRooms.add("104"); 
 
        System.out.println("Welcome to " + hospitalName); 
        System.out.println(hospitalDetails); 
 
        // Adding initial doctor 
        doctors.add(new Doctor("D1", "Dr. Smith", "Cardiology", "Morning")); 
        doctors.add(new Doctor("D2", "Dr. Johnson", "Neurology", "Evening")); 
 
        // Main menu 
        boolean exit = false; 
        while (!exit) { 
            System.out.println("\n1. Add Doctor"); 
            System.out.println("2. Remove Doctor"); 
            System.out.println("3. Add Patient"); 
            System.out.println("4. Remove Patient"); 
            System.out.println("5. Assign Patient to Doctor"); 
            System.out.println("6. Release Patient"); 
            System.out.println("7. View All Doctors and Their Patients"); 
            System.out.println("8. Exit"); 
            System.out.print("Choose an option: "); 
            int choice = scanner.nextInt(); 
            scanner.nextLine(); // consume newline 
 
            switch (choice) { 
                case 1: 
                    // Add doctor 
                    System.out.println("Last Doctor ID: " + lastDoctorId); 
                    System.out.print("Enter new Doctor ID (e.g., D3, D4): "); 
                    String doctorId = scanner.nextLine(); 
                    if (isDoctorIdExist(doctors, doctorId)) { 
                        System.out.println("Doctor ID already exists. Try again."); 
                        break; 
                    } 
                    lastDoctorId = doctorId; 
                    System.out.print("Enter Doctor Name: "); 
                    String doctorName = scanner.nextLine(); 
                    System.out.print("Enter Department: "); 
                    String department = scanner.nextLine(); 
                    System.out.print("Enter Shift ID: "); 
                    String shiftId = scanner.nextLine(); 
                    Doctor newDoctor = new Doctor(doctorId, doctorName, department, shiftId); 
                    addDoctor(doctors, newDoctor); 
                    break; 
 
                case 2: 
                    // Remove doctor 
                    System.out.println("Last Doctor ID: " + lastDoctorId); 
                    System.out.print("Enter Doctor ID to remove: "); 
                    String doctorIdToRemove = scanner.nextLine(); 
                    Doctor doctorToRemove = findDoctorById(doctors, doctorIdToRemove); 
                    removeDoctor(doctors, doctorToRemove); 
                    break; 
 
                case 3: 
                    // Add patient 
                    System.out.println("Last Patient ID: " + lastPatientId); 
                    System.out.print("Enter new Patient ID (e.g., P3, P4): "); 
                    String patientId = scanner.nextLine(); 
                    if (isPatientIdExist(patients, patientId)) { 
                        System.out.println("Patient ID already exists. Try again."); 
                        break; 
                    } 
                    lastPatientId = patientId; 
                    System.out.print("Enter Patient Name: "); 
                    String patientName = scanner.nextLine();

K Y, [23/01/2025 03:56]
// Room selection 
                    System.out.println("Available Rooms: " + availableRooms); 
                    System.out.print("Choose a room: "); 
                    String roomNumber = scanner.nextLine(); 
                    if (!availableRooms.contains(roomNumber)) { 
                        System.out.println("Room is either unavailable or invalid. Try again."); 
                        break; 
                    } 
                    availableRooms.remove(roomNumber); // Remove room once assigned 
                    Patient newPatient = new Patient(patientId, patientName, roomNumber); 
                    addPatientToSystem(patients, newPatient); 
                    break; 
 
                case 4: 
                    // Remove patient 
                    System.out.println("Last Patient ID: " + lastPatientId); 
                    System.out.print("Enter Patient ID to remove: "); 
                    String patientIdToRemove = scanner.nextLine(); 
                    Patient patientToRemove = findPatientById(patients, patientIdToRemove); 
                    removePatientFromSystem(patients, patientToRemove); 
 
                    // Release room 
                    if (patientToRemove != null) { 
                        availableRooms.add(patientToRemove.getRoomNumber()); 
                        System.out.println("Room " + patientToRemove.getRoomNumber() + " is now available."); 
                    } 
                    break; 
 
                case 5: 
                    // Assign patient to doctor 
                    System.out.println("List of Doctors:"); 
                    displayDoctorsWithIdsAndDepartments(doctors); 
                    System.out.print("Enter Doctor ID to assign a patient: "); 
                    String doctorIdForPatient = scanner.nextLine(); 
                    Doctor doctorForPatient = findDoctorById(doctors, doctorIdForPatient); 
                    System.out.print("Enter Patient ID to assign: "); 
                    String patientIdForAssign = scanner.nextLine(); 
                    Patient patientForAssign = findPatientById(patients, patientIdForAssign); 
                    assignPatientToDoctor(doctorForPatient, patientForAssign); 
                    break; 
 
                case 6: 
                    // Release patient from doctor 
                    System.out.print("Enter Doctor ID to release a patient: "); 
                    String doctorIdForRemove = scanner.nextLine(); 
                    Doctor doctorForRemove = findDoctorById(doctors, doctorIdForRemove); 
                    System.out.print("Enter Patient ID to release: "); 
                    String patientIdForRemove = scanner.nextLine(); 
                    Patient patientForRemove = findPatientById(patients, patientIdForRemove); 
                    releasePatient(doctorForRemove, patientForRemove); 
                    break; 
 
                case 7: 
                    // View doctors and patients 
                    viewDoctorsAndPatients(doctors); 
                    break; 
 
                case 8: 
                    // Exit 
                    exit = true; 
                    break; 
 
                default: 
                    System.out.println("Invalid option. Please try again."); 
                    break; 
            } 
        } 
 
        scanner.close(); 
    } 
 
    // Add doctor to the list 
    public static void addDoctor(List<Doctor> doctors, Doctor doctor) { 
        doctors.add(doctor); 
        System.out.println("Doctor added: " + doctor.getDoctorName()); 
    } 
 
    // Remove doctor from the list 
    public static void removeDoctor(List<Doctor> doctors, Doctor doctor) { 
        doctors.remove(doctor); 
        System.out.println("Doctor removed: " + doctor.getDoctorName()); 
    } 
 
    // Add patient to the system 
    public static void addPatientToSystem(List<Patient> patients, Patient patient) { 
        patients.add(patient); 
        System.out.println("Patient added: " + patient.getPatientName()); 
    }

K Y, [23/01/2025 03:56]
// Remove patient from the system 
    public static void removePatientFromSystem(List<Patient> patients, Patient patient) { 
        patients.remove(patient); 
        System.out.println("Patient removed: " + patient.getPatientName()); 
    } 
 
    // Check if doctor ID exists 
    public static boolean isDoctorIdExist(List<Doctor> doctors, String doctorId) { 
        for (Doctor doctor : doctors) { 
            if (doctor.getDoctorId().equals(doctorId)) { 
                return true; 
            } 
        } 
        return false; 
    } 
 
    // Check if patient ID exists 
    public static boolean isPatientIdExist(List<Patient> patients, String patientId) { 
        for (Patient patient : patients) { 
            if (patient.getPatientId().equals(patientId)) { 
                return true; 
            } 
        } 
        return false; 
    } 
 
    // Find doctor by ID 
    public static Doctor findDoctorById(List<Doctor> doctors, String doctorId) { 
        for (Doctor doctor : doctors) { 
            if (doctor.getDoctorId().equals(doctorId)) { 
                return doctor; 
            } 
        } 
        System.out.println("Doctor not found."); 
        return null; 
    } 
 
    // Find patient by ID 
    public static Patient findPatientById(List<Patient> patients, String patientId) { 
        for (Patient patient : patients) { 
            if (patient.getPatientId().equals(patientId)) { 
                return patient; 
            } 
        } 
        System.out.println("Patient not found."); 
        return null; 
    } 
 
    // Assign patient to doctor 
    public static void assignPatientToDoctor(Doctor doctor, Patient patient) { 
        if (doctor != null && patient != null) { 
            doctor.addPatient(patient); 
            System.out.println("Assigned patient " + patient.getPatientName() + " to doctor " + doctor.getDoctorName()); 
        } 
    } 
 
    // Release patient from doctor 
    public static void releasePatient(Doctor doctor, Patient patient) { 
        if (doctor != null && patient != null) { 
            doctor.removePatient(patient); 
            System.out.println("Released patient " + patient.getPatientName() + " from doctor " + doctor.getDoctorName()); 
        } 
    } 
 
    // Display doctors with their IDs and departments 
    public static void displayDoctorsWithIdsAndDepartments(List<Doctor> doctors) { 
        for (Doctor doctor : doctors) { 
            System.out.println("Doctor ID: " + doctor.getDoctorId() + ", Department: " + doctor.getDepartment()); 
        } 
    } 
 
    // View all doctors and their patients 
    public static void viewDoctorsAndPatients(List<Doctor> doctors) { 
        for (Doctor doctor : doctors) { 
            System.out.println("Doctor: " + doctor.getDoctorName() + " (" + doctor.getDepartment() + ")"); 
            doctor.displayPatients(); 
        } 
    } 
}
