package udemyCourse1.proyekt2ay.bean;
public class Teacher extends Person {
    private String schoolName;
    private double salary;
    private Teacher[]teachers;



    @BoshOlmasin
    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


}
