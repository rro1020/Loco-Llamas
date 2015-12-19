public class LlamaMain{

     public static void main(String []args){
        System.out.println("Hello World");
        Fraction frac = new Fraction(2, 4); 
        Fraction stringFrac = new Fraction("3/4"); 
        System.out.println(frac.getNumerator() + " / " + frac.getDenominator()); 
        System.out.println(stringFrac.getNumerator() + " / " + stringFrac.getDenominator()); 
     }
}
