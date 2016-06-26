import java.util.Scanner;
public class q11399_ATM {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = 0;  //사람의 수
		N = scan.nextInt();
		int[] P = new int[N]; //각 사람들의 인출 시간
		int temp = 0;
		int[] add = new int[N];
		int result = 0;
		
		for(int i=0; i<N ; i++){
			P[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<N ; i++){
			for(int j=0; j<N ; j++){
				if(P[i]<P[j]){
					temp = P[j];
					P[j] = P[i];
					P[i] = temp;
				}
			}
		}
		temp = 0;
		for(int i=0 ; i<N ; i++){
			temp = temp + P[i];
			add[i] = temp;
			
		}
		for(int i=0; i<N ; i++){
			result = result + add[i];
		}
		
		System.out.println(result);

	}
}
