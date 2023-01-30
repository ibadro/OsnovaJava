package Задачи;

import java.util.Arrays;
import java.util.List;

public class BrackTwo {
    static String areBracketsBalanced(String expr) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int count = 0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') {
                if (expr.substring(i).contains("" + ')')) {
                    stringBuilder1.append(c);
                    count++;
                }
            }

            if (c == ')' && count > 0) {
                stringBuilder1.append(c);
                count--;
            }

            if (count == 0) {
                stringBuilder2.append(stringBuilder1);
                stringBuilder1.setLength(0);
            }

            if (count > 0 && i == expr.length() - 1) {
                while (count > 0) {
                    stringBuilder1.deleteCharAt(stringBuilder1.indexOf("("));
                    count--;
                }
                stringBuilder2.append(stringBuilder1);
            }

            if (count < 0 && i == expr.length() - 1) {
                while (count < 0) {
                    stringBuilder1.deleteCharAt(stringBuilder1.indexOf(")"));
                    count--;
                }
                stringBuilder2.append(stringBuilder1);
            }
        }
        return stringBuilder2.length() + " - " + stringBuilder2;
    }

//    static boolean allCharactersSame(String s) {
//        int n = s.length();
//        for (int i = 1; i < n; i++)
//            if (s.charAt(i) != s.charAt(0))
//                return false;
//        return true;
//    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("(()", ")()())", ")(()())", ")(", "())(()())(()");
        for (String s : list) {
            System.out.println("Input string " + s + ", REZULT = " + areBracketsBalanced(s));
        }
    }
}
