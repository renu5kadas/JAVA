class testmemberouter1{
	private int data=30;
	class inner{
		void mesg(){
			System.out.println("data is"+data);
		}
	}
	public static void main(String args[]){
		testmemberouter1 obj=new testmemberouter1();
		testmemberouter1.inner in=obj.new inner();
		in.mesg();
	}
}
