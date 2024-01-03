
																	OOPs(Object Oriented Programming) Part-14 || constructors
																================================================================

 --------------
  Constructor 	
 --------------
 
  -> Once we creates an object compulsory we should perform initialization then only the object is in possition to respond properly.
  
  -> Whenever we are creating an object some peace of the code will be executed automatically to perform initialization of the object this peace of the code is nothing but constructors hence a the 
	 main purpose of constructors is to perform initialization of an object . 	
	
	Ex. 
 
	class Student {														   
																		   
		String name ="durga ";|// not recomanded at the time of declaration 						   	
		int rollno = 101;	  |														----------------    ----------------         ----------------
		{																			|name = null   |    |name = null   | ....... |name = null   |
																					|rollno = 0    |    |rollno = 0    |         |rollno = 0    |// Before Initialization 
			name = "Durga"|															----------------	----------------	     ----------------										    				
			rollno = "101"|// not recomanded inside instance block 						 s1					  s2 						s600 											    					
		}										    				
												    				
		Student (String name , int rollno){										    ----------------    ----------------         ----------------				
			                                                                        |name = "druga"|    |name = "Ravi" | ....... |name = "Shiva"|
			this.name= name;                                                        |rollno = 101  |    |rollno = 102  |         |rollno = 600  | //After Initialization
			this.rollno=rollno;                                                     ----------------	----------------	     ----------------
		}                                                                           	 s1					  s2 						s600 		
		
		
		public static void main(String args[]){
																		
			Student s1 = new Student();
			s1.name = "durga";| /* This approach is not recomanded 
			s1.rollno = "101";|  because length of the code increases */
			Student s2 = new Student();                                 
			s2.name ="durga";|/* This approach is not recomanded 
			s2.rollno= 102;  | because length of the code increases */
			
			
			Student s1 = new Student("durga",101);|//This is recomanded 
			Student s2 = new Student("Ravi",102); |
			
		}                                                               
	}																	
	
	Note: The main purpose of constructors is to perform initialization of an object but not to create object.
	
	
 ---------------------------------------------------	
  Difference between Constructor and Instance Block 
 --------------------------------------------------- 
 
 -> The main purpose of constructors is to perform initialization of an object.
 
 -> But other then initialization if we want to perform any activity for every object creation then we should go for Instance Block (Like Updating one Entry in the Database for every object creation
	or incrementing count value for every object creation ect.).
	
 -> Both constructors and Instance Block have there own different purposes and replacing one concept with another concept may not work always.

 -> Both constructors and Instance Blocks will be executed for every object creation but Instance Block first followed by Constructor.

 -> Demo program to print number of objects created for a class .

	
	class Test {
		
		static int count = 0 ;
		
		{
			
			count ++; // These is recomanded 
		}
		
		Test() {
			
			count ++; /*If we don't use instance block then we have to write count++ in 
		}				 every constructors and Here is code redundancy will increase  and it not recomanded*/
		
		 Test (int i ){
			count ++;  /*If we don't use instance block then we have to write count++ in 
		}               every constructors and Here is code redundancy will increase and it not recomanded */
		
		Test (double d ) {
			
			count ++; /*If we don't use instance block then we have to write count++ in 
		}              every constructors and Here is code redundancy will increase  and it not recomanded k*/
		
		public static void main(String args[]){
			
			Test t1 = new Test();
			Test t2 = new Test(10);
			Test t3 = new Test(10.5);
			System.out.println("The number of object creates :" +count);
		}
	}

 -------------------------------
  Rules of Writing constructors
 ------------------------------- 

	1. Name of the class and name of the constructors must be matched.

	2. return type concept not applicable for constructors even void also.
	
	3. By mistake if we are trying to declare return type for the constructors then we won't get any compile time error because compiler triats it as a method.
	
		Ex. 
	
	
		class Test {																	class Test {
			                                                                            	
			void Test() {<-----                                                         	/*Test (){
							  |// It is a method but not constructors                   		
			}<-----------------	                                                        		System.out.println("Constructor");
		}                                                                               	}*/
		                                                                                	
		                                                                                	void Test(){
		                                                                                		
		                                                                                		System.out.println("It is method but not constructors");
		                                                                                	}
		                                                                                	
		                                                                                	public static void main(String args[]){
		                                                                                		
		                                                                                		Test t = new Test();
		                                                                                		t.Test();
		                                                                                	}
		                                                                                }
																						
	    - Hence it is legal (but stupid) to have method who's name is exactly same as class name.	
		
		
    4. The only applicable modifiers for constructors are public,private,protected, and default If we are trying to use any other modifiers we will get compile time error.


		class Test {
			
			static Test(){
				
			}
		}//CE: modifiers static not allowed here.
		
 ------------------------
    Default Constructor
 ------------------------
 
	-> Compiler is responsible to genaret default constructor (But not JVM).
	
	-> If we are not writing any constructor then only compiler we will genaret default constructor that is if we are writing at list one constructor then compiler won't genaret default constructor
	   hence a every class in java can contain constructor it may be default constructor genareted by compiler or customized constructor explicitly provided by programmer but not both 
	   simultaneously.
	   
	


		
		
		
		
		






























 
	