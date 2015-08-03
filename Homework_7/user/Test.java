package user;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		User user1 = new User();
		User user2 = new User();
		
		try {
			System.out.println("User 1: ");
			user.setMail("gergana@abv.bg");
			user.setPass("gergana95");	
		} catch (MailException e) {
			System.out.println(e.getMessage());
		} catch (PassException e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("User 2: ");
			user1.setMail("abc");
			user1.setPass("123");
		} catch (MailException e) {
			System.out.println(e.getMessage());
		} catch (PassException e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("User 3: ");
			user2.setMail("ivan@gmail.com");
			user2.setPass("123Ivan");
		} catch (MailException e) {
			System.out.println(e.getMessage());
		} catch (PassException e) {
			System.out.println(e.getMessage());
		}
	}
}
