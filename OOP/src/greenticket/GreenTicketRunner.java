package greenticket;

public class GreenTicketRunner {
	public static void main(String[] args) {
		GreenTicket test = new GreenTicket();
		int var;
		
		var = test.greenTicket(1, 2, 3);
		System.out.println(var);
		
		var = test.greenTicket(1, 1, 2);
		System.out.println(var);
	}
}
