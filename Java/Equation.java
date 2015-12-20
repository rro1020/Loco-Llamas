abstract class Equation{
    int x, y;
    double finalAnswer; 
    
    abstract void computeAnswer(); 
    abstract boolean isCorrect(double val); 
}