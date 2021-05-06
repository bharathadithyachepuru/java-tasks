package reviews;

class Social {
	
	String Topic = "History";
}

class Science extends Social {
	
	String topic = "Friction";
	
	public void subject() {
		
		System.out.println(topic);
		
		System.out.println(super.Topic);
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		Science sc = new Science();
		
		sc.subject();

	}

}
