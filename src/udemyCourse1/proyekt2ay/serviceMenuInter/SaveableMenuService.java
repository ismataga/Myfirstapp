package udemyCourse1.proyekt2ay.serviceMenuInter;

import udemyCourse1.proyekt2ay.bean.Config;

public interface SaveableMenuService extends MenuService{
    public default void process(){
        processLogic();
        Config.save();
    }


}
