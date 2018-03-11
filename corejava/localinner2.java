class localinner2
{
	private int data=30;
	void display(){
		int value=50;
		class local
		{
			void mesg(){
				System.out.println("value is "+value);
				System.out.println("data is " +data);
			}
		}
		local i=new local();
		i.mesg();
	}
	public static void main(String args[])
	{
		localinner2 obj=new localinner2();
		obj.display();
	}
}
