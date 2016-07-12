import java.util.*;
public class q1700_multiTap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int plug = scan.nextInt();		int useCount = scan.nextInt();
		ArrayList<Integer> elec = new ArrayList<Integer>(plug+10);
		int[] useElec = new int[useCount+10];
		int[] distanceNum = new int[plug+10];
		int continueCheck;
		int pCheck;
		int check = 0;
		int inputCheck = 0;
		int dropNum = 0;
		int count = 0;
		int[] remainNum = new int[plug];
		
		for(int i=0 ; i<useCount ; i++){		//사용할 기구 지정
			useElec[i] = scan.nextInt();
		}
		


		for(int i=0 ; i<useCount ; i++){
			continueCheck = 0;
			check = 0;
			inputCheck = 0;
			if(i == useCount-1){
				for(int num = 0; num<plug ; num++){
					if(useElec[i] == elec.get(num)){
						inputCheck = 1;
					}
				}
				if(inputCheck != 1){
					count++;
					break;
				}
			}
			
			if(elec.size()<plug){
				elec.add(useElec[i]);
			}
			else{
				
				for(int g=0 ; g<plug ; g++){		
					remainNum[g] = 0;
				}
				for(int in=0 ; in<plug ; in++){
					distanceNum[in] = 101;
				}
				
				for(int j=0 ; j<plug ; j++){		//이미 스택에 들어가 있는 숫자라면 패스.
					if(useElec[i] == elec.get(j)){
						continueCheck = 1;
					}
				}
				if(continueCheck == 1){
					continue;
				}
				
				//스택에 들어가 있는 숫자가 아닐 때,
				for(int k=i+1 ; k<useCount ; k++){
					inputCheck = 0;
					for(int num = 0; num<plug ; num++){
						if(useElec[k] == elec.get(num)){
							inputCheck = 1;
						}
					}
					if(inputCheck == 1){
						pCheck = 0;
						if(k>useCount){
							break;
						}
						for(int a=0 ; a<plug ; a++){
							if(useElec[k] != distanceNum[a]){		//중복체크 방지
								pCheck++;
							}
						}
						if(pCheck == plug){
							distanceNum[check++] = useElec[k];
						}
					}
				}
				
		
				for(int cNum = 0 ; cNum<plug ; cNum++){
					if(cNum !=0 && distanceNum[cNum] == 101){
						for(int c=0 ; c<plug ; c++){
							if(distanceNum[c] == 101){
								break;
							}
							remainNum[c] = distanceNum[c];
						}
						break;
					}
					if(cNum ==0 && distanceNum[cNum] == 101){
						dropNum = elec.get(cNum);
						break;
					}
					dropNum = distanceNum[cNum];
				}
				
				for(int b=0 ; b<plug ; b++){
					int checkbox = 0;
					if(remainNum[0] != 0){
						for(int d=0 ; d<plug ; d++){
							if(elec.get(b) == remainNum[d]){
								break;
							}
							else{
								checkbox++;
							}
						}
						if(checkbox == plug){
							elec.remove(b);
							count++;
							elec.add(useElec[i]);
						}
					}
					else{
						if(elec.get(b) == dropNum){
							elec.remove(b);
							count++;
							elec.add(useElec[i]);
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
