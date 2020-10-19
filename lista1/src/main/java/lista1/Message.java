package lista1;

public class Message {
	public void setMessage(int i) {
		DifferentMessage msg = new DifferentMessage();
		if (i%2 == 0) {
			System.out.println("Liczba parzysta");
		}
		else {
			msg.setMsg(i);
		}
	}
}
