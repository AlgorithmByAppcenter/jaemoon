import java.util.Scanner;
public class q1532 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int G1,S1,B1,G2,S2,B2;
		int count=0;
		G1 = scan.nextInt(); S1 = scan.nextInt(); B1 = scan.nextInt();
		G2 = scan.nextInt(); S2 = scan.nextInt(); B2 = scan.nextInt();
		
		while(true){
			if(G1<G2 && S1>=11){
				G2 = G2+S1/11;
				S1 = S1 - 11;
				count++;
				if(S1<11 && B1>=11){
					S1 = S1 + B1/11;
					B1 = B1 - 11;
					count++;
				}
			}
			if(G1>G2 && S1<S2 && B1>=11){
				S2 = S2+B1/11;
				B1 = B1 - 11;
				count++;
			}
			if(G1<G2 && S1<S2){
				S2 = S2+9;
				G1--;
				count++;
			}
			if(S1<S2 && B1<B2){
				B2 = B2+9;
				S1--;
				count++;
			}
			if(G1<=G2 && S1<=S2 && B1<=B2){
				break;
			}
		}
		System.out.println(count);
	}
}
