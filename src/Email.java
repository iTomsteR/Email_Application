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

    public Email() {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name!");
        this.firstName = in.nextLine();

        System.out.println("Please enter your last name!");
        this.lastName = in.nextLine();
        System.out.println("Email created for user: " + this.firstName + " " + this.lastName);

        //ask the user for his department
        this.department = setDepartment();

        //generate password for the current user
        this.password = generateRandomPassword(PASSWORD_LENGTH);

        //combine all parts to generate the actual email
        email = department.equals("") ? firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + COMPANY_SUFFIX :
                                        firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + COMPANY_SUFFIX;
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

        return new String(password);
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

    public String showInfo() {
        return "\nDISPLAY NAME: " + this.firstName + " " +this.lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nPASSWORD: " + password +
                "\nDEPARTMENT: " + department +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb\n";
    }
}
