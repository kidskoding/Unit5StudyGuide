package l;
//Unit 5: Writing Classes

/* 5.3: Documentation. Comments are a great way to document code
 * so that others can read it. 
 * 
 * Single line comments are done with two forward slashes
 * 
 * Multiline comments are done with a slash and an asterick and end with a
 * slash and asterick
 * 
 * Javadoc comments are done with /**
 * and end with an asterick and then a /. Javadoc comments are great
 * in stating parameters a method passes in and what it returns.
 */

/** 
 * 5.3: Documentation
 * @author Kids Koding (Anirudh Konidala)   
 * Class demonstrates Unit 5 in the APCSA
 * curriculum
 */

class A {
	
	/*
	 * 5.1: Anatomy of a Class
	 * 
	 * Classes follow a fixed structure in the respective order: 
	 * Instance Variable(s), Constructor(s), Method(s)
	 * 
	 * First, Classes have defined instance variables. These are usually declared
	 * under the access modifier private. This means that other classes CANNOT access
	 * them. 
	 * 
	 * (During Unit 9: Inheritance, I like to use the protected access modifier
	 * to define my instance variables. The protected modifier allows
	 * instance variables to be accessed in a child class)
	 * 
	 * Second, Classes have defined constructors. 
	 * When an object is created, the constructor is what is called.
	 * A constructor is a type of method with NO return value (it is not defined in the signature)
	 * A Constructor's signature contains an access modifier, 
	 * the name--WHICH MUST ALWAYS MATCH THE CLASS NAME, and optional parameters in parentheses.
	 * If a constructor is not created, compilers call an auto generated default constructor (a
	 * constructor that takes in no parameters and contains a super() keyword Unit 9: Inheritance)
	 * NOTE: Constructors CANNOT have any behavioral modifiers (static, final, abstract, etc.)
	 * 
	 * Third, Classes have methods. 
	 * These methods may be getters (5.4: Accessors)
	 * These methods may be setters (5.5: Mutators)
	 *
	 */
	
	//instance variables. These are also called class variables. There are accessible among the whole class (5.8: Scope and Access)
	private static long population; /* 5.7: The static keyword. 
	* Anything declared static belongs to a class rather than an object. 
	* Anything declared static can be callable by the class name (Math.pow) OR an object name (str.length) */
	
	private String capital; /*5.8: Scope and Access. Access modifier private means no other classes can access
	* Instance variables are available among the entire class
	* Method variables and parameters are ONLY avaiable in the method
	* Loop variables (defined in for-loop or enhanced for loops) are ONLY available in the loop.
	*/
	
	/**
	 * 5.3: Documentation
	 * @param capital - capital of a country
	 */
	
	public A() { /* 5.9: The this keyword can also be used inside a constructor to call another constructor
	* based on the parameters. When the this keyword is printed, the toString() method from the object class is invoked.
	* (9.7: Object - The Universal Superclass)
	*/
		this(null);
	}
	
	public A(String capital) { /* 5.2: Writing Constructors. Constructor's signature contains an access modifier
	* a name that MUST MATCH THE CLASS NAME, and parameters (optional) */
		
		this.capital = capital; /* 5.9: this keyword. The this keyword helps avoid ambiguity among variables.
		The this keyword is used to refer to the current object */
	}
	
	/**
	 * 5.3: Documentation
	 * @return capital - capital of a country
	 */
	public String getCapital() { /* 5.4: Accessors. An accessor or a getter method is a method that
	* GETS, ACCESSES, or RETRIEVES the value of an instance variable. The return type matches the 
	* primitive type of the instance variable */
		
		return capital;
	}
	
	public void setCapital(String newCapital) { /* 5.5: Mutators. A mutator or a setter method is a method
	* that SETS, MUTATES, or CHANGES the value of an instance variable. Setters take in an updated value
	* of the instance variable as a parameter. If the instance variable and parameter are the
	* same (ambigious), you MUST use the this keyword in front of the instance variable to differentiate */
		
		capital = newCapital;
	}
	
	public static long getPopulation() { /* 5.6: Writing Methods. Method signature contains access modifier (a non access modifier
	* optional), return type, method name, and parameters in parentheses (optional).
	*/
		return population;
	}
	
	//5.3: Documentation
	//Preconditions: A statement that states the requirements in order for a method to work
	//Postcondtions: A statement that states the requirements after execution of a method
	
	//The method below states a precondition and a postcondition
	//Precondition: population will be AT LEAST seven figures (1,000,000 or higher)
	//Postcondition: population will change to actual population of country
	public static void setPopulation(long newPopulation) {
		population = newPopulation;
	}
	
	//5.4 & 5.5: Accessors and Mutators
	//GETTERS AND SETTERS ARE USUALLY PUBLIC (They maybe protected for method overridding purposes, Unit 9: Inheritance)
}
