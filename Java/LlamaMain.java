public class LlamaMain{

     public static void main(String[] args){
        System.out.println("Hello World");
        Fraction frac = new Fraction(3, 5); 
        Fraction stringFrac = new Fraction("1/4"); 
		Fraction otherFrac = new Fraction(1, 3); 
        System.out.println(frac.getNumerator() + " / " + frac.getDenominator()); 
        System.out.println(stringFrac.getNumerator() + " / " + stringFrac.getDenominator()); 
		Addition add = new Addition(frac, stringFrac); 
		System.out.println("Final value = " + add.finalValue); 
		System.out.println("Is 1.25 correct? " + add.isCorrect(.75)); 
		System.out.println("Is 5/6 correct? " + add.isCorrect(new Fraction(3, 4))); 
		Multiplication mul = new Multiplication(frac, stringFrac); 
		//System.out.println("Is 1/8 correct? " + mul.isCorrect(new Fraction(1, 8))); 
		Subtraction sub = new Subtraction(frac, stringFrac); 
		System.out.println("Is 1/6 correct? " + sub.isCorrect(new Fraction(1, 6))); 
		Division div = new Division(frac, otherFrac); 
		System.out.println("Is 3/2 correct? " + div.isCorrect(new Fraction(3, 2)));
     }
}
