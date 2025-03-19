public class Assessment {
    private String assessmentID;
    private String title;
    private String date;
    private int totalMarks;

    public Assessment() {}

    public Assessment(String assessmentID, String title, String date, int totalMarks) {
        this.assessmentID = assessmentID;
        this.title = title;
        this.date = date;
        this.totalMarks = totalMarks;
    }

    public String getAssessmentID() {
        return assessmentID;
    }

    public void setAssessmentID(String assessmentID) {
        this.assessmentID = assessmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
