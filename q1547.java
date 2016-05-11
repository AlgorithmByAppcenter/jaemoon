import java.util.Scanner;
public class q1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int M,M1,M2;
		int i=0;
		int ary[]={1,0,0};
		M=scan.nextInt();
		if(M>50){
			System.out.println("50보다 작은 자연수를 입력해 주세요");
		}
		else{
		int temp=0;
		for(i=0;i<M;i++)
		{
			M1=scan.nextInt(); M2=scan.nextInt();
			temp=ary[M1-1];
			ary[M1-1]=ary[M2-1];
			ary[M2-1]=temp;
		}
		
		for(i=0;i<3;i++)
		{
			if(ary[i]==1)System.out.print(i+1);
		}
		}
	}

}
