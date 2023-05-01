package udemyCourse1.ders8AppInThred.main;

import udemyCourse1.ders8AppInThred.mainThread.MyConsumer;
import udemyCourse1.ders8AppInThred.mainThread.Base;
public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
}
