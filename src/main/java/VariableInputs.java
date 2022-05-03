import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string of text: ");
        String txtString = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int intValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double: ");
        double doubValue = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean booValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " +txtString);
        System.out.println("Your integer is " +intValue);
        System.out.println("Your double is " +doubValue);
        System.out.println("Your boolean is " +booValue);

    }
}
