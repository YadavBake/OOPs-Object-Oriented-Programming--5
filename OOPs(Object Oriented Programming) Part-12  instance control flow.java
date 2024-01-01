
											OOPs(Object Oriented Programming) Part-12 || instance control flow
										     ========================================================================

-----------------------
  Instance cotrol flow 																
-----------------------

 -> Whenever we are executing a java class first static contol flow will be executed.
 
 -> In the static control flow if we are creating an object the following sequence of events will be executed as the part of instance control flow.
 
		1. Identification of instance members from top to bottom. [3 to 8] 
		2. Execution of instance variable assignments and instance blocks from top to bottom. [ 9 to 14] 
		3. Execution of constructor. [15]


	class Test {
		
	    --------  ------
	  3 |int i |  |= 10;| 9									i = 0 [RIWO]
	    --------- ------									j = 0 [RIWO]
	    ---										        i = 10 [R&W] 
	  4 |{|											j = 20 [R&W]
	    ---
			-------
			|m1();| 10
			-------
			---------------------------------------------
			|System.out.println("First instance block");| 12
			---------------------------------------------
		}
	     ----------								           java Test 
	  5 | Test ()|                                                              
	    ----------                                                                         0
		{                                                                           First instance block 
			------------------------------------                                Second instance block
			|System.out.println("constructor");| 15                             constructor	
			------------------------------------                                Main method 
		}
	    -----------------------------------------
	  1 | public static void main(String args[])|
	    -----------------------------------------
		{
		     ----------------------											Note:
		  2 |Test t = new Test();| //----> line - 1 
		    ----------------------					- Static control flow is one time activity which will be performed at the time of class loading.
			------------------------------------	
			|System.out.println("Main method");| 16     	         - But instance control flow is not one time activity and it will be performed for every object creation.
			------------------------------------
		}								- Object is creation is the most constly operation if there is no specific requirement then its not recomanded to object.
	     ------------------												
	  6 |public void m1()|
	    ------------------
		{   
			------------------------
			|System.out.println(j);| 11
		}	------------------------
	    ---
	  7 |{|
	    --- 
			----------------------------------------------
			|System.out.println("Second instance block");| 13
			----------------------------------------------
		}
	     ------- -------
	  8 |int j| |= 20;| 14
	    ------- -------
	}
	
----------------------------------------------------------	
   instance control flow in parent to child relationship 
----------------------------------------------------------

	-> Whenever we are creating child class object the following sequence of events will be performed automatically as the part of instance control flow.
	
		1. Identification of instance members from parent to child [4 to 14 ].
	    2. Execution instance variable assignments and instance blocks only in parent class [15 to 19].
		3. Execution of parent constructor [20].
		4. Executioon of instance variable assignments and instance block only in child class [21 to 26]. 
		5. Execution child constructor [27] .
		
		
		class Parent {																									
		                                                                                                            	class child extends Parent {
		    -------- -------							i = 0 [RIWO]                        		
		  4 |int i | |= 10;| 15                                                 j = 0 [RIWO]                        	    -------  ------
		    -------- -------							x = 0 [RIWO]                        	  9 |int x | = 100;| 21 
			---                                                             y = 0 [RIWO]                        	    ------- --------
		  5	|{|                                                             i = 10[R&W]                         	    ---
			---	                                                        j = 20[R&W]                         	 10 |{|
				------                                                  x = 100[R&W]                        	    ---
				|m1();| 16                                              y = 200[R&W]                                        -------
				-------                                                                                             	    |m2();| 22 
				------------------------------------------------                                                    	     -------
				|System.out.println("Parent  instance block"); | 18                                                   	  ---------------------------------------------------
				------------------------------------------------					                  |System.out.println("child first instance block");| 24 
			}                                                              	javac Parent.java                                 ---------------------------------------------------
		    -----------                                                     	           |                        			}
		  6 |Parent() |                                                     	-----------------------             	 		----------
		    -----------                                                     	|		      |  			11	|Child ()|
			{                                                               parent.class 	   child.class          		----------
				--------------------------------------------                	                                    		{
				|System.out.println("Parent  Constructor");| 20             	                                    			-----------------------------------------
				--------------------------------------------                	                                    			|System.out.println("Child Constructor");| 27 
			}                                                               	java child                          			------------------------------------------
			                                                                	   0                                		}
		     ----------------------------------------                        	Parent instance Block               		-----------------------------------------
		  1  |public static void main(String args[])|                            Parent constructor                  	  2	|public static void main(String args[] )|
		     ----------------------------------------                        		0                               	-----------------------------------------
			{                                                               Child First instance Block          		
			   --------------------------                                  	Child Second instance Block         		{
			  |Parent p = new Parent();|                                   	Child Constructor                   			------------------------
			   --------------------------                                  	Child Main                          		3	|Child c = new Child();|
			                                                                                                        		------------------------
			   ------------------------------------		                                                            		-----------------------------------
			   |System.out.println("Parent  main");|                                                                		|System.out.println("Child main");| 28 
			   -------------------------------------                                                                		-----------------------------------
			                                                                                                        			
			}                                                                                                       		}
		    -------------------                                                                                     		-------------------
		  7 |public void m1() |                                                                                     	12	|public void m2 ()|
		    -------------------                                                                                     		-------------------
			{                                                                                                       		
				------------------------                                                                            		{
				|System.out.println(j);| 17                                                                         		
				------------------------                                                                            		------------------------
			}                                                                                                       		|System.out.println(y);| 23 
		    -------- ------                                                                                         			------------------------
		  8 |int j | |= 20;| 19                                                                                     		}	
		    -------- -------                                                                                        		---
		}                                                                                                           	13	|{|
		                                                                                                            		--- 
		                                                                                                            		    ----------------------------------------------------
	                                                                                                                			|System.out.println("Child Second instance block");| 25 
	                                                                                                                			----------------------------------------------------
	                                                                                                                		}
	                                                                                                                		-------- --------
	                                                                                                                	14	|int y | |= 200;| 26 
	                                                                                                                		-------- --------
	                                                                                                                	}
	                                                                                                                	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


   















	
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
