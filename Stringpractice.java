    import java.util.Scanner;

public class Stringpractice {
    private static int n; // Number of students
    private static int[][] marks;
    private static int studentID, subjectID;

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your first name: ");
	String firstName = scan.next();
    System.out.print("Enter your middle name: ");
	String middleName = scan.next();
	System.out.print("Enter your Last name: ");
	String lastName = scan.next();

    StringBuilder sb = new StringBuilder();
    sb.append(lastName + ", ");
	sb.append(firstName + " ");
    sb.append(middleName);
    String nameResult = sb.toString();
	
    System.out.print("Full name is: " + nameResult);

	System.out.println("\nEnter another full name: ");
	String fullName = scan.next();
	
	if (fullName.equalsIgnoreCase(nameResult)) {
        System.out.println("The names are the same.");
    } else {
        System.out.println("The names are different.");
    }

    System.out.println("Part 03;\n");
    String replacedName = nameResult.replace('a', '@').replace('e', '3');
    String.out.printf("Name after replacement: %s", replacedName);


	}
}
