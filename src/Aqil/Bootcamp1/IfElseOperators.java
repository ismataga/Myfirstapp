package Aqil.Bootcamp1;

public class IfElseOperators {

    public static void main(String[] args) {
        boolean isOnline = true;

        if (isOnline == true){
            System.out.println("we are online ");
        }else{
            System.out.println("we are not online");
        }
        String result = isOnline == true ? "we are online" : "we are not online";

        int numberOfMonth = 3;
        
        if(numberOfMonth==1){
            System.out.println("january");
        } else if (numberOfMonth==2) {
            System.out.println("february");
            
        } else if (numberOfMonth==3) {
            System.out.println("march");

        }else{
            System.out.println("incorrect number");
        }
    }

}
