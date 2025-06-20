package wrapperclass;

public class UppercaseLowerCaseDigitsSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JavA123%$";
		int lowercaseCount = 0;
		int uppercaseCount = 0;
		int digitCount = 0;
		int specialCount = 0;
		int sumofdigits = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				uppercaseCount++;
			} else if(Character.isLowerCase(s.charAt(i))) {
				lowercaseCount++;
			} else if(Character.isDigit(s.charAt(i))) {
				digitCount++;
				sumofdigits += Character.getNumericValue(s.charAt(i));
			} else {
				specialCount++;
			}
		}
		System.out.println("Lowercase: " + lowercaseCount);
		System.out.println("Uppercase: " + uppercaseCount);
		System.out.println("Digit: " + digitCount);
		System.out.println("Special characters: " + specialCount);
		System.out.println("Sum of digits in string: " + sumofdigits);

	}

}
