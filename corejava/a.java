class simple{
	   static void passed(int c[]){
		int min=c[0];
		int i;
		for(i=1;i<c.length;i++){
			if (min<c[i]){
				min=c[i];
			}
		}
		System.out.println("Largest no. is "+min);
	}
	public static void main(String args[]){
		int a[]={1,2,3};
		int b[]=new int[3];
		b[0]=4;
		b[1]=5;
		b[2]=6;
		passed(a);
		passed(b);
	}
}
