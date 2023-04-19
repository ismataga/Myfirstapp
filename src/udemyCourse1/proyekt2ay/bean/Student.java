package udemyCourse1.proyekt2ay.bean;

import udemyCourse1.proyekt2ay.bean.Person;

public class Student extends Person {
    private String schoolName;
    private double scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return
                "schoolName='" + schoolName +
                ", scholarship=" + scholarship;
    }
}
