import java.util.Scanner;
public class q1094 {
	
	public static void main(String[] args) {
		int min;
		Scanner scan = new Scanner(System.in);
		int X,total,count;
		X = scan.nextInt();
		min = 64;
		total = 64;
		count = 1;
		if(X>64){
			System.out.println("64보다 낮은 수를 입력해주세요.");
		}
		else{
		while(true){
			if(total>X){
				min = min/2;
				if(total-min>=X){
					total = total-min;
				}
				else{
					count++;
				}
			}
			else{
				break;
			}
		}
		System.out.println(count);
		}
	}
}	
