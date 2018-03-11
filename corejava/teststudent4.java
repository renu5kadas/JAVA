class student{
	int rollno;
	String name;
	void insertrecord(int r,String n){
		rollno=r;
		name=n;
	}
	void displayinformation(){
		System.out.println(rollno+" "+name);
     }
}
class teststudent4{
	public static void main(String args[]){
		student s1=new student();
		student s2=new student();
		s1.insertrecord(111,"karan");
		s2.insertrecord(222,"aryan");
		s1.displayinformation();
		s2.displayinformation();
	}
}
