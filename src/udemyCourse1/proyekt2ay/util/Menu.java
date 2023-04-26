package udemyCourse1.proyekt2ay.util;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.services.menu.*;
import udemyCourse1.proyekt2ay.serviceIinter.Process;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teachers", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add students", new MenuAddStudentService()),
    SHOW_ALL_TEACHERS(5, "Show all teachers", new MenuShowStudentService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowTeacherService()),
    UNKNOWN;


    private int nums;
    private String label;
    private Process service;

    Menu(int nums, String label, Process service) {
        this.nums = nums;
        this.label = label;
        this.service = service;
    }

    Menu() {

    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Process getService() {
        return service;
    }

    public void setService(Process service) {
        this.service = service;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }


    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return nums + "." + label;
    }

    public void process() {

        service.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int nums) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNums() == nums) {
                return menus[i];
            }
        }
        return UNKNOWN;

    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}

