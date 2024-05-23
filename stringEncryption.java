class stringEncryption {
    public static String encryptString(String str) {
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch + 3);
                if (shiftedChar > 'z') {
                    shiftedChar = (char) (ch - (26 - 3));
                }
                outputString.append(shiftedChar);
            }
            // for non character
            else {
                outputString.append(ch);
            }

        }
        return outputString.toString();
    }

    public static void main(String args[]) {
        String str = "abc xyz";
        System.out.println("The Encrypted String is=" + encryptString(str));
    }

}
