public class LlamaMain{

     public static void main(String[] args){
        System.out.println("Hello World");
        Fraction frac = new Fraction(1, 2); 
        Fraction stringFrac = new Fraction("1/4"); 
		Fraction otherFrac = new Fraction(1, 3); 
        System.out.println(frac.getNumerator() + " / " + frac.getDenominator()); 
        System.out.println(stringFrac.getNumerator() + " / " + stringFrac.getDenominator()); 
		Addition add = new Addition(frac, stringFrac); 
		System.out.println("Final value = " + add.finalValue); 
		System.out.println("Is 1.25 correct? " + add.isCorrect(.75)); 
		System.out.println("Is 5/6 correct? " + add.isCorrect(new Fraction(3, 4))); 
		Multiplication mul = new Multiplication(frac, stringFrac); 
		System.out.println("Is 1/6 correct? " + mul.isCorrect(new Fraction(1, 8))); 
     }
}
