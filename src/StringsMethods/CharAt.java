package StringsMethods;

public class CharAt {
    public static void main(String[] args) {
        String name = "Welcome to Javatpoint";
        //implementing charAt method
        char ch = name.charAt(2);
        System.out.println(ch);

        //first and last character
        char ch2 = name.charAt(0);
        char ch3 = name.charAt(name.length()-1);
        System.out.println(ch2 + " " + ch3);

        //print char at odd position
        int nameLength = name.length();
        for (int i = 0; i < nameLength; i++) {
            if (i%2 != 0){
                System.out.println(i + " " + name.charAt(i));
            }
        }

        //frequency of character
        int count = 0;
        for (int i = 0; i < nameLength; i++) {
            if (name.charAt(i) == 't'){
                count++;
            }
        }
        System.out.println(count);
    }
}
