import java.util.Scanner;
public class q1946_newRecruit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();  //테스트의 갯수 입력
		int[] result = new int[T];
		int count = 0;
		for(int i=0; i<T ; i++){
			int N = scan.nextInt(); //지원자 수 입력
			int[] rank = new int[2*N]; //rank의 짝수부분은 서류순위 , 홀수부분은 면접순위
			int[] check = new int[N]; //합격할 수 있는 성적을 가졌는지 판단 하기 위한 변수
			int temp = 0;
			
			for(int j=0 ; j<2*N ; j++){ //지원자들의 순위를 입력받는다.
				rank[j] = scan.nextInt();
			}
			
			for(int j=0 ; j<2*N; j=j+2){
				count = 0;
				for(int k=0 ; k<2*N; k=k+2){
					if(rank[j]<rank[k] || rank[j+1]<rank[k+1]){
						count++;
					}
				}
				if(count == N-1){
					check[j/2] = 1;
				}
			}
			
			for(int m=0; m<N; m++){
				if(check[m]>0){
					temp++;
				}
			}
			
			result[i] = temp;
			
		}
		
		for(int i=0; i<T ; i++){
			System.out.println(result[i]);
		}
	}

}
