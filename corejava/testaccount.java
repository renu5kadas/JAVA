class account{
	int accno;
	String name;
	float amt;
	void insert(int a;String n;float am){
		accno=a;
		name=n;
		amt=am;
	}
	void deposit(float am){
		amt=amt+am;
	}
	void withdraw(float am){
		if(am>amt){
			System.out.println("INUFFICIENT BALANCE");
		}
		else{
			amt=amt-am;
			System.out.println(am+"WITHDRAWN");
		}
	}
	void checkbalana
}
class testaccount{
	public static void main(String args[]){
		
	
