import java.util.Map;

public class StringManipulation {


    public static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<String> stack = new Stack<>();
        Map<String, Integer> precedence = Map.of(
                "+", 1,
                "-", 1,
                "*", 2,
                "/", 2
        );
        for (String token : infix.split(" ")) {
            if (token.matches("\\d+")) {
                postfix.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && !stack.peek().equals("(") &&
                        precedence.get(stack.peek()) >= precedence.get(token)) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }
        return postfix.toString().trim();
    }

    public static int result(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (String token : postfix.split(" ")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static String smallestNumber(String number, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < number.length(); i++) {
            if (number.charAt(i) > number.charAt(j)) {
                j = i;
            }
            if (i - j + 1 > n) {
                sb.append(number.charAt(j));
                n -= (j - i + 1);
                j++;
            }
        }
        sb.append(number.substring(Math.max(number.length() - n, 0)));
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        return sb.substring(i);
    }

    public static String unbelievableString(String s) {
        StringBuilder result = new StringBuilder();
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(prev) == Character.isLowerCase(c) ||
                    (Character.isLowerCase(prev) && !Character.isLowerCase(c)) ||
                    (!Character.isLowerCase(prev) && Character.isLowerCase(c))) {
                result.append(c);
                prev = c;
            }
        }
        return result.toString();
    }
}