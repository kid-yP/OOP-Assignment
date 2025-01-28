public class Patient { 
    private String patientId; 
    private String patientName; 
    private String roomNumber; 
 
    // Constructor 
    public Patient(String patientId, String patientName, String roomNumber) { 
        this.patientId = patientId; 
        this.patientName = patientName; 
        this.roomNumber = roomNumber; 
    } 
 
    // Getters and Setters 
    public String getPatientId() { 
        return patientId; 
    } 
 
    public String getPatientName() { 
        return patientName; 
    } 
 
    public String getRoomNumber() { 
        return roomNumber; 
    } 
}
