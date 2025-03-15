import java.util.ArrayList;
import java.util.Scanner;

public class Exc1 {
    
    public static String verifica(ArrayList<Integer> lista){
        // +-------------------------------------------------+
        // |            Complexidade --> O(n^2)              |
        // |      O ".contains()" possui um for dentro       |
        // +-------------------------------------------------+
        String ele = null;
        ArrayList<Integer> teste = new ArrayList<>(); 

        for(int i : lista){
            if(teste.contains(i)){
                ele = ""+i;
                break;
            } else{
                teste.add(i);
            }
        }
        
        return ele;
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        boolean jatem = false;

        System.out.println("    ");
        System.out.println("    Insira o tamanho do array:");
        System.out.print("    |> ");
        int t = in.nextInt();

        
        for (int i = 0; i < t; i++) {
            
            System.out.println("    ");
            System.out.println("    Insira o elemento "+ (i+1) +" do array :");
            System.out.print("    |> ");
            int aux = in.nextInt();
            
            
            while(aux >= t){
                System.out.println("    ");
                System.out.println("    Valor inválido!");
                System.out.println("    Insira o elemento "+ (i+1) +" do array :");
                System.out.print("    |> ");
                aux = in.nextInt();
            }
            
            if(a.contains(aux) && jatem){
                while(aux >= t || a.contains(aux)){
                    System.out.println("    ");
                    System.out.println("    Valor inválido! Já há um valor repetido!");
                    System.out.println("    Insira o elemento "+ (i+1) +" do array :");
                    System.out.print("    |> ");
                    aux = in.nextInt();
                }
            }
            
            if(a.contains(aux)){
                jatem = true;
            }

            a.add(aux);
        }
        in.close();
        
        String repets = verifica(a);

        System.out.println("    ");
        if(repets == null){
            System.out.println("    Não há valor repetido");
            return;
        }
        int num = Integer.parseInt(repets);
        System.out.println("    O valor que se repete é --> " + num);
    }
}
