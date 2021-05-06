package reviews;

public class ParametrizedConstructor {
	
	String name;
	
	int age;
	
	public ParametrizedConstructor(String sname, int sage) {
		
		name = sname;
		
		age = sage;
	}

	public static void main(String[] args) {
		
		ParametrizedConstructor p1 = new ParametrizedConstructor("Adithya", 25);
		
		System.out.println(p1.name+ " " + p1.age);
		
		ParametrizedConstructor p2 = new ParametrizedConstructor("Bharath", 25);
		
		System.out.println(p2.name+ " " +p2.age);
		
		ParametrizedConstructor p3 = new ParametrizedConstructor("Kareem", 24);
		
		System.out.println(p3.name+ " " + p3.age);

	}

}
