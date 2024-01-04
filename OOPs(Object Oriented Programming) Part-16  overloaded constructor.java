
																	OOPs(Object Oriented Programming) Part-16 || overloaded constructor
																=========================================================================

-----------------------------	
    Overloaded constructor
-----------------------------

 -> Within a class we can declare multiple constructors and all this constructors having same name but different type of arguments hence a all these constructors are considard as overloaded
	constructors. Hence a overloading concept applicable for constructors.

	Ex.

	class Test {																				class Persion {
		                                                                                        	
		Test() {<--------------------------------                                               	
												|                                               	Persion(String name ){
			this(10);							|							                    		this.name=name;
			System.out.println("no-arg");		|								                	}
		}										|							                    	Persion(String name, int id){
												|							                    		this.name=name;
		Test(int i ){							|                                               		this.id=id;
			                                    |// These are overloaded constructors           	}
			this(10.5);                         |                                               	Persion(String name, int id, int age){
			System.out.println("int-arg");      |                                               		
		}                                       |                                               		this.name=name;
		Test (double d ){						|                                               		this.id=id;
												|                                               		this.age=age;
			System.out.pritln("double-arg");	|	                                            	}
		}<---------------------------------------                                               	
		                                                                                        	public static void main (String args[]) {
		public static void main(String args[]) {                                                		
			                                                                                    		Persion p1 = new Persion("durga");
			Test t1 = new Test(); //o/p: double-arg,int-arg,no-arg                              		
			                                                                                    		Persion s2 = new Persion("durga",101);
			Test t2 = new Test(); //o/p: double-arg,int-arg                                     		
			                                                                                    		Persion s3 = new Persion("durga"102,21);
			Test t3 = new Test();// o/p: double-arg                                             	}
			                                                                                    }
			Test t4 = new Test(); // o/p: double-arg
		}
	}
	

  -> For constructors inheritance and overriding concept are not applicable but overloading concept is applicable.  
	Ex 
	
	
	class P {						class P {											
		                            	
		m1() {                      	P() {
		}                           	}
	}                               }
	class C extends P {             class C extends P {
		                            	
		m2() {                      	C(int i ) {
		}                           	}
	}                               }
	
	C c = new C();					C c= new C(); //invalid 
	c.m1();//valid 
	c.m2(); //valid 
	
	
	
 -> Every class in java including abstract class can contain constructors but interface can not contain constructor.

	Ex. 

		class Test{       abstract class Test{			interface Test {
			              	                            	
			Test(){       	Test() {                    	Test(){
				          		                        		
			}             	}                           	}
		}                 }                             }//invalid CE: 
		

 Case 1: 
													
	-> 	Recursive method call is a runtime exception saying stack over flow error.
		
	-> But in our program if there is chance of recursive constructor invocation then the code won't compile and we will get compile time error.
	
		Ex. 
													
													
		class Test {														....								class Test {
													                    |-----------|                           	
			public static void m1() {				                    |    m1()   |                           	Test() {
													                    |-----------|                           		
				 m2();								                    |	m2()	|                           		this(10);
													                    |-----------|                           	}
			}										                    |   m1()    |                           	
													                    |---------  |                           	Test(int i) {
			public static void m2() {				                    |   m2()    |                           		
													                    |-----------|                           		this();
				 m1();								                    |   m1()    |                           	}
				                                                        |-----------|                           	
			}                                                           |  main()   |                           	public static void main(String args[]){
			                                                            -------------	                        		
			public static void main(String args[]) {                    RE: StackOverflowError                  		System..out.println("Hello");
				m1();                                                                                           	}
				System.out.println("Hello");                                                                    	
			}                                                                                                   }// CE: Recursive constructor invocation 
		} //invalid RE: StackOverflowError 
		


 Case 2:

	-> 
	
	
		class P {												class P {														class P {
					                                            	                                                            	
			p(){	  |	                                         	P (){                                                       	P (int i ){
			  super();|--> compiler generated code               	  super();|-->compiler generated code 	                    		super();|---> compile generated code 
			}		  | 	                                    	}                                                           	}
			                                                     }                                                               }
		}                                                        class extends P {                                               class C extends P {
		class C extends P {                                      	                                                            		
                                                                        C() {    |                                               		C() {		|
			C()	{    |                                          		 super();|--> compile generated coded                    		 super();   |--> compile generated code 	
			super(); |---> compiler generated code 						}        |														}			|	
		}		     |	  										}																	} //CE: cannot find symbol, Symbol:constructor P ()
																																	   // Location : class P 
		}                          
		                           
		// valid 													valid 																	invalid                            
		                           
		                           
		
		
		class P {
			
			P (int i ){				NOte:
				
			}							1. If parent class contain any arguments constructor then while writing child classes we have to take special care with respect to constructor. 
			P() {
				super();				2* Whenever we are writing any arguments constructor it is highly recomanded to write no-arg constructor also.
			}
		 }
		 class extends P {
			
			C() {
				super();
			}
		 
		 } //valid 
		
		
		
 Case 3 : 

	->  If parent class constructor throws any checked exception compulsory child class constructor should throws the same checked exception or its parent otherwise the code won't compile.
	
	
	
		class P {																					class P {									class P {
			                                                                                        	                                        	
			P() throws IOException                                                                  	P() throws IOException {                	P() throws IOException {
			{                                                                                       		                                    		
			                                                                                        	}                                       	}
			}                                                                                       	                                        	
		}                                                                                           }                                           }
		class C extends P {                                                                         class C extends P {                         class C extends P {
			                                                                                        	                                        
				C() {   |                                                                           	try {                                   C() throws IOException|Exception|Throwable{
				        |--> compile generated code                                                 		                                    	super();
				super();|                                                                           		super();                            	}
				}       |                                                                           	}catch (IOException e){                 	
			                                                                                        		                                    } //valid 
		}//invalid CE: unreported Exception java.io.IOException in default constructor              	}
	                                                                                                } // This alsi invalid 
		
		
		
  Q) which of the following is valid ?

	 1. The main purpose of constructor is to create an object. // invalid 
	 
	 2. The main purpose of constructor is to perform initialization of an object. // valid 
	 
	 3. The name of the constructor need not be same as class name. //invalid 
	 
	 4. Return type concept applicable for constructors but only void. //invalid 
	 
	 5. We can apply any modifier for constructor. //invalid 
	 
	 6. Default constructor generated by JVM. //invalid 
	 
	 7. Compiler is responsible to generat default constructor. //valid 
	 
	 8. Compiler will always generat default constructor.//invalid 
	 
	 9. If we are not writing no-arg constructor then compiler will generat default.//invalid

	10. Every no-argument constructor is always default constructor.//invalid 

	11. default constructor is always no-arg constructor.//valid 

	12. The first line inside every constructor should be either super() or this() If we are not writing anything then compiler will be generates this() . //invalid 
		
	13. For constructors both overloading and overriding concept are applicable.//invalid 

    14. For constructors inheritance concept applicable but not overriding. //invalid 

	15. Only concreate classes can contain constructor but abstract classes cannot. //invalid 
	
	16. interface can contain constructors. //invalid 
	
	17. Recursive constructor invocation is Runtime exception .// invalid
	
	18. If parent class constructor throws some checked exception then compulsory child class constructor should throw the same checked exception or it child. //invalid 
	
	19. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	