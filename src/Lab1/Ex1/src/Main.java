import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 1;
        int choice;
        Scanner input = new Scanner(System.in);
        complex_number A = new complex_number();
        complex_number B = new complex_number();
        complex_number result = new complex_number();

        A.set_x(2);
        A.set_y(5);

        B.set_x(4);
        B.set_y(-1);

        while(menu!=0)
        {
            System.out.println("Select operation to be performed on the complex numbers");
            A.to_string();
            System.out.print("and");
            B.to_string();
            System.out.println();

            System.out.println("1-add");
            System.out.println("2-subtract");
            System.out.println("3-multiply");

            choice = input.nextInt();

            switch (choice)
            {
                case 1:  A.add(A,B,result);
                break;
                case 2:; A.subtract(A,B,result);
                break;
                case 3:; A.multiply(A,B,result);
                break;
                default: System.out.println("No viable action has been chosen, please try again");
                break;
            }
            System.out.println("The result is:");
            result.to_string();
            System.out.println("Continue? 0/1");
            menu = input.nextInt();
        }
    }
}