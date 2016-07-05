import java.util.Scanner;
public class q2905_fence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N,X; 	//N�� �κ��� �� , X�� �ѷ��� �ʺ�
		N = scan.nextInt(); X = scan.nextInt();
		
		int count = 0;
		int whileNum = 0;
		int[] nHei = new int[N+10];	//�κ��� ���� ����
		int[] minHei = new int[N+10]; //�� ���������� �ּҳ��̸� ����.
		
		int notRollerWidth = 0;
		
		for(int i=0 ; i<N ; i++){			//�κ����� ���̸� �޾ƿ´�.
			nHei[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<N; i++){		//�ּҳ��� �ʱ�ȭ
			minHei[i] = nHei[i];
		}
		
		for(int std=0 ; std<N-X+1 ; std++){				//N-X+1 ����, �� �������� ���� �ּҳ��̸� ���Ѵ�.
			for(int target=std ; target<std+X; target++){
				if(minHei[std]>=nHei[target]){
					minHei[std] = nHei[target];
				}
			}
		}
		
		do{
			int tempo = minHei[whileNum];
			for(int i=whileNum ; i<whileNum+X ; i++){			//�ѷ��� ĥ�ϰ�, �� ĥ�� ���̸� ����
				if(minHei[i]<minHei[whileNum]){
					minHei[i] = tempo;
				}
			}
			count++;
			
			int temp = whileNum;
			
			for(int i = whileNum ; i<whileNum+X ; i++){ //�ּҳ��̰� �ٸ� ���� �߰� ���� ��, �������� �̵��ض�.
				
				if(i>N-X+1){
					for(int a= N-X+1 ; a<N ; a++){				//���κ� �ּҳ��� ����
						if(nHei[a]>=minHei[a-1]){
							minHei[a] = minHei[a-1];
						}
						else{
							for(int j=N-X+1 ; j<N ; j++){
								if(minHei[a]>minHei[j]){
									minHei[a] = minHei[j];
								}
							}
						}
					}
				}
				if(minHei[whileNum]!=minHei[i]){
					whileNum = i;
					break;
				}
			}
			
			if(whileNum == temp){			//���� ���̰� �����ϴٸ�, �ǳʶپ��
				if(whileNum+X>=N-X+1 && whileNum+X<N){
					whileNum = whileNum+X;
					count++;
					break;
				}
				else{
					whileNum = whileNum+X;
				}
			}
			
			
		} while(whileNum<N-X+1); 
		
		
		for(int i= N-X+1 ; i<N ; i++){			//���κ� �ּҳ��� ����
			if(nHei[i]>=minHei[i-1]){
					minHei[i] = minHei[i-1];
			}
			else{
				for(int j=N-X+1 ; j<N ; j++){
					if(minHei[i]>minHei[j]){
						minHei[i] = minHei[j];
					}
				}
			}
		}
		
		if(whileNum<N && whileNum>=N-X+1){		//���� ���κ��� ���� �۾����� �����, count++
			for(int i=whileNum ; i<N ; i++){
				for(int j=i+1 ; i<j+1 ; i++){
					if(minHei[i]>minHei[j] && i!=N-1){
						count++;;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<N;i++){			//������ �ּڰ� ���ϱ�
			notRollerWidth += (nHei[i] - minHei[i]);
		}
		
		System.out.println(notRollerWidth);
		System.out.println(count);
	}
}