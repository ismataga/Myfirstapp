package udemyCourse1.ders8AppInThred.mainThread;

import java.util.ArrayList;
import java.util.List;

public class Base {
  public static volatile int a =100;
  private synchronized static int getA(){
    return a;
  }
  private synchronized static void setA(int a){
    Base.a = a;
  }

  public synchronized static void incA(){

  }
}
