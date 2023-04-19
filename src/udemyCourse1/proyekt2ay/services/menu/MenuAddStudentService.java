package udemyCourse1.proyekt2ay.services.menu;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.bean.Student;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuAddStudentServiceInter;

import java.util.Scanner;

import udemyCourse1.proyekt2ay.serviceMenuInter.SaveableMenuService;

public class MenuAddStudentService implements MenuAddStudentServiceInter  {

    @Override
    public void processLogic() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter surname: ");
        Scanner scanner2 = new Scanner(System.in);
        String surname = scanner2.nextLine();

        Student s =new Student();
        s.setName("name");
        s.setSurname("surname");


        Config.instance().appendStudent(s);
        System.out.println("Student added: ");

    }


}
