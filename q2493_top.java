import java.util.Scanner;
public class q2493_top {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		int[] tower = new int[num];
		int[] output = new int[num];
		for(int i=0;i<num;i++){
			tower[i] = scan.nextInt();
		}
		for(int j=0;j<num;j++){
			for(int z=j-1;z>-1;z--){
				if(tower[z]>=tower[j]){
					output[j] = z+1; 
					break;
				}
			}
			System.out.print(output[j]+" ");
		}
		

	}

}
