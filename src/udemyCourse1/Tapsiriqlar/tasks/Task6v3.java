package udemyCourse1.Tapsiriqlar.tasks;

public class Task6v3 {
    public static void main(String[] args) {
        boolean a =true;
         a =isReverseEqual("sos", "solo");
        System.out.println(a);
    }
    public static boolean isReverseEqual(String str1, String str2) {
        if (str1.length() != str2.length()) { // stringlerin uzunlukları eşit değilse birbirine eşit olamazlar
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - i - 1)) { // karakterler tersine eşit değilse false döndür
                return false;
            }
        }
        return true; // fonksiyon buraya kadar return etmediyse, stringler birbirine tersi ile eşittir
    }

}





