package HospitalProject;

public class Main {

    public static void main(String[] args) {

        // Set Doctor İnformation
        Doctor doctor1 = new Doctor();

        doctor1.setFirstName("Muhammet");
        doctor1.setLastName("YILDIRIM");
        doctor1.setAge(26);
        doctor1.setGender("Male");
        doctor1.setProfession("Heart Surgery");
        doctor1.setPoliclinic("Surgery Policlinic");
        doctor1.setTitle("Proffessor Dr.");
        doctor1.setIdentificationNumber(1345678911);

        // Set Nurse İnformation
        Nurse nurse1 = new Nurse();

        nurse1.setFirstName("Hemşire");
        nurse1.setLastName("Görevli");
        nurse1.setAge(35);
        nurse1.setIdentificationNumber(1234444444);
        nurse1.setPoliclinic("Surgery Policlinic");
        nurse1.setGender("Male");
        nurse1.setPlaceOfDuty("Doctor Room");
        nurse1.setTitle("Veteran");

        // Set Patient İnformation
        Patient patient1 = new Patient();

        patient1.setFirstName("Kara");
        patient1.setLastName("Dayı");
        patient1.setAge(45);
        patient1.setGender("Male");
        patient1.setIdentificationNumber(555421235);
        patient1.setRowNumber(1);
        patient1.setEmergenyStation("Red");

        People[] people = { doctor1, nurse1, patient1 };
        for (People peoples : people) {
            System.out.println(doctor1.getTitle() + " " + doctor1.getFirstName() + " " + doctor1.getLastName() + "\n"
                    + doctor1.getPoliclinic() + " " + doctor1.getProfession());
            System.out.println(nurse1.getTitle() + " " + nurse1.getFirstName() + " " + nurse1.getLastName() + "\n"
                    + nurse1.getPoliclinic() + " " + nurse1.getPlaceOfDuty());
            System.out.println(patient1.getEmergenyStation() + " " + patient1.getFirstName() + " "
                    + patient1.getLastName() + patient1.getRowNumber());
        }

    }

}
