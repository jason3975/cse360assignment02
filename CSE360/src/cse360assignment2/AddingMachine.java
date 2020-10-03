package cse360assignment2;

public class AddingMachine {

	 private int total;
	 private String totalString;
	 
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    totalString = "0";
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total += value;//adding to total
		  totalString = totalString + " + " + value;//adding to the string
	  }

	  public void subtract (int value) {
		  total -= value;//subtracting from total
		  totalString = totalString + " - " + value;//adding to the string
	  }

	  public String toString () {
	    return totalString;// returning the string as is
	  }

	  public void clear() {
		  total = 0;
		  totalString = "0";
	  }
	  public static void main(String[] args) {
		  //testing
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add(4);
		  myCalculator.subtract(2);
		  myCalculator.add(5);
		  System.out.println(myCalculator.getTotal());
		  System.out.println(myCalculator.toString());
		  
		  
	  }
	  
}