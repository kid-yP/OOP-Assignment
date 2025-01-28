# OOP-Assignment
________________________________________
Hospital Management System Documentation
1. Introduction
The Hospital Management System (HMS) is a Java-based application designed to manage doctors, patients, and their interactions in a hospital setting. It allows users to:
•	Add, remove, and manage doctors and patients.
•	Assign and release patients from doctors.
•	Track patient room assignments.
•	View doctors and their assigned patients.
This documentation explains the system’s design, features, and usage.
________________________________________
2. System Design
The Hospital Management System consists of three main components:

Doctor: The class that represents a doctor, including personal details like name, department, and shift. A doctor can have a list of patients assigned to them.

Patient: The class representing a patient, including their personal details and room assignments.


Main: The entry point of the system where user interactions occur. It allows the user to add, remove, and assign doctors and patients and provides a menu interface.

________________________________________
3. Classes
Doctor Class
The Doctor class represents a doctor with the following attributes:
•	ID: A unique identifier for the doctor.
•	Name: The name of the doctor.
•	Department: The department the doctor belongs to (e.g., Cardiology, Neurology).
•	Shift: The working shift of the doctor (e.g., Morning, Night).
•	Patients: A list of patients assigned to the doctor.
Constructor
•	Doctor(int id, String name, String department, String shift): Initializes a new doctor with the given ID, name, department, and shift.
Methods
•	addPatient(Patient patient): Adds a patient to the doctor's list of assigned patients.
•	removePatient(Patient patient): Removes a patient from the doctor's list of assigned patients.
•	displayPatients(): Displays all the patients assigned to the doctor.
Patient Class
The Patient class represents a patient with the following attributes:
•	ID: A unique identifier for the patient.
•	Name: The name of the patient.
•	RoomNumber: The room number where the patient is assigned.
•	AssignedDoctor: The doctor who is assigned to the patient.
Constructor
•	Patient(int id, String name, int roomNumber): Initializes a new patient with the given ID, name, and room number.
Methods
•	assignDoctor(Doctor doctor): Assigns a doctor to the patient.
•	releaseDoctor(): Releases the patient from the assigned doctor’s care.
Main Class
The Main class contains the main logic of the application. It is responsible for handling user input, managing doctors and patients, and displaying relevant information.
Main Methods
•	addDoctor(List<Doctor> doctors, Doctor doctor): Adds a new doctor to the list of doctors.
•	removeDoctor(List<Doctor> doctors, Doctor doctor): Removes a doctor from the list of doctors.
•	addPatientToSystem(List<Patient> patients, Patient patient): Adds a new patient to the system.
•	removePatientFromSystem(List<Patient> patients, Patient patient): Removes a patient from the system and frees their room.
•	assignPatientToDoctor(Doctor doctor, Patient patient): Assigns a patient to a doctor.
•	releasePatient(Doctor doctor, Patient patient): Releases a patient from a doctor's care and frees their room.
•	displayDoctorsWithIdsAndDepartments(List<Doctor> doctors): Displays a list of doctors along with their IDs and departments.
•	viewDoctorsAndPatients(List<Doctor> doctors): Displays all doctors and their assigned patients.
________________________________________
4. Features
1. Add Doctor
•	Allows the user to input details for a new doctor: ID, name, department, and shift.
•	Adds the doctor to the system.
2. Remove Doctor
•	Allows the user to remove an existing doctor from the system by specifying the doctor's ID.
•	Removes the doctor and their list of assigned patients.
3. Add Patient
•	Allows the user to input details for a new patient: ID, name, and room number.
•	Assigns a room from the list of available rooms and adds the patient to the system.
4. Remove Patient
•	Allows the user to remove a patient from the system and free the room that the patient was assigned to.
5. Assign Patient to Doctor
•	Allows the user to assign a patient to a specific doctor by specifying the patient ID and doctor ID.
•	The patient is added to the doctor’s list of assigned patients.
6. Release Patient from Doctor
•	Releases a patient from a doctor’s care.
•	The patient is removed from the doctor’s list, and the patient’s room is freed.
7. View All Doctors and Their Patients
•	Displays a list of all doctors and the patients assigned to them.
•	The doctor’s details and a list of patients they are caring for are displayed.
________________________________________
5. User Interface
The program provides a text-based menu to the user with the following options:
1. Add Doctor
2. Remove Doctor
3. Add Patient
4. Remove Patient
5. Assign Patient to Doctor
6. Release Patient
7. View All Doctors and Their Patients
8. Exit
The user can select an option by entering the corresponding number. The program will then prompt the user to enter the necessary details (e.g., ID, name, room number) and proceed with the selected action.
________________________________________
6. Example Workflow
Example 1: Add a Doctor
1.	User selects option 1 (Add Doctor).
2.	The system prompts for the doctor’s ID, name, department, and shift.
3.	The system adds the doctor to the list of doctors.
Example 2: Add a Patient
1.	User selects option 3 (Add Patient).
2.	The system prompts for the patient’s ID, name, and room number.
3.	The system assigns the patient to a room and adds them to the system.
Example 3: Assign Patient to Doctor
1.	User selects option 5 (Assign Patient to Doctor).
2.	The system prompts for the doctor’s ID and patient’s ID.
3.	The system assigns the patient to the selected doctor.
Example 4: View Doctors and Patients
1.	User selects option 7 (View All Doctors and Their Patients).
2.	The system displays all doctors and their assigned patients.
________________________________________
7. Future Enhancements
The system could be enhanced in the following ways:
•	Room Management: Extend room functionality by tracking different room types (e.g., ICU, regular, emergency).
•	Data Persistence: Implement functionality to save and load data from a file or database.
•	Error Handling: Improve error handling to cover more edge cases and user input validation.
•	Graphical User Interface (GUI): Implement a GUI for easier user interaction using frameworks like JavaFX or Swing.
________________________________________
8. License
This project is open-source and available under the MIT License.
