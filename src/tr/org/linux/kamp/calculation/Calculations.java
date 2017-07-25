package tr.org.linux.kamp.calculation;

public enum Calculations {
	
	TOPLA,CIKAR,BOL,CARP;
	
	//Calculation.TOPIC.calculation(x,y);
	public double calculate(double x,double y) {
		switch(this) {
		case TOPLA:
			return (x+y);
		case CIKAR:
			return (x-y);
		case CARP:
			return (x*y);
		case BOL:
			return (x/y);
		default:
			System.out.println("İşlem yanlış");
			return 0;
		}
		
		
	}
}
