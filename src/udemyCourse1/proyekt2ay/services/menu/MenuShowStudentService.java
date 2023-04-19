package udemyCourse1.proyekt2ay.services.menu;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.bean.Student;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processLogic()  {
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }
    }
}
