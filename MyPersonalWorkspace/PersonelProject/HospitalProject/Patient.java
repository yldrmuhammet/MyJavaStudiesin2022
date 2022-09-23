package HospitalProject;

public class Patient extends People {

    private String complaint;
    private int rowNumber;
    private String emergenyStation;

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

 
    public String getEmergenyStation() {
        return emergenyStation;
    }

    public void setEmergenyStation(String emergenyStation) {
        this.emergenyStation = emergenyStation;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

}