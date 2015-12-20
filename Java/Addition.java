class Addition extends Equation{
    public Addition(int a, int b){
        this.x = a; 
        this.y = b; 
    }

    void computeAnswer(){
        finalAnswer = x + y; 
    }
    
    boolean isCorrect(double val){
        return (finalAnswer == val); 
    }
    
}