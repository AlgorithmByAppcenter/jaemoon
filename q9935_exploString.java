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
			test = str.split(explode);				//explode�� ���鹮������ؼ� �յڷ� �迭�� �̿��� ����.
			for(int i=0;i<test.length;i++){
				System.out.print(test[i]);			//explode�� ���鹮�� ��� ������, �̸� ������ ���ڰ� ��µ� ��.
			}
		}
		else{
			System.out.println("FRULA");
		}

	}

}
