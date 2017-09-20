import java.util.Scanner;


public class Task1_3 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*10);
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;//счетчик попыток 
		
		while(i<3){
			System.out.println("Введите ваше число");
			int answer = sc.nextInt();
			if(answer==x){
				System.out.println("Вы угадали!");
				break;
			}
			if(i!=2){
				System.out.println("Попробуйте еще раз");
			}
			else{
				System.out.println("Вы проиграли");
			}
			i++;
		}
		sc.close();
		
		

	}

}
