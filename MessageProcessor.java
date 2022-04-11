package messanger;

import java.lang.reflect.Field;

public class MessageProcessor<X> {

	private X message;

	public MessageProcessor(X a1) {
		message = a1;
	}

	public void printResult() {
		try {
			Field receiverField = message.getClass().getDeclaredField("receiver");

			Object receiverValue = receiverField.get(message);

			Field messagefield = message.getClass().getDeclaredField("message");

			Object messageValue = messagefield.get(message);

			System.out.println("=======================================");
			System.out.println("Message: " + messageValue + " sent to " + receiverValue );
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}