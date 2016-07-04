import java.util.Scanner;
public class q2816_digitTV {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cursor = 0;
		String temp;
		int N = scan.nextInt();
		String[] Channel = new String[N+11];

		for(int i=0 ; i<N ; i++){
			Channel[i] = scan.next();
		}
		try{
		while(true){
			
			if(Channel[0].equals("KBS1")){
				
				if(Channel[1].equals("KBS2")){
					break;
				}
				else{
					
					if(Channel[2].equals("KBS2")){
						temp = Channel[cursor];									//3번 동작
						Channel[cursor] = Channel[++cursor];
						Channel[cursor] = temp;
						System.out.print("3");
					}
					else{
						while(true){								//KBS1을 찾아서 그 위치에 커서를 놓는다.
							if(Channel[cursor].equals("KBS2")){
								break;
							}
							else{
								cursor++;										//1번 동작
								System.out.print("1");
							}
						}
						while(true){
							if(Channel[1].equals("KBS2")){
								break;
							}
							else{
								temp = Channel[cursor];									//4번 동작
								Channel[cursor] = Channel[--cursor];
								Channel[cursor] = temp;
								System.out.print("4");
							}
						}
					}
				}
			}
			
			
			else{
				if(Channel[1].equals("KBS1")){
					temp = Channel[cursor];									//3번 동작
					Channel[cursor] = Channel[++cursor];
					Channel[cursor] = temp;
					System.out.print("3");
				}
				else{
					while(true){								//KBS1을 찾아서 그 위치에 커서를 놓는다.
						if(Channel[cursor].equals("KBS1")){
							break;
						}
						else{
							cursor++;										//1번 동작
							System.out.print("1");
						}
					}
					while(true){
						if(Channel[0].equals("KBS1")){
							break;
						}
						else{
							temp = Channel[cursor];									//4번 동작
							Channel[cursor] = Channel[--cursor];
							Channel[cursor] = temp;
							System.out.print("4");
						}
					}
				}
			}
		}
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
	}

}
