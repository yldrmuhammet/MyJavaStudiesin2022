package SchoolProject;

public class Teacher extends User {

    private String uzmanlıkDerecesi;
    private String fakulteIsmi;

    public String getUzmanlıkDerecesi() {
        return uzmanlıkDerecesi;
    }

    public void setUzmanlıkDerecesi(String uzmanlıkDerecesi) {
        this.uzmanlıkDerecesi = uzmanlıkDerecesi;
    }

    public String getFakulteIsmi() {
        return fakulteIsmi;
    }

    public void setFakulteIsmi(String fakulteIsmi) {
        this.fakulteIsmi = fakulteIsmi;
    }

}
