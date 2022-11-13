package soalujian;
import java.util.Scanner;

public class ujian1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    
	    double celcius;
	    double fahrenheit;
	    
	    System.out.println("Nilai Fahrenheit : ");
	    fahrenheit = input.nextDouble();
	   
	    celcius = (5.0/9.0)*(fahrenheit-32.0);
	    
	    System.out.println(+fahrenheit+" Fahrenheit sama dengan "+celcius+" Celcius");
	}
}
