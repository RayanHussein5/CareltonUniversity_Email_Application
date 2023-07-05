package CarletonEmailApplication;

public class EmailApp {

    public static void main(String[] args){
        Email email1 = new Email();
        System.out.println(email1.showInformation());
    }
}


/*
 * Generate an email with the following sytnatx: fistname.lastname@department.company.com
 * Determine department (sales, development, accounting,) if none leave blank
 * make random String for a password
 * Have set methods to change password, set mailbox capaciy, and define an alternate email adress
 * Have get methods to display name, email, and mailbox capacity 
 */