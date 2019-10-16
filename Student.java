public class Student extends Person {
    private String id;
    private String schoolYear;
    private String major;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public void display() {
        System.out.println(getFirstName() + " " + getLastName() + " year is " + getSchoolYear() + " and major is " + getMajor());
    }
}
