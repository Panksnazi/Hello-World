import java.util.Scanner;
class DecimalToBinary{
public static void main(String[] args){
		int num = 0, i=0;
		int[] result = new int[8];
		
		System.out.println("Please enter the number:::");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num >0)
		{
			result[i++] = num % 2;
			num = num/2;
		}
		
		for(i=result.length-1; i>=0;i--){
		  System.out.print(result[i]);
		}
	}
}