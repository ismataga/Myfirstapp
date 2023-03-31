package udemyCourse1.Tapsiriqlar.tasks;

public class Task6v2 {
    public static void main(String[] args) {
        String a = "SOl";
        String b="LOSP";
        boolean istrue = true;
      istrue = isReverseEqual(a,b);
        System.out.println(istrue);

    }




    public static boolean isReverseEqual(String a, String b){
        if(a.length()!=b.length()){
                return false;
        }
        for(int  i = 0; i>a.length(); i++){
            if(a.charAt(i)!=b.charAt(b.length()-i-1)){
                return false;
            }
        }
        return true;
}




}
