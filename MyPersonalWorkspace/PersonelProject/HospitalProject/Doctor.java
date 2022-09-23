package HospitalProject;

public class Doctor extends People {

    private String policlinic;
    private String profession;
    private String title;

    public String getPoliclinic() {
        return policlinic;
    }

    public void setPoliclinic(String policlinic) {
        this.policlinic = policlinic;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}