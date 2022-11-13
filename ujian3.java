package soalujian;
import java.util.Scanner;

public class ujian3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    
    int menit, hari, bulan, tahun;
    
    System.out.print("Berapa menit yang akan dikonversi ? : ");
    menit = input.nextInt();
    
    tahun =(menit/525600);
    bulan =(menit/43800);
    hari = (menit/1440);
    
    System.out.println("Dalam tahun : "+tahun+" Tahun ");
    System.out.println("Dalam bulan : "+bulan+" bulan ");
    System.out.println("Dalam hari : "+hari+" hari ");
	}
}
