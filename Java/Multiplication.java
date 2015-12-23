class Multiplication extends Equation{
    public Multiplication(Fraction a, Fraction b){
		/*
        this.frac1.numerator = a.numerator; 
        this.frac1.denominator = a.denominator; 
        this.frac2.numerator = b.numerator; 
        this.frac2.denominator = b.denominator; 
		*/ 
		this.frac1 = a; 
		this.frac2 = b;
		
		Fraction productFrac = new Fraction(frac1.getNumerator() * frac2.getNumerator(), frac1.getDenominator() * frac2.getDenominator()); 
		
		//int lcd = lcd(frac1.getDenominator(), frac2.getDenominator()); 
		//int num = (frac1.getNumerator() * lcd/frac2.getDenominator() * frac2.getNumerator() * lcd/frac1.getDenominator()); 
		
		this.finalAnswer = productFrac; 
		this.finalValue = frac1.getValue() * frac2.getValue(); 	
		
		
    }
    
    Fraction computeAnswer(){
		return new Fraction(1, 1); 
    }
    
    boolean isCorrect(double val){
        return (finalValue == val); 
    }

	boolean isCorrect(Fraction f){
		return (f.getNumerator() == this.finalAnswer.getNumerator() && 
				 f.getDenominator() == this.finalAnswer.getDenominator()); 
	}	
	
}