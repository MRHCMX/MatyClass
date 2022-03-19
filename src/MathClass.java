import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Random;
import java.util.stream.IntStream;

public class MathClass {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.sqrt(16));
		
		double intRaiz = (int) Math.sqrt(17);
		System.out.println(intRaiz);
		
		System.out.println(Math.pow(10, 3));
		
		System.out.print("\nMaximo: ");
		int intArray[] = {2,75,85,92,64,53,2,0};
		int intMax = intArray[0];
		
		for (int i=1; i<intArray.length; i++)
		{
			intMax = Math.max(intMax, intArray[i]);
		}
		System.out.println(intMax);
		
		System.out.println("\nMelate");
		for(int i=0; i<=6; i++)
		{
			int intNumRan= Math.round((float)Math.random()*100) ;
			if (intNumRan > 0 && intNumRan <=52)
			{
				System.out.println(intNumRan);
			} else {
				i--;
			}
		}
		
		System.out.println("\nMelate2");
		Random numRam = new Random();
		int iMin = 1, iMax = 52;
		IntStream stream = numRam.ints(6, iMin, iMax);
		stream.forEach(System.out::println);
		
		System.out.println("\nBigInteger");
		BigInteger bInt1 = new BigInteger("12345678901234567890");
		BigInteger bInt2 = BigInteger.valueOf(12345678901444L);
		BigInteger bInt3 = BigInteger.TEN;
		System.out.println(bInt1);
		System.out.println(bInt2);
		System.out.println(bInt3);
		
		System.out.println("\nBigInteger operaciones");
		System.out.println(bInt1);
		System.out.println(bInt1.divide(BigInteger.TEN).multiply(BigInteger.TEN));
		
		System.out.println("\nBigDecimal");
		BigDecimal bDec1 = new BigDecimal("12345678901234567890.0000");
		BigDecimal bDec2 = BigDecimal.valueOf(12345678901234567890000055.0000D);  //Cuidado esta perdiendo datos por la conversión de double a BigDecimal, solo usar con valores que esten seguros que podran soportar la conversión
		System.out.println(bDec2.toPlainString());
		System.out.println(bDec2.toPlainString());
		
		System.out.println("\nBigDecimal operaciones");
		System.out.println("Resta: " + bDec1.subtract(bDec2));
		System.out.println("Suma:" + bDec1.add(bDec2));
		MathContext mc = new MathContext(26); //Sirve para definir la precisión
		System.out.println("Raiz cuadrada:" + bDec1.sqrt(mc));
	}
}
