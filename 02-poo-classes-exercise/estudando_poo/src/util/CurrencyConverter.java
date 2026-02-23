package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double calculoConversao(double priceDollar, double amount) {
		return   (priceDollar * amount ) + (priceDollar * amount ) * IOF;
	}
}
