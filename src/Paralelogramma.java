public class Paralelogramma {
    
    public Paralelogramma() {
        
    }
    public double calcArea(double a, double b, double gamma){
        
        double rad = gamma * Math.PI/180;
        double area = a * b *Math.sin(rad);
        return area;
    }

    
}
