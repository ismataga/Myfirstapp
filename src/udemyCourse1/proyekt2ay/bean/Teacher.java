package udemyCourse1.proyekt2ay.bean;

import udemyCourse1.proyekt2ay.bean.Person;

import java.util.Arrays;

public class Teacher extends Person {
    private String schoolName;
    private double salary;
    private Teacher[]teachers;

//    public Teacher(String name, String surname, int age, String schoolName, double salary, Teacher[] teachers) {
//        super(name, surname, age);
//        this.schoolName = schoolName;
//        this.salary = salary;
//        this.teachers = teachers;
//    }



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

    @Override
    public String toString() {
        return
                "schoolName='" + schoolName + '\'' +
                ", salary=" + salary +
                ", teachers=" + Arrays.toString(teachers);
    }
}
