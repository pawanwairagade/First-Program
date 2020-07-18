package src;


import java.io.IOException;

public class FirstProgram {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String name="abc";
	String address="abcAddress";
	
	public static void main(String[] args) throws IOException {
		
		FirstProgram firstProgram = new FirstProgram();
		firstProgram.setAddress("test");
		int a = firstProgram.add(5,8);
		
		System.out.println("a "+a);
		

	}
	
	int add(int a, int b ){
		System.out.println("value of a " + a);
		System.out.println("value of b " + b);
		return a+b;
		
	}

}
