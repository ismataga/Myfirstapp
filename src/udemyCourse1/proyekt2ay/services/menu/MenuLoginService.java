package udemyCourse1.proyekt2ay.services.menu;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.serviceMenuInter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username: ");
        String  username = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("password: ");
        String  password = scanner2.nextLine();

        if(!(username.equals("user")&&password.equals("11111"))){
            throw new IllegalArgumentException("username or password is invalid.");
        }
        Config.setLoggedIn(true);
    }

    @Override
    public void process() {

    }
}
