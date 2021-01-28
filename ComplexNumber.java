import java.rmi.UnexpectedException;

public class ComplexNumber {

	double real, img;

	public ComplexNumber(double r, double i) {
		if (Math.sqrt(i) > r)
			throw new ExceptionInInitializerError();
		this.real = r;
		this.img = i;
	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {

		ComplexNumber temp = new ComplexNumber(0, 0);

		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		if (temp.real > 1000.00)
			throw new ArithmeticException();

		return temp;
	}

	public static ComplexNumber calcOne(ComplexNumber c1, ComplexNumber c2) throws UnexpectedException {

		ComplexNumber temp = new ComplexNumber(0, 0);

		temp.real = c1.real * c2.real;
		temp.img = c1.img / c2.img;

		return temp;
	}

	public double getComplexNumberRealPart() {
		return this.real;
	}

	public double getComplexNumberImgPart() {
		return this.img;
	}

}
