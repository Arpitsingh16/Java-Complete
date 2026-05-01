public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println( calc.add(2,6));
        System.out.println(calc.add(5.7 , 7.9));
        System.out.println( calc.add("Sara" , " Sana"));
        
        
    }
    
}

class Calculator {
int add( int a , int b){
    return a+b;
}
double add( double a , double b){
    return a+b;
}
String add( String a , String b){
    return a+b;
}
}
