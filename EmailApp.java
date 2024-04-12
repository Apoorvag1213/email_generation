package emailapp;

public class EmailApp {
	public static void main(String args[]) {
		Email m1 =new Email("john","standy");
		m1.setAlternateMail("jhn@gmail.com");
		System.out.println(m1.getAlternateEmail());
		System.out.println(m1.showinfo());
	}
	

}
