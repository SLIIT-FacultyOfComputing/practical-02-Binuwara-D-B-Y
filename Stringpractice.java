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

    System.out.println("\nPart 02;");
	System.out.print("Enter another full name: ");
	scan.nextLine();
    String fullName = scan.nextLine();
	
	if (fullName.equalsIgnoreCase(nameResult)) {
        System.out.println("The two names are the same.");
    } else {
        System.out.println("The two names are different.");
    }

    System.out.println("\nPart 03;");
    String replacedName = nameResult.replace('a', '@').replace('e', '3');
    System.out.printf("Name after replacement: %s\n", replacedName);

    System.out.println("\nPart 04;");
    String str = nameResult;
    String[] parts = str.split(" ");
    System.out.printf("Full Name Splitted;\n\t%s\n\t%s\n\t%s", parts[0], parts[1], parts[2]);

    System.out.println("\n\nPart 05;");
    System.out.println("Enter a string with leading and trailing spaces: ");
    String strWithSpace = scan.nextLine();
    String trimmedString = strWithSpace.trim();
    System.out.println(trimmedString);
    scan.close();
    
    System.out.println("\nPart 06");
    int vowelCount = 0; // Reset vowel count
    String vowels = "aeiouAEIOU";
    StringBuilder sbr = new StringBuilder(nameResult);

    for (int i = 0; i < sb.length(); i++) {
        char c = sbr.charAt(i);
    if (vowels.indexOf(c) != -1) {
        vowelCount++;
        }
    }
    System.out.println("Concatenated Full name: " + nameResult);
    System.out.println("Number of vowels in the concatenated full name: " + vowelCount);
	}
}
