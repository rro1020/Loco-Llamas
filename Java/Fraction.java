public class Fraction{
    private int numerator; 
    private int denominator;

    public Fraction(int n, int d){
        this.numerator = n; 
        this.denominator = d; 
    }
    
    public Fraction(String s){
        String[] f = s.split("/"); 
        this.numerator = Integer.parseInt(f[0]); 
        this.denominator = Integer.parseInt(f[1]); 
    }
    
    public int getNumerator(){
        return numerator; 
    }
    
    public int getDenominator(){
        return denominator; 
    }
    
    public void setNumerator(int n){
        this.numerator = n; 
    }
    
    public void setDenominator(int d){
        this.denominator = d; 
    }
    
}