public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email();
        email1.setMailboxCapacity(500);
        System.out.println(email1.showInfo());

//        Email email2 = new Email();
//        email2.setMailboxCapacity(920);
//        System.out.println(email2.showInfo());
    }

}
