import java.util.Scanner;

public class q10156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k,n,m;
		int money = 0;
		
		k = scan.nextInt(); n = scan.nextInt(); m = scan.nextInt();
		
		if(k <= 1000 && n<= 1000 && m<=100000 && k >=1 && n >=1 && m>=1 ){
		
			if(k*n>=m){
				money = k*n-m;
			}
			System.out.println(money);
		}
	}

}
