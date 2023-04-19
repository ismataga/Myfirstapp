package udemyCourse1.proyekt2ay.services.menu;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.bean.Teacher;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuAddTeacherServiceInter;
import udemyCourse1.proyekt2ay.serviceMenuInter.SaveableMenuService;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter, SaveableMenuService {
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sname: ");

        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter surname: ");

        String surname = scanner2.nextLine();

        Teacher t =new Teacher();
        t.setName("name");
        t.setSurname("surname");


        Config.instance().appendTeachers(t);
        System.out.println("Teacher added: ");

    }

    @Override
    public void process() {

    }
}
