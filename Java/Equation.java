abstract class Equation{

    Fraction frac1, frac2; 
	Fraction finalAnswer; 
	double finalValue; 
    
	static int gcd(int p, int q){
		if (q == 0){
			return p; 
		} else {
			return gcd(q, p%q); 
		}
	}
	
	static int lcm(int a, int b){
		return a * (b / gcd(a, b)); 
	}
	
    abstract Fraction computeAnswer(); 
    abstract boolean isCorrect(double val); 
	abstract boolean isCorrect(Fraction f); 
}