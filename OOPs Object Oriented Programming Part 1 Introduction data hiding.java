
											OOPs(Object Oriented Programming)Part-1||Introduction||data hiding
										     ========================================================================
														
														
 1. Data hiding.<-----------------			
 2. Abstraction.	   	 |
 3. Encapsulation.               |//=> Module-1 
 4. Tightly Encapsulation.	 | 
 5. IS-A Relanationship.	 |
 6. HAS-A Relanationship.---------
 
 7. Method Signature.*
 8. OverLoading.*
 9. Overriding.*
10. Static control flow.*
11. Instance control flow.8
12. Constructors.*
13. Coupling.
14. Cohesion.
15. Type-Casting. 
		

=====================================================================================================================================================================================
	
												Module-1 
											    ===============
-----------------																		
  1. Data hiding 
-----------------

 ->  Outside persion can't access our internal data directly or our internal data should not go out directly these OOP's feture is nothing but data hiding. After validation 
	 or authentication outside persion can access our internal data.
	 
		Ex. 
		
		1. After providing proper user name and password we can able to access our Gmail inbox information.
		
		Ex.
		
		2. Even though we are valid customer of the bank we can able to access our account information and we can't access others account information.
		
 -> By declaring data member(variable) as private we can achieve data hiding.

		Ex.
		
			public classs Account {
				
				private double balance;
				
				public double getBalance(){
					
					//validation 
					return balance;
				}
			}
		
 -> The main advantage of data hiding is security.		
		
	Note: - It is highly recomanded to declare data member (variable) as private.


----------------------
  2. Abstraction.		
----------------------

	-> Hiding internal implementation and just highlite the set of service what we are offering, is the concept Abstraction.

	-> Through bank ATM GUI screen bank people are highleting the set of services what they are offering without highleting internal implementation.

	-> The main advantages of abstraction are.

		1. We can achieve security because we are not highleting our internal implementation.
		
		2. Without effecting outside persion we can able to perform any type of changes in our internal system and hence Enhancement will become easy.
		
		3. It improves maintainbility of the Application.
		
		4. It improves easyness to use our system.
		
	-> By using interfaces and abstract classes we can implement abstraction.

---------------------
  3. Encapsulation.
---------------------

	-> The process of binding data (variable) and currspoding method(behavior) into a single unit is nothing but encapsulation. 

		EX. 
		
			class Studnet {							----------
											|.   .	.|
					data member(variables)				| .  . . |
											|  .  .  |
							+				----------
											|  . . . |
					methods(behavior)				| . . .  |
											|. . .   |
			}								----------
											  CAPSULE
			
	-> If any components follows data hiding and Abstractions such type of component is said to be encapsuled component.

			Encapsulation = Data Hiding+ Abstraction.
			
		Ex. 
		
				public class Account {								------------------------
														|		       |
					private double balance;  // Data hiding use here           		| Welcome to D Bank    |
														|                      |
					public double getBalance(){<-------------------------------------------	|  ------------------  |
														|  | Balance Enquiry|  |
						//validation                                        		|  ------------------  |
						return balance;							|   	               |
					}                                                       		|   ------------------ |
					public void setBalance(double balance){<--------------------------------|   | Update Balance | |
						//validation					|		|   ------------------ | 
						this.balance=balance;                           |    		|                      |
					}                                                       |    		|                      |
				}								|		------------------------
												|			GUI Screen 		
		                                                               			 -------------------------|
		                                                                   		  Abstraction use here.
	
	-> The main advantages of Encapuslation are

		1. we can achieve security.
		
		2. Enhancement will become easy.
		
		3. It improves maintainbility of the Application.
		
		
    -> The main advantage of encapsulation is we can achieve security but the main disadvantage of encapsulation is it increase length of the code and slows down execution.

----------------------------		
  4. Tightly Encapsulation.	
----------------------------

	-> A class is said to be tightly encapsuled if and only if each and every variable declare as private.
	
	-> Whether class contains currspoding getter and setter methods or not and whether these methods are declared as public or not  these things we are not required to check.
		
		Ex.
	
		public class Accout {
			
			private double balance;
			
			public double getBalance(){
				
				return balance;
				
			}
		}
  
		
	Q. which of the following classes are tightly encapsulated ?

		class A {				
								 
			private int x =10; //Yes 		
		}						
		class B extends A {
							
			int y = 20;  // No
		}
		class C  extends A {
			
			private int z = 30;  //YEs 
		}
		
	
	Q. Which of the following classes are tightly encapsulated ?


		class A {
			
			int x =10; // No
			
		}
		class B extends A {
			
			private int  y = 20; //No 
		}
		class C extends B {
			
			private int z = 30  //NO
		
	Note: 
		
		- If the parent class is not tightly encapsulated then no child class is tightly encapsulated 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
