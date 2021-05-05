package techouts;

public class NumberToWord {
	
	private static final String[] units = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine"
		  }; 
		  private static final String[] doubles = {
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };
		  private static final String[] tens = {
		    "",
		    "",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };
		  private static final String[] hundreds = {
		    "",
		    " thousand",
		    " million",
		    " billion"
		  };

		  private static String convertToWord(int number) {    
		    String word = "";    
		    int index = 0;
		    do {
		      
		      int num = number % 1000;
		      if (num != 0){
		          String str = convertThreeOrLessThanThreeDigitNum(num);
		          word = str + hundreds[index] + word;
		      }
		      index++;
		      number = number/1000;
		    } while (number > 0);
		    return word;
		  }
		  private static String convertThreeOrLessThanThreeDigitNum(int number) {
		    String word = "";    
		    int num = number % 100;
		    if(num < 10){
		      word = word + units[num];
		    }
		    else if(num < 20){
		      word = word + doubles[num%10];
		    }else{
		      word = tens[num/10] + units[num%10];
		    }
		    word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
		    return word;
		  }
		        
		  public static void main(String[] args) {
		    System.out.println("Number: " + convertToWord(735455));
		    System.out.println("Number: " + convertToWord(64));
		    System.out.println("Number: " + convertToWord(47644));
		    System.out.println("Number: " + convertToWord(23679045));
		    System.out.println("Number: " + convertToWord(1));

  }
}
