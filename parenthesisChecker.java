import java.util.Stack;
//Time Complexity-The time complexity of this parenthesisChecker algorithm is O(n) where n is the length of the input string. This is because we iterate through each character in the string once.

//Space complexity-The space complexity depends on the maximum size of the stack, which in the worst case is proportional to the length of the input string (i.e., if all characters are opening brackets and none are closed). Thus, the space complexity is also O(n)O(n), where nn is the length of the input string str.
class parenthesisChecker {
    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }

            } else if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }

            } else if (ch == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;

    }

    public static void main(String args[]) {
        String str = "{([])}";
        System.out.println(checkParenthesis(str));
    }
}
