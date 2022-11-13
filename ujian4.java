package soalujian;
import java.util.Scanner;

public class ujian4 {
	public static void main(String[] args) {
	Scanner masuk = new Scanner(System.in);
    float berat, tinggi, bmi, meter;
    double broca;
 
    System.out.print ("Masukan Berat: ");
    berat = masuk.nextFloat();
    System.out.print ("Masukan Tinggi: ");
    tinggi = masuk.nextFloat();
    meter=tinggi/100;

    bmi=(berat/(meter*meter));

    System.out.println("===============");
    System.out.print("BMI anda adalah: "+bmi+" ");
    
    if (bmi<18.5){
        System.out.println("(Kurus)");
    }else if (bmi<=24.9){
        System.out.println("(Normal)");
    }else if (bmi<29.9){
        System.out.println("(Overweight)"); 
    }else {
        System.out.println("(Obesitas)"); 
    }
	}
}
