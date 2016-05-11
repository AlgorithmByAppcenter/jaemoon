import java.util.Scanner;

public class q10707 {
	
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);   
		int a,b,c,d,p;
		int Xvalue,Yvalue,value;
		
		
		a = scan.nextInt();        // 숫자 정수 입력
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
			System.out.println("1이상10000이하의 자연수를 입력해주세요.");
		}
		else{
		System.out.println(value);
		}
	}
	
}
