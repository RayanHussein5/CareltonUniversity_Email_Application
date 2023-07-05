package CarletonEmailApplication;

import java.util.Random;
import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(){
        
        System.out.println(CarletonEmailInfo()); 

        Scanner in = new Scanner(System.in);
        System.out.println("What is your First Name? ");
        String firstName = in.nextLine();

        this.firstName = firstName;

        in = new Scanner(System.in);
        System.out.println("What is your Last Name? ");
        String lastName = in.nextLine();
        this.lastName = lastName;

        //calling a method that will generate a random passward
        this.password = passwordGenerator(12);
    }

    private String CarletonEmailInfo(){
        return "Hello, We are very happy that you were able to enter into Carleton University!\nFor you to continue with your studies, you must create a Carleton University ID and Passward. ";
    }
    
    private String passwordGenerator(int length){
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to make your own password?\nEnter 'Yes' or 'No");
        String answer = in.nextLine();
        if(answer.toLowerCase().equals("yes")){
            Scanner in2 = new Scanner(System.in);
            System.out.println("Ok then, please enter your wanted Carleton ID Password.");
            String answer2 = in2.nextLine();
            return answer2;  
        }
        else{
            String randomVar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdfghijkllmnopqrstuvwxyz123456789!@$*";
            char[] password = new char[length];
            Random random = new Random();
            for(int i=0; i<length; i++){
                password[i] = randomVar.charAt(random.nextInt(randomVar.length()));
            }
            this.password = new String(password);

            return(this.password);   
        }
    }

    public String showInformation(){
        return "Your Carleton Username: " + firstName + lastName +
                "\nYour Carleton Email: " + firstName.toLowerCase() + lastName.toLowerCase() + "@carleton.cmail.ca" +
                "\nYour Carleton Password: " + this.password;
        
    }
}



