package array_practice;

public class Demo {
	
	String name;
	public Demo(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	

	public static void main(String[] args) {
		Demo d1 = new Demo("tom");
		Demo d2 = new Demo("jeery");
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
