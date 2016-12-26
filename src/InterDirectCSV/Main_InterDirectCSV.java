
package InterDirectCSV;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main_InterDirectCSV {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        
        String opc;
        IntercDirectCSV_Enteros ord_enteros;
        InterDirectCSV_Cadenas ord_cadenas;
        InterDirectCSV_Booleanos ord_booleanos;
        InterDirectCSV_Fechas ord_fechas;
        do {
            System.out.println("\tMENU DE ORDENAMIENTO POR MEZCLA DIRECTA");
            System.out.println("1.Ordenar Archivo primer campo(Numeros)");
            System.out.println("2.Ordenar Archivo segundo campo(Cadenas)");
            System.out.println("3.Ordenar Archivo tercer campo(Booleanos)");
            System.out.println("4.Ordenar Archivo cuarto campo(Fecha)");
            System.out.println("5.Salir");
            System.out.println("Escoga: ");
            opc = sc.nextLine();
            if (opc.compareTo("1") == 0) {
                ord_enteros = new IntercDirectCSV_Enteros();
                ord_enteros.ejecutar();
            } else if (opc.compareTo("2") == 0) {
                ord_cadenas = new InterDirectCSV_Cadenas();
                ord_cadenas.ejecutar();
            } else if (opc.compareTo("3") == 0) {
                ord_booleanos = new InterDirectCSV_Booleanos();
                ord_booleanos.ejecutar();
            } else if (opc.compareTo("4") == 0) {
                ord_fechas = new InterDirectCSV_Fechas();
                ord_fechas.ejecutar();
            } else if (opc.compareTo("5") == 0) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opcion incorrecta\n");
            }
        }while(opc.compareTo("5") != 0);
    }
}
