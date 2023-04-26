package udemyCourse1.proyekt2ay.serviceIinter;

public interface Process {
    public abstract  void processLogic();
    public default void process(){
        processLogic();

    }
}
