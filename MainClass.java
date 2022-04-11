package messanger;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     String contact, message;

	System.out.println("=======================================");
	System.out.print("Enter the contact no: ");
	contact = sc.nextLine();
	System.out.print("\nEnter the message: ");
	message = sc.nextLine();
	SmsMessage sObj = new SmsMessage(contact, message);
	MessageProcessor<SmsMessage> message1 = new MessageProcessor<>(sObj);
	message1.printResult();
	
	Scanner sc1 = new Scanner(System.in);
    String email, message11;

System.out.println("=======================================");
System.out.print("Enter the email id: ");
email = sc.nextLine();
System.out.print("\nEnter the message: ");
message = sc.nextLine();
EmailMessage eObj = new EmailMessage(email, message);
MessageProcessor<EmailMessage> message2 = new MessageProcessor<>(eObj);
message2.printResult();


	}

}