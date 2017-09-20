import java.util.Scanner;


public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int error = 0;//счетчик ошибок
		
		for(int i=1;i<=5;i++){
			int x = (int)(Math.random()*9+1);
			int y = (int)(Math.random()*9+1);
			int res  = x * y;
			
			System.out.print(x + "*" +y +"=");
			int answer = sc.nextInt();
			if(answer!=res){
				error++;
				System.out.println("Вы ошиблись! Правильный ответ: "+res);
			}
		}
		switch (error) {
		case 0:
			System.out.println("Оценка 5");
			break;
		case 1:
		case 2:
			System.out.println("Оценка 4");
			break;
		default:
			System.out.println("Оценка неуд");			
		}

	}

}
