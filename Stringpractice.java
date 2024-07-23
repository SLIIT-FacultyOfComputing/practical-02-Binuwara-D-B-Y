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
	sb.append(firstName + " ");
	sb.append(middleName + " ");
	sb.append(lastName);
	String result = sb.toString();
	System.out.print("Full name is " + result);

	System.out.print("Enter your full name: ");
	String fullName = scan.next();
	
	String str1 = result; 
	String str2 = fullName; 
	String str3 = new String 
	}
}