import java.util.ArrayList;
import java.util.Scanner;


public class Exc4 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<Triangulo> lista = new ArrayList<>();
        
        System.out.println("    ");
        System.out.println("    Quantos triângulos você quer inserir?");
        System.out.print("    |> ");
        int qnt = in.nextInt();

        int cont = 0;
        double a;
        double b;
        double c;
        while (cont < qnt) {
            System.out.println("    ");
            System.out.println("    Qual o tamanho do 1° lado?");
            System.out.print("    |> ");
            a = in.nextDouble();
            System.out.println("    Qual o tamanho do 2° lado?");
            System.out.print("    |> ");
            b = in.nextDouble();
            System.out.println("    Qual o tamanho do 3° lado?");
            System.out.print("    |> ");
            c = in.nextDouble();

            if(a<0 || b<0 || c<0){
                System.out.println("    ");
                System.out.println("    Lados negativos não são possiveis! Insira os valores novamente!");
                continue;
            }

            if (c+b<a || c+a<b || a+b<c){
                System.out.println("    ");
                System.out.println("    Isto não é um triângulo! Insira os valores novamente!");
                continue;
            }

            lista.add(new Triangulo(a,b,c));
            cont++;
        }

        in.close();

        cont = 1;
        for(Triangulo i: lista){
            System.out.println("    ");
            System.out.println("    Para o triângulo "+cont+":");
            System.out.println("    Perímetro = " + i.perimetro());
            System.out.println("    Área = " + i.area());
            double[] cent = i.centroide(); 
            System.out.print("    Centróide -> x = " + cent[0] + " y = " + cent[1]);
            System.out.println("    ");
            cont++;
        }
        System.out.println("    ");
    }
}
