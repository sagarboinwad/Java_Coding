package java_coding;
import java.util.Scanner;

public class UserLogin {
	
	private int pin;
	private String pswd;
	
	public int getPIN() {
		return pin;
	}
	public void setPIN(int pin) {
		this.pin = pin;
	}
	public String getPSWD() {
		return pswd;
	}
	public void setPSWD(String pswd) {
		this.pswd = pswd;
	}

	public static void main(String[] args) {
		UserLogin u = new UserLogin();
		
		u.setPIN(123);
		u.setPSWD("RAM@123");

		Scanner sc = new Scanner(System.in);
		
	    System.out.println(" Enter PIN :");
	    if(sc.nextInt() == u.getPIN()) {
	    	System.out.println("Enter passward :");
	    	if(sc.next().toString().contains(u.getPSWD().toLowerCase())) {
	    		System.out.println("Login Successfull!");
	    		
	    		
	    	}else {
	    		System.out.println("Invalid Passward!");
	    	}
	    }else {
	    	System.out.println("Invalid Credentials");
	    }
		
		

	}

}
