import java.util.Scanner;
public class q1725_histogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int whileValue = 1;
		int area = 0; //���� ū ���簢���� ����
		int num;
		num = scan.nextInt();   //�簢���� ���ڸ� �Է��Ѵ�.
			
		int xValue = 1;
		int yValue = 0;
		int[] Y = new int[num];
		for(int i=0; i<num ; i++){
			Y[i] = scan.nextInt();    //for���� ���� ���簢���� ���̸� �޾ƿ´�.
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
