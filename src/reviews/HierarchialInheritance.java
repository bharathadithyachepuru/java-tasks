package reviews;

class Going                                                
{                                                          
   String Accname="Adithya";                                 
   int accno=89898989;                                      
   double avabal=100;
   public void details()
   {
      System.out.println("Acc name:"+Accname);
      
      System.out.println("Acc No:"+accno);
   }
}
class Went extends Going
{
   double depamt=100;
   public void depamt()
   {
      System.out.println("Dposit amt:"+depamt);
      
      avabal=avabal+depamt;
      
      System.out.println("Total Available balance is:"+avabal);
   }
}
class Inside extends Going
{
   double amt=100;
   public void withamt()
  {
    if(amt>avabal)
    {
       System.out.println("You cannot withdrawl-balance exceeds");
  }
  else{
    System.out.println("Collect Amount");
}
}}

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Went w1 = new Went();
	    Inside i1 = new Inside();
	   
	    w1.details();
	    w1.depamt();
	    
	    i1.details();
	    i1.withamt();

	}

}
