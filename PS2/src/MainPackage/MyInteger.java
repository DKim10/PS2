package MainPackage;

public class MyInteger {

	//sets data field named value
	private int value;

	//sets constructor for MyInteger class and makes it superclass
	public MyInteger(int value) {
		super();
		this.value = value;
	}

	// creates get method that returns value
	public int getvalue() {
		return value;
	}

	//Instance method isEven checks if value is even 
	//returns true if even, false if not even
	public boolean isEven() 
	{
		if (this.value % 2 == 0) {
			return true ;
		}
		else
		{
			return false;
		}
	}
	
	//Instance method isOdd checks if value is odd 
	//returns true if odd, false if not odd
	public boolean isOdd() {
		if (this.value % 2 != 0) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Instance method isPrime checks if value is prime
	//Variables: count - incrementor
	//returns true if prime, false if not prime
	public boolean isPrime() {
		int count = 2;
		while(count < this.value) {
			if (this.value % 2 == 0) {
				return false;
			} else {
				count++;
			}
		}
		return true;
		}

	//Static method isEven(int StartValue) checks if value is even 
	//returns true if even, false if not even
	public static boolean isEven(int StartValue) {
		if (StartValue % 2 == 0) {
			return true ;
		}	
		else 
		{
			return false;
		}
	}
	
	//Static method isOdd(int StartValue) checks if value is odd 
	//returns true if odd, false if not odd
	public static boolean isOdd(int StartValue) {
		if (StartValue % 2 != 0) {
			return true ;
		}
		else
		{
			return false;
		}
	}
	
	//Static method isPrime(int StartValue) checks if value is prime
	//Variables: increment - incrementor
	//returns true if prime, false if not prime
	public static boolean isPrime(int StartValue) {
		int increment = 2;
		while(increment < StartValue) {
			if (StartValue % 2 == 0) {
				return false;
			} else {
				increment++;
			}
		}
		return true;
	}

	//Static method isEven(MyInteger) checks if value is even 
	//returns true if even, false if not even
	public static boolean isEven(MyInteger number) {
		if (number.getvalue() % 2 == 0) {
			return true ;
		}
		else {
			return false;
		}
	}
	
	//Static method isOdd(MYinteger number) checks if value is odd 
	//returns true if odd, false if not odd
	public static boolean isOdd(MyInteger number) {
		if (number.getvalue() % 2 != 0) {
			return true ;
		}
		else {
			return false;
		}
	}
	
	//Static method isPrime(MyInteger number) checks if value is prime
	//Variables: increment- incrementor
	//returns true if Prime, false if not Prime
	public static boolean isPrime(MyInteger number) {
		int increment = 2;
		while(increment <number.getvalue()) {
			if (number.getvalue() % 2 == 0) {
				return false;
			} else {
				increment++;
			}
		}
		return true;
	}
	
	//Instance method equals(int StartValue) checks if value is equal to data field value 
	//returns true if it equals, false if not equal to data field value
	public boolean equals(int StartValue) {
		if (StartValue == value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Instance method equals(MyInteger number) checks if value is equal to data field value 
	//returns true if it equals, false if not equal to data field value 
	public boolean equals(MyInteger number) {
		if(number.getvalue() == value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Static method equals checks if value is equal to data field value
	//Variables: total - incrementor , convert- takes character and converts to integer
	//returns true if it equals, false if not equal to data field value
	public static int parseInt(char[] StartValue) {
		int total = 0;
		for(int index = 0; index < StartValue.length; index++) {
			int convert = StartValue[index];
			total += convert;
		}
		return total;
		
	}
	
	//Static method parseInt(String StartValue) takes in string and converts to integer
	//variables: digit - int value of string 
	//returns integer 
	public static int parseInt(String StartValue) {
		int digit = Integer.parseInt(StartValue);
		return digit;		
	}
}


