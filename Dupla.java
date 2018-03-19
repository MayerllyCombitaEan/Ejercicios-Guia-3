import java.util.Scanner;

public class Dupla {
    
    private int a, b;
    
    public void Guarda(int a2, int b2){
        a = a2;
        b = b2;
    }
    public void Lee(){
        System.out.println("Valor de primerPar.a: " + a);
        System.out.println("Valor de primerPar.b: " + b);
    }

    
    public static void main(String[] args) {
        int x, y;
        Dupla dupla = new Dupla();
        dupla.Guarda(12, 32);
        dupla.Lee();
    }
}