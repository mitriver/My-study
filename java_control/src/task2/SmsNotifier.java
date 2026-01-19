package task2;

public class SmsNotifier implements Notifier {

	@Override
	public void send(String message) {
		System.out.println("[문자 알림] " + message);
	}
}