  package com.sankeandladder;

      public class SnakeAndLadder {
    	  
    	    public static final int NO_PLAY = 1;
    		public static final int LADDER = 2;
    		public static final int SNAKE = 3;
    		public static final int START = 0;

    	  
    		  public static void main(String[] args) {
    			  
    			
    			       int Position=0;
    			      
    			
                    System.out.println("Welcome to Snake and Ladder game");
    			
    			       System.out.println("You are at Starting Position::"+Position);
    			     
    			       int die=(int) (Math.random() * 10) % 6+1;
    
    			            System.out.println("dice value is " + die);
    			       
    			       int value=(int) (Math.random() * 10) % 3+1;
    			      	
    			            System.out.println("case number is " + value);
    			      	
    			 switch(value) {
    			 
    			 case NO_PLAY :
    			      	  
    				        System.out.println( "No Play You are in the same position." );
    			      	       
    				                break;

    			 case LADDER:
    			      	  
    				               Position = (Position + die);
    			      	   
    				            System.out.println( "your position after ladder is ::" + Position );
    			      	           
    				                break;

    			 case SNAKE: 
    			  
    				        Position = (Position - die);

    			      
    				             if(Position<0){
    				            	  
    			      		          Position = 0;
    			      	  
    				             }
    			      		
    				                 System.out.println( "Your Position after snake is::" + Position );
    			      	   
    				                      break;
 
    			      	   }
    			
    			  }

    		}
    		
	


