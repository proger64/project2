import java.util.Scanner;


public class TestInfinity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.nextLine();
			System.out.println("�� �����: "+s);
			if(s.equals("stop")){
				break;
			}
		}

	}

}
