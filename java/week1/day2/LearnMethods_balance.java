package week1.day2;

public class LearnMethods_balance {


		//global variable
		public int balance;
		
		

		//depositAmount
		//type method name -> ctrl+spae -> click enter
		// accessmodifier returntype methodname(input arguments)
		public void depositAmount(int amount) {  	
			balance	= amount;
			System.out.println(amount);
		}
		
		private int getBalance() {
			return balance;
		}

	}


