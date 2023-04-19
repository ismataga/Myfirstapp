package udemyCourse1.proyekt2ay.serviceMenuInter;

import udemyCourse1.proyekt2ay.bean.Config;

public interface  MenuService {
    public abstract  void processLogic();
    public default void process(){
        processLogic();

    }
}
