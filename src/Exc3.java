import java.util.ArrayList;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("    ");
        System.out.println("    Insira o tamanho do array:");
        System.out.print("    |> ");
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            
            System.out.println("    ");
            System.out.println("    Insira o elemento "+ (i+1) +" do array :");
            System.out.print("    |> ");
            lista.add(in.nextInt());
        }

        System.out.println("    ");
        System.out.println("    Insira o valor do pivo (k):");
        System.out.print("    |> ");
        int k = in.nextInt();

        in.close();

        for (int i=0; i < t; i++) {
            if(lista.get(i) <= k){
                lista.addLast(lista.get(i));
            }
        }

        for (int i=0; i < t; i++) {
            if(lista.get(i) > k){
                lista.addLast(lista.get(i));
            }
        }

        for (int i=0; i < t; i++) {
            lista.remove(0);
        }

        System.out.println("    ");
        System.out.println("    Segue o arry ordenado:");
        System.out.print("    ");
        for(int i : lista){
            System.out.print(i+ ", ");
        }
    }
}
