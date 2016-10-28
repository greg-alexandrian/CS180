
// Fig. 8.1: Time1.java
// Time1 class declaration maintains the time in 24-hour format.

public class Time1  
{
   private int hour; // 0 - 23  
   private int minute; // 0 - 59
   private int second; // 0 - 59
  
   public Time1(){
	   hour = 0;
	   minute = 0;
	   second = 0;
   }
   
   
   public int getHour(){
	   return hour;
   }

   public Time1(int initHour){
	   //hour = ( ( initHour >= 0 && initHour < 24 ) ? initHour : 0 ); // validate hour
	   //setHour(initHour);
	   this(initHour, 0, 0);
   }
   public Time1(int initHour, int initMinute){
	   /*setHour(initHour);
	   setMinute(initMinute);*/
	   this(initHour, initMinute,0);
   }
   public Time1(int initHour, int initMinutes, int initSeconds){
	   setHour(initHour);
	   setMinute(initMinutes);
	   setSeconds(initSeconds);
   }
  //simulates passing a second of time
   public void tick(){
	   if(second < 59){
		  second++; 
	   }else{
		   //go to next minute and reset seconds to 0
		    nextMinute();
		   /*minute++;
		   second = 0;*/
	   }
	   
   }
   private void nextMinute(){
	   second = 0;
	   if(minute <59){
		   minute++;
	   }else{
		  /* hour++;
		   minute = 0;*/
		   nextHour();
	   }
   }
   private void nextHour(){
	   minute = 0;
	   if(hour < 23){
		   hour++;
	   }
	   else{
		   hour = 0;
	   }
   }
   // set a new time value using universal time; ensure that 
   // the data remains consistent by setting invalid values to zero
   // the question mark is the condition requirement
   // if the condition on the left of the question mark is false then the condition on the right becomes true.
   
  public void setHour(int theHour){
	  hour = ( ( theHour >= 0 && theHour < 24 ) ? theHour : 0 ); // validate hour
  }
  public void setMinute(int theMinute){
	  minute = ( ( theMinute >= 0 && theMinute < 60 ) ? theMinute : 0 ); // validate minute
  }
  public void setSeconds(int theSeconds){
	  second = ( ( theSeconds >= 0 && theSeconds < 60 ) ? theSeconds : 0 ); // validate second
  }
   public void setTime( int h, int m, int s )
   {
      //hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); // validate hour
	   setHour(h);
      //minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); // validate minute
	   setMinute(m);
      //second = ( ( s >= 0 && s < 60 ) ? s : 0 ); // validate second
	   setSeconds(s);
   } // end method setTime

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( "%02d:%02d:%02d", hour, minute, second );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
         minute, second, ( hour < 12 ? "AM" : "PM" ) );
   } // end method toString
} // end class Time1

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/