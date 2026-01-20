package task2;

public class Main {
	
	public static void main(String[] args) {

		// 인터페이스 타입으로 객체 생성
		Notifier email = new EmailNotifier();
		Notifier sms = new SmsNotifier();
		Notifier app = new AppPushNotifier();

		String message = "비밀번호가 변경되었습니다.";

		email.send(message);
		sms.send(message);
		app.send(message);
	}
}
