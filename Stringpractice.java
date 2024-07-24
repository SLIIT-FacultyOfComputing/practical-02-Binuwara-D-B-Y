    import java.util.Scanner;

public class Stringpractice {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("\nEnter your first name: ");
	String firstName = scan.next();
    System.out.print("Enter your middle name: ");
	String middleName = scan.next();
	System.out.print("Enter your Last name: ");
	String lastName = scan.next();

    StringBuilder sb = new StringBuilder();
    sb.append(lastName + " ");
	sb.append(firstName + " ");
    sb.append(middleName);
    String nameResult = sb.toString();
	
    System.out.println("Full name is: " + nameResult);

	System.out.print("\nEnter another full name: ");
	String fullName = scan.next();
	
	if (fullName.equalsIgnoreCase(nameResult)) {
        System.out.println("The names are the same.");
    } else {
        System.out.println("The two names are different.");
    }

    System.out.println("\nPart 03;\n");
    String replacedName = nameResult.replace('a', '@').replace('e', '3');
    System.out.printf("Name after replacement: %s\n", replacedName);

    System.out.println("\nPart 04;");
    String str = nameResult;
    String[] parts = str.split(" ");
    System.out.printf("\nFull Name Splitted;\n\t%s\n\t%s\n\t%s", parts[0], parts[1], parts[2]);

    System.out.println("\nPart 05\n");
    System.out.print("Enter a string with leading and trailing spaces: ");
    Scanner stringWithSpaces = scan.next();
    String trimmedString = stringWithSpaces.trim();
    System.out.println(trimmedString);
	}
}
