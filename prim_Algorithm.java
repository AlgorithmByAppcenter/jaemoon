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
					
					if(visited[i] == 1){	//방문했던 노드에서 길을 개척해야 하니, 방문했던 노드를 찾는 판단문
						
						for(int j = 0 ; j<5 ; j++){
							
							if(visited[j] != 1){		//방문하지 않는 노드로 길을 개척해야 하니, 방문하지 않았던 노드를 찾는 판단문
								
								if(min > matrix[i][j]){			//i와 연결된 선 중 가장 낮은 가중치를 가진 선을 구하는 과정
									
									min = matrix[i][j];
									u = i;
									v = j;
									
								}
								
							}
							
						}
						
					}	
				}
				
				visited[v] = 1;				// 방문 했으면, 다신 방문하지 마라.
				total+=min;
				System.out.println("Edge found: " +u+ "->" +v+ ": Weight:" + min);
				
			}
			
			System.out.println("The weight of the minimum spnning tree is: " + total);
			
	}
}
