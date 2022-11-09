public class Demo{
	int a=10;
	public static void main(String []args){
		System.out.println("main");
		m1(10);
	}
	static void m1(int a){
		if(a==5){
			a++;
			System.out.println("A :"+a);
		}
		else{
			System.out.println("A :"+a);
		}
	}
}