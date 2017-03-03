import java.util.Scanner;
public class SumNValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int a;
		int sum=0;
		
		System.out.print("Enter Value: ");
		a = input.nextInt();
		
		
		do{
			sum += a;//sum = sum + a
			a--;
		}while(a > 0);
		System.out.print(sum);
		
		input.close();
	}

}
