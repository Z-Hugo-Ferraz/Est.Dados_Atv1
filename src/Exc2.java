import java.util.ArrayList;
import java.util.Scanner;

public class Exc2 {
    
    public static String verifica(ArrayList<Integer> lista) {
        // +-------------------------------------------------+
        // |            Complexidade --> O(n^3)              |
        // |  1 for = O(n), 2 for = O(n^2), 3 for = O(n^3)   |
        // +-------------------------------------------------+
            
        String msg = "Nenhum elemento é a soma de dois anteriores";

        for (int i = 2; i < lista.size(); i++) {
            for (int j = i-1; j > 0 ; j--) {
                for (int k = j-1; k > 0 ; k--) {
                if(lista.get(j) + lista.get(k) == lista.get(i)){
                    msg = "O elemento " + lista.get(i) + " é a soma de " + lista.get(j) + " com " + lista.get(k);
                }
                }
            }
        }
        return msg;
    }


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

        String resultado = verifica(lista);
    
        System.out.println("    ");
        System.out.println("    " + resultado);

        in.close();
    }
}
