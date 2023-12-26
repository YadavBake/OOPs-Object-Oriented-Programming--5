
											OOPs(Object Oriented Programming)Part-3 || Inheritance||HAS-A 
									  	    ====================================================================
--------------------------
 6. HAS-A Relanationship	
--------------------------

 -> HAS-A relanationship is also known as composition aggregation.

 -> There is no specific keyword to impliment has-a relation but most of the times we are depending on new keyword.

 -> The main advantage of HAS-A relanationship  is code reusability.

	Ex. 
		
		class Car {					Engine {
			                                	
			Engine e = new Engine();        		// Engine specific functionality
			                                	}
		}
		
		Car HAS-A Engine Reference.
		
 -> Difference betwen composition and Aggregation 
	
	-> composition:- 
	
	
	- without exisiting container object if there is no chance of exisiting contained objects then container and contained object are strongly associated and these strong 
	  association is nothing but Composition.
	  
	  Ex.
	  
		- Univercity consist of several deppartments without exisiting Univercity there is no chance of department hence a Univercity and Dipartment are strongly associated
		  and these strong association is nothing but composition.
	
							
								It is composition
						----------------------------------	
						|				  |
						|	---------    ---------	  |
						|	|  IT	|    |  IT   |-------------> Contained Object within container
						|	---------    ---------    |
						|                                 |
						|     --------- ---------	  |
						|     |  IT   |  |  IT   |     	  |---> container object 
						|     ---------  ---------        |
						|                                 |
						----------------------------------
							Univercity
							
							
	-> Aggregation :

		- Without exisiting container object If there is a chance of exisiting contained object then container and contained object are weekly associated and these weeek 
		  association is nothing but aggregation.
			  
		    Ex.

				- Department consist of several profesors without exisiting department there may be chance of exisiting profesors object hence department and profesors object 
				  are weekly associated and these week association is nothing but aggregation.
				  
				  
			   
								--------------------	   						   
								|	---------   |	    -------               
								|	| IT 	|-----------------> | p1  |			   
								|	---------   |               -------
								|	            |
								|	---------   |		    -------
								|	|  BE	|-----------------> | p2  |-->// These are contained Object 
								|	---------   |               -------
								|	            |
								|	---------   |		    -------
								|	| B.com |-----------------> | p3  |
								|	---------   |               -------
								--------------------	   
								|	Department    
								|-->Cointainer Object 	   
									
Note: 

	- In composition object are strongly associated where as In aggregation object are weekly associated.
	
	- In composition container object holds directly contained objects.
	
	- Where as in aggregation container object holds just references of contained object.
	
------------------
  IS-A vs HAS-A 
------------------

 -> If we wan't total functionality of a class automatically then we should go for IS-A relationship.

	Ex. 
		 ---------------------
		 |  perions class    |
		 ---------------------
                 |
		 |-> IS-A Relanationship
                 |
	        ----------------------  
		|   Student class    |
	        ----------------------

 -> If we wan't part of the functionality then we should go for HAS-A relationship.
 

	Ex. 
	 ---------------------
	 |  Test  class      |
	 |  //100 Methods    |
    	---------------------
                 |
    		 |-> IS-A Relanationship
                 |
        ----------------------  
    	|   Student class    |
	| Test t = new Test()|
	|  t.m1();	     |	
	|  t.m6();	     |
        ----------------------
		
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

											------------------------
											  7. Method Signature.*
											------------------------ 


-> In the java method signature consist of method names followed by arguments types.

	
		  -------------------------------------------------------
		 |   public static     int 	    m1(int i, float f)  |
		 | ---------------    -----	   -------------------  |	
		 | /*These are	      //return	   //These are method   |==>// These all are method declarations.
		 |  modifiers*/	     //type 	    signature.          |
		 --------------------------------------------------------

-> return type is not part of method signature in java.

-> Compiler will use method signature to resolve method calls.

	Ex. 
	
		class Test {				    -------------
							    |		|		Test t = new Test();
			public void m1(int i){              |   m1(int) |		t.m1(10);//valid 
				                            |           |		t.m2("Durga"); //valid 
			}                                   |-----------|		t.m3(10.5);//invalid CE: Cannot find symbol, Symbol: method m3(double), Location: class Test
			public void m2((Stirng s){	    |		|
			                                    |           |
			}                                   | m2(Stirng)|
		}                                           |           |
							    -------------
							     Method table 


 -> Within in class two method with the same signature not allowed.
 
	Ex.
 
	class Test{
		
		public void m1(int i){ //==> m1(int)
			
		}
		public int m1(int j){ //==> m1(int) CE: m1(int) already defined in Test
			
			return 10;
		}
	}		
		Test t = new Test();
		t.m1(10);


====================================================================================================================================================================================

											8. OverLoading.*
										  ============================


 -> Two methods are said to be overloaded if and only if both methods having same name but different arguments types.

 -> In C language method overloading concept is not available hence a we can't declare multiple methods with same name but differnet arguments types.
 
 -> If there is change in arguments type cumpulsory we should go For New method name which increase complexity of programming.
 
	
	Ex.
	
	
	abs(int i)==> abs(10)
	labs(longl )==> labs(10l)
	fabs(float f)==> fabs(10.5f)
	
	
 -> But in java we can declare multiple method with same name but different arguments types such type of methods are called overloaded methods.

	Ex. 
	
		abs(int i)	|
		abs(long l) |==>// These method are called overloaded method.
		abs(float f)|
		
 -> Having overloading concept in java reduce complexity of programming .

		class Test{
			
			public void m1(){<--------------------------------		
									  |
				System.out.println("No-Arg method");      |
			}                                                 |
			public void m1(int i){				  |	
				                                          |//===> Overloaded Methods
				System.out.println("Int-arg method");     |
			}						  |
			public void m1(double d ){                        |
				                                          |
				System.out.println("Double-arg method");  | 
			}<------------------------------------------------                                               
		                                                    
		
		public static void main(String args[]){
				
			Test t = new Test();
			t.m1();// No-Arg method 
			t.m1(10);//Int-arg method 
			t.m1(10.5);//Double-arg method
		}
	}

 **> In overloading method resolution always takes by compiler based on reference type hence a overloading is also considard as compiletime polymorphisam or static polymorphisam
	 or Early binding.
	 
	 





























	
	





































 

































  
