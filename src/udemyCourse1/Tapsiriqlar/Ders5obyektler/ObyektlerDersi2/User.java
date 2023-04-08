package udemyCourse1.Tapsiriqlar.Ders5obyektler.ObyektlerDersi2;

public class User {

    public String name;
    public String surname;
    public int age;
    public static int objectCount = 0;

    public User() {
        this.name = "name is un defined";
        this.surname = "surname is undifined";
        this.age = -1;
        this.obyektiYaradanadameniMutleqCagir();
        objectCount++;
    }
    public User(String name, String surname, int age){
        System.out.println("user parametirlerleri ile yaradıildi");
        this.name = name;
        this.surname = surname;
        this.age =age;
    }

    public void obyektiYaradanadameniMutleqCagir(){
        System.out.println("men burda cox vacib ish gorecem");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
