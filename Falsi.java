import java.util.Scanner;
public class Falsi {

	public static double Fx(double num){
		double result = (num*num*num) + (2*num*num) - 1;
		return result;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double xl,xu,xr;
		int i = 0;
		int n;
		
		
		System.out.println("���� xl�� xu�� �Է����ּ���.");
		xl = scan.nextInt(); xu = scan.nextInt();
		System.out.println("�Լ��� �ݺ� �� Ƚ�� n�� �Է����ּ���.");
		n = scan.nextInt();
		
		double[] value = new double[n];
		
		if(Fx(xl)*Fx(xu)<0){
			while(i < n){
				xr = (xu - ((Fx(xu)*(xl-xu))/(Fx(xl)-Fx(xu))));
				if(Fx(xl)*Fx(xr)>0){
					xl = xr;
					value[i]=xr;
				}
				else if(Fx(xl)*Fx(xr)<0){
					xu = xr;
					value[i]=xr;
				}
				i++;
			}
		}

		System.out.println(value[i-1]);
	}

}
