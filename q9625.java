import java.util.Scanner;

public class q9625 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k,i;
		int Acount = 0;
		int Bcount = 0;
		String screen = "A";
		
		k = scan.nextInt();
		
		if(k<=45){
		for(i=0 ; i<k ; i++){
			screen = screen.replace('A','C');
			screen = screen.replace("B","BA");
			screen = screen.replace('C','B');
		}
		
		for(i=0;i<screen.length();i++){
			if(screen.charAt(i) == 'A'){
				Acount++;
			}
			else{
				Bcount++;
			}
		}
		System.out.println(Acount + " " + Bcount);
	}
		else{
			System.out.println("45보다 작은 수를 입력해주세요.");
		}
	}

}
