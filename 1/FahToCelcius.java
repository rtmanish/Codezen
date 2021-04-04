import java.util.Scanner;

public class FahToCelcius {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int f= s.nextInt();
		
		//int c= (5/9)*(f-32);  becoz int/int gives integer so output is zero
		
		//int c=(5*(f-32))/9;
		int c= (int)((5.0/9)*(f-32));
		System.out.println(c);
	}

}
