class Division extends Equation{
    public Division(Fraction a, Fraction b){
		this.frac1 = a; 
		this.frac2 = b;
		
		Fraction quotientFrac = new Fraction(frac1.getNumerator() * frac2.getDenominator(), frac1.getDenominator() * frac2.getNumerator()); 
		
		this.finalAnswer = quotientFrac; 
		this.finalValue = frac1.getValue() / frac2.getValue(); 	
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