package com.firstproject.project;

class FIRSTPROJECT {
	public static void main(String[] args) {
		
	/*int myNum= 3;
		float myFloat= 23.99f;
		char myChar= 'D';
		String myString= "Amrin";
		boolean myBool= false;
		
		System.out.print(myNum+ " ");
		System.out.println(myFloat+ " ");
		System.out.println(myChar+ " ");
		System.out.println(myString+ " ");
		System.out.println(myBool+ " ");
		
		
		String firstName= "Amrin";
		String lastName= "Feroz";
		String fullName= firstName+" "+lastName;
		System.out.println(fullName);
		System.out.println(fullName.toUpperCase());*/
	
		/*byte x=127;
		short y= 200;
		int z= 25647;
		long a= 28011999;
		float b= 34.87f;
		double c= 123.876544d;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		/*float x= 24e3f;
		double y= 36E4d;
		System.out.println(x);
		System.out.println(y);**/
		
		/*boolean todayisTuesday= true;
		boolean istodayFriday= false;
		char a= 65, b=77, c=82, d=73, e=78;
		System.out.println("Is today Tuesday"+"  "+ todayisTuesday);
		System.out.println("Today is Friday"+"  "+ istodayFriday);
		System.out.print(a +" ");
		System.out.print(b +" ")
		System.out.print(c +" ");
		System.out.print(d +" ");
		System.out.print(e +" ");*/
		
		/*String day = ("Mon", "Tue", "Wed", "Thru", "Fri", "Sat", "Sun");
		System.out.println("Enter Day");
		if (day== "Monday" && day=="Friday"); {
			System.out.println("WEEKDAYS");
		} else if(day == "Friday") {
			System.out.println("WEEKEND STARTS");
		} else {
			System.out.println("ENJOY THE WEEKEND");
		}
		
		int time=10;
 String myResult= (time>5) ? "MORNING" : (time>12) ? : "AFTERNOON" ;
	System.out.println(myResult);
		
		int day=5;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tusday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}	
		
		int day=2;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thrusday");
				break;
			case 5:
					System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		
		}
		
		int i = 0;
	    while (i <= 5) {
	      System.out.println(i);
	      i++;
		}
		
		for (int i = 0; i <= 5; i++) {
		      System.out.println(i);
		    } 
		
		for(int i=0; i<=10; i+2) {
			System.out.println(i);
		}
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		for(String i: days) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < 10; i++) {
		      if (i == 4) {
		        break;
		      }
		      System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
		      if (i == 4) {
		        continue;
		      }
		      System.out.println(i);
		    } 
		
		    int i = 0;
		    while (i < 10) {
		      System.out.println(i);
		      i++;
		      if (i == 4) {
		        //break;
		    	  continue;
		      }
		    } 
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		//System.out.println(days[1]); 
		System.out.println(days.length);
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		for (int i = 0; i < days.length; i++) {
		      System.out.println(days[i]);
		    }
		
		String[][] dayscars = {{"Monday", "Tuesday", "Wednesday"}, {"Bugatti","Porshe","Lambo","Mercedes","Rolls Royce"}};
		String x = dayscars[0][1];
	    System.out.println(x); */
		
		String[][] dayscars = {{"Monday", "Tuesday", "Wednesday"}, {"Bugatti","Porshe","Lambo","Mercedes","Rolls Royce"}};
		for (int i = 0; i < dayscars.length; ++i) {
	        for(int j = 0; j < dayscars[i].length; ++j) {
	           System.out.println(dayscars[i][j]);
	        }
	     }
	}
}
		
		