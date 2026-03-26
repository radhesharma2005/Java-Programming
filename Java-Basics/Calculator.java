import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = s.nextInt();
        System.out.print("Enter b:");
        int b = s.nextInt();
        System.out.println("----Menu----");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice:");
        int ch = s.nextInt();
            switch (ch) {
            case 1 -> System.out.println("a+b="+(a + b));
            case 2 -> System.out.println("a-b="+(a - b));
            case 3 -> System.out.println("a*b="+(a * b));
            case 4 -> {
                if (b != 0)
                    System.out.println("a/b="+(a / b));
                else
                    System.out.println("Cannot divide by zero");
            }
            default -> System.out.println("Invalid choice");
            }
        }
    }