package HospitalProject;

public class Nurse extends People {

    private String policlinic;
    private String title;
    private String placeOfDuty;

    public String getPoliclinic() {
        return policlinic;
    }

    public void setPoliclinic(String policlinic) {
        this.policlinic = policlinic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaceOfDuty() {
        return placeOfDuty;
    }

    public void setPlaceOfDuty(String placeOfDuty) {
        this.placeOfDuty = placeOfDuty;
    }

}