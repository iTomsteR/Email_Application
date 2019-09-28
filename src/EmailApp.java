public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("John", "Smith");
        email1.setMailboxCapacity(500);
        System.out.println(email1.showInfo());

//        Email email2 = new Email("Alex", "Johnson");
//        email2.setMailboxCapacity(920);
//        System.out.println(email2.showInfo());
    }

}
