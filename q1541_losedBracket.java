import java.util.*;
public class q1541_losedBracket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String equation = scan.next();
		String[] minusDivision = new String[equation.length()];
		String[] plusDivision = new String[equation.length()];
	
		String plus = "\\+";
		String minus = "\\-";
		
		minusDivision = equation.split(minus);
		
		for(int i=1 ; i<minusDivision.length ; i++){
			plusDivision = minusDivision[i].split(plus);
		}
		
		String[] abc = minusDivision[0].split(plus);
		
		int result = 0;
		
		for(int i=0 ; i<abc.length ; i++){
			result = result + Integer.valueOf(abc[i]);
		}
		
		for(int i=1 ; i<minusDivision.length ; i++){
			String[] temp = minusDivision[i].split(plus);
			for(int j=0 ; j<temp.length ; j++){
				result = result - Integer.valueOf(temp[j]);
			}
		}
		
		System.out.println(result);

	}
}