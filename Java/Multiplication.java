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
		this.finalValue = frac1.getValue() * frac2.getValue(); 	
    }
    
    Fraction computeAnswer(){
		return new Fraction(1, 1); 
    }
    
    boolean isCorrect(double val){
        return (finalValue == val); 
    }
}