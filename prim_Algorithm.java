import java.util.Scanner;
public class prim_Algorithm {

	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[][] matrix = new int[5][5];
		int[] visited = new int[5];
		int min = 999;
		int u = 0;
		int v = 0;
		int total = 0;
		
		for(int i=0 ; i<5 ; i++){
			
			visited[i] = 0;
			
			for(int j=0 ; j<5 ; j++){
				
				matrix[i][j] = scan.nextInt();
				
				if(matrix[i][j] == 0){
					
					matrix[i][j] = 999;
					
				}
				
			}
		}
			
	
			
			visited[0] = 1;
			
			for(int counter = 0 ; counter< 4 ; counter++){
				
				min = 999;
				
				for(int i=0 ; i<5 ; i++){
					
					if(visited[i] == 1){	//�湮�ߴ� ��忡�� ���� ��ô�ؾ� �ϴ�, �湮�ߴ� ��带 ã�� �Ǵܹ�
						
						for(int j = 0 ; j<5 ; j++){
							
							if(visited[j] != 1){		//�湮���� �ʴ� ���� ���� ��ô�ؾ� �ϴ�, �湮���� �ʾҴ� ��带 ã�� �Ǵܹ�
								
								if(min > matrix[i][j]){			//i�� ����� �� �� ���� ���� ����ġ�� ���� ���� ���ϴ� ����
									
									min = matrix[i][j];
									u = i;
									v = j;
									
								}
								
							}
							
						}
						
					}	
				}
				
				visited[v] = 1;				// �湮 ������, �ٽ� �湮���� ����.
				total+=min;
				System.out.println("Edge found: " +u+ "->" +v+ ": Weight:" + min);
				
			}
			
			System.out.println("The weight of the minimum spnning tree is: " + total);
			
	}
}
