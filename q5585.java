import java.util.Scanner;

public class q5585 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price;
		int fivehun = 0;
		int onehun = 0;
		int fifty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int rest = 0;
		price = scan.nextInt();
		rest = 1000-price;
		
		if(price<=1000) {
			if(rest>=500) {
				fivehun = rest/500;
				rest = rest - 500;
			}
			if(rest>=100) {
				onehun = rest/100;
				rest = rest - (100*onehun);
			}
			if(rest>=50) {
				fifty = rest/50;
				rest = rest - (50*fifty);
			}
			if(rest>=10) {
				ten = rest/10;
				rest = rest - (10*ten);
			}
			if(rest>=5) {
				five = rest/5;
				rest = rest - 5;
			}
			if(price>=1) {
				one = rest;
			}
			System.out.println(fivehun+onehun+fifty+ten+five+one);
		}
		else{
			System.out.println("1000이하의 수를 입력해주세요.");
		}

	}

}
