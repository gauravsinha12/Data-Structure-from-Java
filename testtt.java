class Car { 

	public String name = "Mondial "; 

	public Car() { 

	System.out.print("Car ");

	} 

} 

public class Ferrari extends Car { 

	public Ferrari() { 

		System.out.print("Ferrari "); 

	} 

	void getModel() { 

		name = "Portofino "; 

		System.out.print(this.name+" "+super.name); 

	} 

	public static void main(String[] args) { 

		new Ferrari().getModel(); 

	} 

} 