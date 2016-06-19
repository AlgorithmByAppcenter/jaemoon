import java.util.Scanner;
public class q1725_histogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int whileValue = 1;
		int area = 0; //가장 큰 직사각형의 넓이
		int num;
		num = scan.nextInt();   //사각형의 숫자를 입력한다.
			
		int xValue = 1;
		int yValue = 0;
		int[] Y = new int[num];
		for(int i=0; i<num ; i++){
			Y[i] = scan.nextInt();    //for문을 통해 직사각형의 높이를 받아온다.
		}
		
		for(int i=0; i<num; i++){
			xValue=1;
			yValue=Y[i];
			for(int j=i+1 ; j<num; j++){
				if(Y[i]<=Y[j]){
					xValue++;
					if(Y[i]<=yValue){
						yValue=Y[i];
					}
					if(area<=xValue*yValue){
						area=xValue*yValue;
					}
				}
				else{
					xValue++;
					if(Y[j]<=yValue){
						yValue=Y[j];
						if(area<=xValue*yValue){
							area=xValue*yValue;
						}
					}
				}
			}
		}
		
		
		System.out.println(area);
	}
}
