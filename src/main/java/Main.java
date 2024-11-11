היי שחר, התקשתי מאוד בפתירת התרגילים, ניסיתי הרבה ללא הצלחה בחלקם. נעזרתי הרבה בתשובות מחברים ומהאינטרנט.
public class main{

    public static int Q10(int n) {
        if (n == 1) {
            return 2;
        } else {
            return n * 2 + (n - 1) + Q10(n - 1);
        }
    }

    public static int Q11(int h, int current) {
        if (h == 0) {
            return 0;
        } else {
            return current + Q11(h - 1, current + 2);
        }
    }

    public static int Q12(int n1, int n2, int current) {
        if (current >= 12) {
            return 0;
        } else if (current % n1 == 0 || current % n2 == 0) {
            return current + Q12(n1, n2, current + 1);
        } else {
            return Q12(n1, n2, current + 1);
        }
    }

    public static int Q13a(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return Q13a(n - 1) * Q13a(n - 1) + Q13a(n - 2) * Q13a(n - 2);
        }
    }

    public static int Q13b(int n, int current) {
        if (current > n) {
            return 0;
        }
        return Q13a(current) + Q13b(n, current + 1);
    }

    public static int Q21(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        char currentChar = s.charAt(index);
        if (Character.isLowerCase(currentChar) && "abc".indexOf(currentChar) != -1) {
            return 1 + Q21(s, index + 1);
        } else {
            return Q21(s, index + 1);
        }
    }

    public static String Q22(String s, int index, String result) {
        if (index >= s.length()) {
            return result;
        }
        if ((index + 1) % 3 == 0) {
            result += s.charAt(index) + "יי";
        } else {
            result += s.charAt(index);
        }
        return Q22(s, index + 1, result);
    }

    public static String Q23(String s) {
        if (s.equals("")) {
            return s;
        }
        return Q23(s.substring(1)) + s.charAt(0);
    }

    public static void Q24(char c1, char c2) {
        if (c1 > c2) {
            return;
        }
        System.out.print(c1 + " ");
        Q24((char) (c1 + 1), c2);
    }

    public static void Q25(int n, int current) {
        if (current > n) {
            return;
        }
        if (n % current == 0) {
            System.out.print(current + " ");
        }
        Q25(n, current + 1);
    }

    public static void Q26(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        if (digit % 2 == 0) {
            System.out.print(digit + " ");
        }
        Q26(n / 10);
    }

    public static void Q27(int x, int y) {
        if (y > 10) {
            return;
        }
        System.out.println(x + " * " + y + " = " + (x * y));
        Q27(x, y + 1);
    }

    public static void Q28(int firstTerm, int diff, int count, int current) {
        if (current > count) {
            return;
        }
        System.out.print(firstTerm + (current - 1) * diff + " ");
        Q28(firstTerm, diff, count, current + 1);
    }

    public static void Q29(int n, int current, int add) {
        if (n == 0) {
            return;
        }
        System.out.print(current + " ");
        Q29(n - 1, current + add, add + 1);
    }

    public static void Q30(int n, int current, int toggle) {
        if (n == 0) {
            return;
        }
        System.out.print(current + " ");
        if (toggle == 3) {
            Q30(n - 1, current - 1, 4);
        } else {
            Q30(n - 1, current + 1, 3);
        }
    }

    public static void Q31(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        if (index % 2 == 1) {
            System.out.print(arr[index] + " ");
        }
        Q31(arr, index + 1);
    }

    public static void Q32(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return;
        }
        if (arr[index] < arr[index + 1]) {
            System.out.print(arr[index] + " ");
        }
        Q32(arr, index + 1);
    }

    public static void Q33(int[][] arr, int row) {
        if (row >= arr.length) {
            return;
        }
        for (int i = 0; i < arr[row].length; i++) {
            System.out.print(arr[row][i] + " ");
        }
        System.out.println();
        Q33(arr, row + 1);
    }

    public static void Q34(int[][] arr, int row) {
        if (row >= arr.length) {
            return;
        }
        int max = arr[row][0];
        for (int i = 1; i < arr[row].length; i++) {
            if (arr[row][i] > max) {
                max = arr[row][i];
            }
        }
        System.out.println(max);
        Q34(arr, row + 1);
    }
}
