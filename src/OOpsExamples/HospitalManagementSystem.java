package OOpsExamples;

class Patient {
	String name;
	String disease;
	String doctorAssigned;
	long bill;
	Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }
	public String getDoctorAssigned() {
		return doctorAssigned;
	}
	public void setDoctorAssigned(String doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}
	public long getBill() {
		return bill;
	}
	public void setBill(long bill) {
		this.bill = bill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", disease=" + disease + ", doctorAssigned=" + doctorAssigned + ", bill="
				+ bill + "]";
	}
	
}

class Doctor {
	String speciality;
	String name;
	Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }
	public String getDisease() {
		return speciality;
	}
	public void setDisease(String disease) {
		this.speciality = disease;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Appointment {
	int appointmentNumber;
	Doctor doctor;
	Patient patient;
	
	Appointment (Doctor [] doctors, Patient patient, int number) {
		for(Doctor d:doctors) {
			if(d.speciality.equals(patient.disease)) {
				this.doctor = d;
			}
		}
		this.patient = patient;
		this.appointmentNumber = number;
		}
	
	void DisplayAppointments () {
		System.out.println("\nNumber: " + appointmentNumber);
		System.out.println("Health Issue : " + patient.disease);
		System.out.println("Patient Name : " + patient.name);
		System.out.println("Assigned Doctor : " + doctor.name);
	}
	
	@Override
	public String toString() {
		return "Appointment [appointmentNumber=" + appointmentNumber + ", patientName=" + patient.name + ", doctorName="
				+ doctor.name + "]";
	}

}

public class HospitalManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor [] doctors = new Doctor[3];
		doctors[0] = new Doctor("Dr. Khan","Heart");
		doctors[1] = new Doctor("Dr. Saxena","lungs");
		doctors[2] = new Doctor("Dr. Srivastava","eyes");
		
		Patient [] patients = new Patient[2];
		patients[0] = new Patient("Kyle Wong","lungs");
		patients[1] = new Patient("April Newton","eyes");
		
		
		Appointment [] appointments = new Appointment[2];
		for(int i=0; i<appointments.length; i++) {
			appointments[i] = new Appointment(doctors, patients[i],i+1);
		}
		
		System.out.println("Appointment Details:");
		for(Appointment i:appointments) {
			i.DisplayAppointments();
		}

	}

}
