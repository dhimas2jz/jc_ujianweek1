package soalujian;
import java.util.Scanner;

public class ujian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float inci,meter;

		System.out.println("Masukkan Inch : ");
		inci = input.nextFloat();
		meter = inci * 254/10000;

		System.out.println(inci + " Inch Adalah " +meter+ " Meter");
	}

}
