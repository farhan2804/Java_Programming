//Generate random string and convert the lower case string from 3 to 7 to uppercase

import java.util.*;

class randomString {
    public static void main(String args[]) {
        String str = "";
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the random character you want to generate");
        int length = in.nextInt();
        // base case
        if (length < 8) {
            System.out.println("Invalid Input");
        }
        else{
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(length)+ 'a');
            str += randomChar;
        }
        String subString = str.substring(3, 8);
        String upperCase = subString.toUpperCase();
        String output = str.substring(0, 3) + upperCase + str.substring(8);
        System.out.println("the random generated string is=" + output);

    }
}

}
