import java.util.Scanner;
public class q9935_exploString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String explode = "";
		String str = "";
		String[] test = new String[str.length()];
		
		str = scan.nextLine();
		explode = scan.nextLine();
		
		if(str.contains(explode)){
			test = str.split(explode);				//explode를 공백문자취급해서 앞뒤로 배열을 이용해 나눔.
			for(int i=0;i<test.length;i++){
				System.out.print(test[i]);			//explode가 공백문자 취급 됐으니, 이를 제외한 문자가 출력될 것.
			}
		}
		else{
			System.out.println("FRULA");
		}

	}

}
