import java.util.Scanner;
public class q1946_newRecruit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();  //�׽�Ʈ�� ���� �Է�
		int[] result = new int[T];
		int count = 0;
		for(int i=0; i<T ; i++){
			int N = scan.nextInt(); //������ �� �Է�
			int[] rank = new int[2*N]; //rank�� ¦���κ��� �������� , Ȧ���κ��� ��������
			int[] check = new int[N]; //�հ��� �� �ִ� ������ �������� �Ǵ� �ϱ� ���� ����
			int temp = 0;
			
			for(int j=0 ; j<2*N ; j++){ //�����ڵ��� ������ �Է¹޴´�.
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
