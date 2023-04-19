package udemyCourse1.proyekt2ay.services.menu;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.bean.Student;
import udemyCourse1.proyekt2ay.bean.Teacher;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuShowStudentsServiceInter;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuShowTeachersServiceInter;

public class MenuShowTeacherService implements MenuShowTeachersServiceInter {
    @Override
    public void processLogic()  {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
        }
    }
}
