public class FunkcijePrviDeo {
	
	public static int decimaltoOctal(int num) { //Ako se unese >=999999999?  //Ako se unese <=0
		int rem;
	    String str=""; 
	    char dig[]={'0','1','2','3','4','5','6','7'};
	    while(num>0)
	    {
	       rem=num%8; 
	       str=dig[rem]+str; 
	       num=num/8;
	    }
	    return Integer.parseInt(str);
	}

	public static ComplexNumber sumComplexNumbers(double firstBase, double firstImag, double secondBase, double secondImag) {
		ComplexNumber complexFirst = new ComplexNumber(firstBase, firstImag);
		ComplexNumber complexSecond = new ComplexNumber(secondBase, secondImag);
		ComplexNumber resultOfSum = ComplexNumber.sum(complexFirst, complexSecond);		
        return resultOfSum;
	}
	
	public static Integer[] evenNumbers(int n) {
		Integer[] evenNumbers = new Integer[n/2];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			   if (i % 2 == 0)
				   evenNumbers[index++] = i;
			}
		return evenNumbers;
	}
	
}
