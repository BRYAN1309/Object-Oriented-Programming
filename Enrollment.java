public class Enrollment {
    private Student student;
    private Course course;
    private String dateEnrolled;

    public Enrollment() {}

    public Enrollment(Student student, Course course, String dateEnrolled) {
        this.student = student;
        this.course = course;
        this.dateEnrolled = dateEnrolled;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }
}
