import java.util.Scanner;


public class Task1_3 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*10);
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;//������� ������� 
		
		while(i<3){
			System.out.println("������� ���� �����");
			int answer = sc.nextInt();
			if(answer==x){
				System.out.println("�� �������!");
				break;
			}
			if(i!=2){
				System.out.println("���������� ��� ���");
			}
			else{
				System.out.println("�� ���������");
			}
			i++;
		}
		sc.close();
		
		

	}

}
