import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        while (true) {
            System.out.print("Enter thr OP : ");
            char OP = sc.next().trim().charAt(0);
            if (OP == '+' || OP == '-' || OP == '*' || OP == '/') {
                System.out.print("Enter the 1st Number: ");
                int a = sc.nextInt();
                System.out.print("Enter the 2nd Number: ");
                int b = sc.nextInt();
                if (OP == '+') {
                    res = a + b;
                }
                if (OP == '-') {
                    res = a - b;
                }
                if (OP == '*') {
                    res = a * b;
                }
                if (OP == '/') {
                    if (b != 0) {
                        res = a / b;
                    }
                }
            } else if (OP == 'x' || OP == 'X')
                break;
            else {
                System.out.println("Invalid Operation");
            }
            System.out.println(res);
        }
    }
}
