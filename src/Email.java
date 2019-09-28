import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternativeEmail;
    private int mailboxCapacity;
    private final int PASSWORD_LENGTH = 10;
    private String email;
    private final String COMPANY_SUFFIX = "somecompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for user: " + this.firstName + " " + this.lastName);

        //ask the user for his department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //generate password for the current user
        this.password = generateRandomPassword(PASSWORD_LENGTH);
        System.out.println("Your new password is: " + this.password);

        //combine all parts to generate the actual email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + COMPANY_SUFFIX;
        System.out.println("Your Email is: " + email);
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

    //helper function to generate random password of selected length;
    private String generateRandomPassword(int length) {
        StringBuilder passwordSet = new StringBuilder();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        passwordSet.append(letters);
        passwordSet.append(letters.toUpperCase());
        passwordSet.append("0123456789");
        passwordSet.append("!@$&/`#$");

        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return password.toString();
    }

    // Change the password.
    public void changePassword(String password) {
        this.password = password;
    }

    //Set alternative email
    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
}
