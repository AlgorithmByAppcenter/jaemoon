import java.util.Scanner;
public class q11047_coin0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = 0 ; //동전 종류 수
		N = scan.nextInt();
		int K = 0 ; // 금액
		K = scan.nextInt();
		int[] A = new int[N]; //동전의 가치
		int count = 0;
		
		
		for(int i=0 ; i<N ; i++){ //동전의 가치 입력
			A[i] = scan.nextInt();
		}
		
		for(int i = N-1 ; i>=0 ; i--){
			count = count + (K/A[i]);
			K = K - A[i]*(K/A[i]);
		}
		
		System.out.println(count);
	}

}
