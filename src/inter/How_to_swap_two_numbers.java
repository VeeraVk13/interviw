package inter;



public class How_to_swap_two_numbers {
public void usingthiredverable() {
	int a=20;
	int b=60;
	System.out.println( "berfe:"+a +"berfe:"+b);
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println("berfe:"+a +"berfe:"+b);
}public void fr() {
	int a=20;
	int b=60;
	System.out.println( "berfe:"+a +"berfe:"+b);
	a=a-b;
	b=a+b;
	a=b-a;
	
	System.out.println("berfe:"+a +"berfe:"+b);
}
public static void main(String[] args) {
	How_to_swap_two_numbers a=new How_to_swap_two_numbers();
	a.fr();
}
}
