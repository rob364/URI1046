import java.util.Locale;
import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		
		if(val1 == val2) {
			System.out.println("O jogo durou 24 horas");
			
		}else if(val1 > val2) {
			int hour = (24 - val1 ) + val2;
			
			System.out.println("O jogo durou " + hour + "HORAS");
			
		}else {
			int hour = val2 - val1;
			
			System.out.println("O jogo durou " + hour + "Horas" );
		}
		sc.close();
		

	}

}
