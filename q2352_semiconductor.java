import java.util.Scanner;
public class q2352_semiconductor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] port = new int[num];
		int count = num;
		int[] twist = new int[num];	//���� ���� ����
		int[] compare = new int[num]; //���� ������ ������ �Ÿ�
		int bigTwist = 0;
		int check = 0;
		int bigSize = 0;
		
		int cnt = 0;
		
		for(int i=0; i<num ; i++){			//�� ��Ʈ�� ��� ��Ʈ�� ����Ű���� �Է�
			port[i] = scan.nextInt();
		}
		
		for(int i=0; i<num ; i++){	//���� ������ ������ �Ÿ� �˾Ƴ���.
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
		
		for(int std=0 ; std<num ; std++){	//�� �� ���� ���� ���� ���� �˾Ƴ���.
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
			
			for(int i=0; i<num ; i++){	//bigTwist �ʱ�ȭ
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
			
			for(int i=0; i<num ; i++){	//���μ��� ���� ���� �� ���ϱ�. (���� ���ٸ� �� ������ �Ÿ��� �� ���� ���� ä��)
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
			
			twist[bigTwist] = num+10;		//ä�õ� �� �����. (���⼱ num+10�� ���� ������ �������� ������ ����)
			
			for(int i=0 ; i<num ; i++){		//���� ���� ���� �ʱ�ȭ
				if(twist[i] != num+10){
					twist[i] = 0;
				}
			}
			
			for(int std=0 ; std<num ; std++){	//�� �� ���� ���� ���� ���� �ٽ� �˾Ƴ���.
				
				if(twist[std]==num+10){		//���� ������ ���̶�� �Ѱܶ�
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
