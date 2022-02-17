package StringsMethods;

public class LengthMethod {
    public static void main(String[] args) {
        String s1 = "javatpoint";
        //implementing length() method
        int length = s1.length();
        System.out.println(length);

        //reverse string
        for (int i = s1.length()-1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        //contains method
//        boolean isContains = s1.contains("jva");
        System.out.println(s1.contains("java"));
    }
}
