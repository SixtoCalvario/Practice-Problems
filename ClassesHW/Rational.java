public class Rational {
    private int numerator;
    private int denominator;
    
    public Rational(){
        numerator = 0;
        denominator = 1;
    }
    
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator; 
    }
    
    public String toString(){
        return (numerator+"")+"/"+(denominator+"");
    }
}