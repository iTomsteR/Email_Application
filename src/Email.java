import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternativeEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for user: " + this.firstName + " " + this.lastName);

        //ask the user for his department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    //helper function
    private String setDepartment() {
        System.out.print("Please select your department code:\n0 - None\n1 - Sales\n2 - Accounting\n3 - Development\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch(depChoice) {
            case 0:
                return "";
            case 1:
                return "sales";
            case 2:
                return "accounting";
            case 3:
                return "development";
            default:
                return "";
        }
    }


}
