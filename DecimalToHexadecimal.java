import java.util.Scanner;

class DecimalToHexadecimal{
public static void main(String[] args){
	
	int dec_num = 0, rem=0;
	String hex_number = "";
	
	char[] hex ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the decimal number::: ");
	dec_num = sc.nextInt();
	while(dec_num > 0)
	  {
		rem = dec_num%16;
		dec_num = dec_num/16;
		hex_number = hex[rem]+hex_number;
	  }
	  
	  System.out.println(hex_number);
	}
}