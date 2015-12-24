public class Fraction{
    private int numerator; 
    private int denominator;
	private int mixedNumber; 
	private boolean isMixed; 
	private double value; 

    public Fraction(int n, int d){
        this.numerator = n; 
        this.denominator = d; 
		this.isMixed = false; 
		this.value = (double) numerator/denominator; 
    }
	
	public Fraction(int m, int n, int d){
		this.mixedNumber = m; 
		this.numerator = n; 
		this.denominator = d; 
		this.isMixed = true; 
		this.value = mixedNumber + (double) numerator/denominator; 
	}
	
    public Fraction(String s){
        String[] f = s.split("/"); 
        this.numerator = Integer.parseInt(f[0]); 
        this.denominator = Integer.parseInt(f[1]); 
		this.mixedNumber = 0; 
		this.isMixed = false; 
		this.value = mixedNumber + (double) numerator/denominator; 
    }
    
    public int getNumerator(){
        return numerator; 
    }
    
    public int getDenominator(){
        return denominator; 
    }
	
	public double getValue(){
		return value; 
	}
    
    public boolean checkIfMixed(){
		return isMixed; 
	}
	
	public void setNumerator(int n){
        this.numerator = n; 
    }
    
    public void setDenominator(int d){
        this.denominator = d; 
    }
	
    public void print(){
		System.out.println(numerator + " / " + denominator); 
	}
	
}