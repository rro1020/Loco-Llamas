class Subtraction extends Equation{
    public Subtraction(Fraction a, Fraction b){
		this.frac1 = a; 
		this.frac2 = b; 
		System.out.println("frac1 = " + frac1.getValue()); 
		System.out.println("frac2 = " + frac2.getValue()); 
		
		Fraction sumFrac; 
		if (frac1.getDenominator() == frac2.getDenominator()){
			sumFrac = new Fraction((frac1.getNumerator() - frac2.getNumerator()), frac1.getDenominator()); 
		} else {
			int lcd = lcm(frac1.getDenominator(), frac2.getDenominator()); 
			sumFrac = new Fraction(-1 * frac1.getNumerator() * lcd/frac2.getDenominator() + frac2.getNumerator() * lcd/frac1.getDenominator(), lcd); 
		}
		this.finalAnswer = sumFrac; 
		finalAnswer.print(); 
		
		this.finalValue = frac1.getValue() - frac2.getValue(); 
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