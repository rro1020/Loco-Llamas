abstract class Equation{
    //int x, y;
    Fraction frac1, frac2; 
	Fraction finalAnswer; 
	double finalValue; 
    
    abstract Fraction computeAnswer(); 
    abstract boolean isCorrect(double val); 
}