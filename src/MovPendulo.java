import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class MovPendulo {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int longit;
        double acelera;
        double periodo;
        System.out.print("Ingrese la longitud de la cuerda: ");
        longit = teclado.nextInt();
        System.out.print("Ingrese la aceleración: ");
        System.out.print("\nUse como separador de decimales ',': ");        
        acelera = teclado.nextDouble();
        
        Pendulo Movi = new Pendulo(longit, acelera);
        periodo = Math.PI * (Math.sqrt(Movi.ingAceleracion()/Movi.ingLong()));
        System.out.printf("El periodo del pendulo es: %.3f\n", periodo);         
        
       
    }
    
}
