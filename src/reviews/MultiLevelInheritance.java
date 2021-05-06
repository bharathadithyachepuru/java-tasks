package reviews;

class Account                                          
{
   String Accname="Adithya";
   int accno=89898989;
   public void details()
   {
      System.out.println("Acc name:"+Accname);
      
      System.out.println("Acc No:"+ accno);
   }
}
class Balance extends Account
{
   int bal=100;
   public void depamt()
   {
      System.out.println("Deposit amount:"+bal);
   }
}
class Withdrawl extends Balance
{
   int amt=200;
   public void withamt()
  {
    if(amt>bal)
    {
       System.out.println("You cannot withdrawl-balance exceeds");
  }
  else{
    System.out.println("Collect Amount");
}
}}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		Withdrawl d1=new Withdrawl();
	    d1.details();
	    d1.depamt();
	    d1.withamt();	

	}

}
