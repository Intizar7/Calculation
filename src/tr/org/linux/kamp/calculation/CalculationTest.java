package tr.org.linux.kamp.calculation;

import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class CalculationTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ilk sayi giriniz:");
		double x = sc.nextDouble();
		System.out.println("Ikinci sayi giriniz:");
		double y = sc.nextDouble();
		System.out.println("TOPLA için--> 1,CIKAR için-->2," + "CARP için-->3,BOL için-->4 "
				+ "yapmak istediğiniz işlemi seçiniz:");
		String result = sc.next();
		
		if(result.equals("1")) {
			System.out.println("TOPLAM SONUC:" + Calculations.TOPLA.calculate(x, y));
		}else if(result.equals("2")) {
			System.out.println("CIKAR SONUC:" + Calculations.CIKAR.calculate(x, y));
		}else if(result.equals("3")) {
			System.out.println("CARPIM SONUC:" + Calculations.CARP.calculate(x, y));
	    }else if(result.equals("4")) {
			System.out.println("BOL SONUC:" + Calculations.BOL.calculate(x, y));
	    }else {
			System.out.println("Lutfen 1 ile 4 arasında bir sayi giriniz:");
	    }
	}
}
