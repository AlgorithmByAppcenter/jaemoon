import java.util.Scanner;

public class q10707 {
	
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);   
		int a,b,c,d,p;
		int Xvalue,Yvalue,value;
		
		
		a = scan.nextInt();        // ���� ���� �Է�
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		p = scan.nextInt();
		
		Xvalue = p*a;
		if(p<=c){
			Yvalue = b;
		}
		else{
			Yvalue = b+(p-c)*d;
		}
		
		if(Xvalue>Yvalue){
			value = Yvalue;
		}
		else{
			value = Xvalue;
		}
		if(a>10000 || b>10000 || c>10000 || d>10000 || p>10000 || a<1 || b<1 || c<1 || d<1 || p<1){
			System.out.println("1�̻�10000������ �ڿ����� �Է����ּ���.");
		}
		else{
		System.out.println(value);
		}
	}
	
}
