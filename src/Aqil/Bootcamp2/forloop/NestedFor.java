package Aqil.Bootcamp2.forloop;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                System.out.println("i= "+ i + " " + "j= "+ j);
            }
            System.out.println();
        }
      
    }
}
