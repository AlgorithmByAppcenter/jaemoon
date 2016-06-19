import java.util.Scanner;
public class q10845_que {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;			//배열을 위한 i
		int num=0;
		int oppo=0;			//명령어 횟수
		String inst = "";
		oppo = scan.nextInt();
		int[] stack = new int[oppo];
		for(int j=0;j<oppo;j++){
			
			inst = scan.next(); 
			if(inst.equals("push")){
				num = scan.nextInt();
				stack[i] = num;
				i++;
			}
			else if(inst.equals("pop")){
				if(i!=0){
					i--;
					System.out.println(stack[0]);
					for(int d=0 ;d<i ;d++){
						stack[d] = stack[d+1];
					}
				}
				else{
					System.out.println("-1");
				}
			}
			else if(inst.equals("size")){
				System.out.println(i);
			}
			else if(inst.equals("empty")){
				if(i==0){
					System.out.println("1");
				}
				else{
					System.out.println("0");
				}
			}
			else if(inst.equals("back")){
				if(i!=0){
					i--;
					System.out.println(stack[i]);
					i++;
				}
				else{
					System.out.println("-1");
				}
			}
			else if(inst.equals("front")){
				if(i!=0){
						System.out.println(stack[0]);
				}
				else{
					System.out.println("-1");
				}
				
			}
		}

	}

}
