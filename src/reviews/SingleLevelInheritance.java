package reviews;

class Bank                                        

{
   String Accname ="Adithya";
   int accno = 89898989;
   
   public void details()
   {
      System.out.println("Acc name:"+Accname);
      
      System.out.println("Acc No:"+accno);
   }
}
class Deposit extends Bank
{
   int bal = 100;
   
   public void depamt()
   {
      System.out.println("Deposit amount:"+bal);
   }
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		 Deposit d1=new Deposit();
		    d1.details();
		    d1.depamt();

	}

}
