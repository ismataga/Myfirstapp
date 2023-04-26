package udemyCourse1.proyekt2ay.serviceIinter;

import udemyCourse1.proyekt2ay.bean.Config;

public interface SaveableProcess extends Process {
    public default void process(){
        processLogic();
        Config.save();
    }


}
