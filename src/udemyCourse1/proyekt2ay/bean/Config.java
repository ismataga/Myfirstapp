package udemyCourse1.proyekt2ay.bean;

import udemyCourse1.proyekt2ay.util.FileUtility;

import java.io.Serializable;

public class Config implements Serializable {
    private  static Config config =null;
    private Student[] students = new Student[0];
    private Teacher[] teachers =new Teacher[0];
    private static boolean loggedIn;

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }


    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Config instance(){//singleton pattern
        if(config==null){
            config =new Config();
        }

        return config;
    }

    public static void initialize() {
       Object obj =  FileUtility.readFileDeserialize("app.obj");
       if(obj == null){
           return;
       }
       if(obj instanceof  Config){
           config = (Config)obj;
       }
    }
    public static void save(){
        FileUtility.writeObjectToFile(Config.instance(),"app.obj");
    }

    public void appendStudent(Student s){
        Student[] newStudent = new Student[students.length +1];
        for (int i = 0; i < students.length; i++) {
            newStudent[i] =students[i];
        }
        newStudent[newStudent.length-1] =s;
        students =newStudent;
    }
    public void appendTeachers(Teacher s){
        Teacher[] newTeacher = new Teacher[students.length +1];
        for (int i = 0; i < teachers.length; i++) {
            newTeacher[i] =teachers[i];
        }
        newTeacher[newTeacher.length-1] =s;
        teachers =newTeacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
