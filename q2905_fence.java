import java.util.Scanner;
public class q2905_fence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N,X; 	//N은 널빤지 수 , X는 롤러의 너비
		N = scan.nextInt(); X = scan.nextInt();
		
		int count = 0;
		int whileNum = 0;
		int[] nHei = new int[N+10];	//널빤지 높이 정의
		int[] minHei = new int[N+10]; //각 기준점에서 최소높이를 정의.
		
		int notRollerWidth = 0;
		
		for(int i=0 ; i<N ; i++){			//널빤지의 높이를 받아온다.
			nHei[i] = scan.nextInt();
		}
		
		for(int i=0 ; i<N; i++){		//최소높이 초기화
			minHei[i] = nHei[i];
		}
		
		for(int std=0 ; std<N-X+1 ; std++){				//N-X+1 까지, 각 기준점에 따른 최소높이를 구한다.
			for(int target=std ; target<std+X; target++){
				if(minHei[std]>=nHei[target]){
					minHei[std] = nHei[target];
				}
			}
		}
		
		do{
			int tempo = minHei[whileNum];
			for(int i=whileNum ; i<whileNum+X ; i++){			//롤러를 칠하고, 그 칠한 높이를 지정
				if(minHei[i]<minHei[whileNum]){
					minHei[i] = tempo;
				}
			}
			count++;
			
			int temp = whileNum;
			
			for(int i = whileNum ; i<whileNum+X ; i++){ //최소높이가 다른 곳이 발견 됐을 때, 그쪽으로 이동해라.
				
				if(i>N-X+1){
					for(int a= N-X+1 ; a<N ; a++){				//끝부분 최소높이 정의
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
			
			if(whileNum == temp){			//만약 높이가 일정하다면, 건너뛰어라
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
		
		
		for(int i= N-X+1 ; i<N ; i++){			//끝부분 최소높이 정의
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
		
		if(whileNum<N && whileNum>=N-X+1){		//만약 끝부분이 점점 작아지는 경우라면, count++
			for(int i=whileNum ; i<N ; i++){
				for(int j=i+1 ; i<j+1 ; i++){
					if(minHei[i]>minHei[j] && i!=N-1){
						count++;;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<N;i++){			//넓이의 최솟값 구하기
			notRollerWidth += (nHei[i] - minHei[i]);
		}
		
		System.out.println(notRollerWidth);
		System.out.println(count);
	}
}