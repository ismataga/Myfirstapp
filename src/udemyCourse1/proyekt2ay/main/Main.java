package udemyCourse1.proyekt2ay.main;

import udemyCourse1.proyekt2ay.bean.Config;
import udemyCourse1.proyekt2ay.util.Menu;
import udemyCourse1.proyekt2ay.util.MenuUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        Config.initialize();
        MenuUtil.showMenu();
    }
}
