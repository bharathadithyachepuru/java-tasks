package reviews;

class Bike
{


  private String color;

  private int speed;

  public void bikeFeatures()

  {

    System.out.println("Bike Color= "+color + " speed= " + speed);

  }

  public void setColor(String color)

  {

    this.color = color;

  }

  public void setspeed(int speed)

  {

    this.speed = speed;

  }

}
class Hero extends Bike{
	

  public void setStart()

  {

    Honda e = new Honda();

    e.start();

  }

}
class Honda

{

  public void start()

  {

    System.out.println("Engine has been started.");

  }

  public void stop()

  {

    System.out.println("Engine has been stopped.");

  }
}


public class Composition {

	public static void main(String[] args) {
		
		  Hero h = new Hero();

		    h.setColor("Black");

		    h.setspeed(160);

		    h.bikeFeatures();

		    h.setStart();


		

	}

}
