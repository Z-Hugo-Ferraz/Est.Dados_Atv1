public class Triangulo {
    public double b; 
    public double c; 
    public double a; 

    public Triangulo(double lado1,double lado2,double lado3){
        a = lado1;
        b = lado2;
        c = lado3;
    }

    public double area(){

        double area = Math.sqrt(pzin() * (pzin()-a) * (pzin()-b) * (pzin()-c));

        return area;
    }

    private double pzin(){

        double pzin = perimetro()/2;

        return pzin;
    }

    public double perimetro(){

        double p = a+b+c;

        return p;
    }

    public double[] centroide(){

        double[] cent = {0,0};
        
        cent[0] = (b + a*lambida())/2;
        cent[1] = a/3 * Math.sqrt(1-Math.pow(lambida(), 2));

        return cent;
    }

    private double lambida(){

        double l = (Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2)) / (2*a*b);

        return l;
    }
}
