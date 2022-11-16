package LabDay1;

public class Account {

	
	



	public static void main(String[] args) {
		
		Account accobj =new Account(102 ,"Rushi",2330.6f);
		
		System.out.println("Main Begine");
		
		System.out.println("accobj"+accobj);
		System.out.println("End of main");


	}

	 private int Accountnumber;
	 private String AccountHolder;
	 private float Acoountbalance;
	 
	 
	public Account(int accountnumber, String accountHolder, float acoountbalance) {
		super();
		Accountnumber = accountnumber;
		AccountHolder = accountHolder;
		Acoountbalance = acoountbalance;
	}



	@Override
	public String toString() {
		return "Account [Accountnumber=" + Accountnumber + ", AccountHolder=" + AccountHolder + ", Acoountbalance="
				+ Acoountbalance + "]";
	}
	 
	 
}
