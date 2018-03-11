class rectangle1{
	int length;
	int width;
	void insert(int l,int w){
		length=l;
		width=w;
		System.out.println(l*w);
	}
}
class rectangle{
	public static void main(String args[]){
		rectangle1 r1=new rectangle1(),r2=new rectangle1();
		r1.insert(11,5);
		r2.insert(3,5);
	}
}
