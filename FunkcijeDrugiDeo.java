import java.rmi.UnexpectedException;
import java.util.LinkedList;

public class FunkcijeDrugiDeo {

	public static LinkedList<ComplexNumber> ComplexNumberList = new LinkedList<ComplexNumber>();

	public static LinkedList<ComplexNumber> sumComplexNumbers(ComplexNumber complexFirst, ComplexNumber complexSecond, int n) throws UnexpectedException {
		
		for (int i = 0; i < n; i++) {
			if(complexFirst.real - i <= 0)
				throw new UnexpectedException("Must be grater than zero.");
			ComplexNumberList.add(ComplexNumber.calcOne(complexFirst, complexSecond));
		}
		return ComplexNumberList;
	}
}
