import java.util.Scanner;
public class q2352_semiconductor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] port = new int[num];
		int count = num;
		int[] twist = new int[num];	//꼬인 선의 개수
		int[] compare = new int[num]; //점과 선택한 점과의 거리
		int bigTwist = 0;
		int check = 0;
		int bigSize = 0;
		
		int cnt = 0;
		
		for(int i=0; i<num ; i++){			//각 포트가 몇번 포트를 가리키는지 입력
			port[i] = scan.nextInt();
		}
		
		for(int i=0; i<num ; i++){	//점과 선택한 점과의 거리 알아내기.
			if(i+1>port[i]){
				compare[i] = (i+1)-port[i];
			}
			else if(i+1 == port[i]){
				compare[i] = 0;
			}
			else{
				compare[i] = port[i]-(i+1);
			}
		}
		
		for(int std=0 ; std<num ; std++){	//각 점 마다 꼬인 선의 개수 알아내기.
			for(int target=0 ; target<num ; target++){
				if(target==std){
					continue;
				}
				if((target<std && port[target]>port[std]) || (target>std && port[target]<port[std])){
					twist[std]++;
				}
			}
		}
		

		while(true){
			check = 0;
			
			bigSize = 0;
			
			for(int i=0; i<num ; i++){	//bigTwist 초기화
				if(twist[i] == num+10){
					continue;
				}
				if(bigSize<=twist[i]){
					bigSize = twist[i];
					bigTwist = i;
				}
				if(bigTwist != 0){
					break;
				}
			}
			
			for(int i=0; i<num ; i++){	//꼬인선이 가장 많은 선 구하기. (만약 같다면 두 점사이 거리가 먼 것을 먼저 채택)
				if(twist[i] == num+10){
					continue;
				}
				if(bigSize<=twist[i]){
					bigSize = twist[i];
					if(compare[bigTwist]<compare[i]){
						bigTwist = i;
					}
				}
			}
			
			twist[bigTwist] = num+10;		//채택된 선 지우기. (여기선 num+10의 값을 가지면 없어지는 것으로 정의)
			
			for(int i=0 ; i<num ; i++){		//꼬인 선의 개수 초기화
				if(twist[i] != num+10){
					twist[i] = 0;
				}
			}
			
			for(int std=0 ; std<num ; std++){	//각 점 마다 꼬인 선의 개수 다시 알아내기.
				
				if(twist[std]==num+10){		//만약 지워진 선이라면 넘겨라
					continue;
				}
				
				for(int target=0 ; target<num ; target++){
					if(target==std){
						continue;
					}
					if(twist[target] == num+10){
						continue;
					}
					if((target<std && port[target]>port[std]) || (target>std && port[target]<port[std])){
						twist[std]++;
					}
				}
			}
			
			for(int i=0; i<num ; i++){
				if((twist[i] != num+10) && twist[i] != 0){
					check++;
				}
			}
			
			if(check == 0){
				for(int i=0 ; i<num ; i++){
					if(twist[i] == 0){
						count--;
					}
				}
				break;
			}

		}

		System.out.println(count);

		
		
	}
}
