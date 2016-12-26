package InterNaturCSV;

import java.util.Scanner;

public class Main_InterNaturCSV {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String opc;
        InterNaturCSV_Enteros ord_enteros;
        InterNaturCSV_Cadenas ord_cadenas;
        InterNaturCSV_Booleanos ord_booleanos;
        InterNaturCSV_Fechas ord_fechas;
        do {
            System.out.println("\tMENU DE ORDENAMIENTO POR MEZCLA NATURAL");
            System.out.println("1.Ordenar Archivo primer campo(Numeros)");
            System.out.println("2.Ordenar Archivo segundo campo(Cadenas)");
            System.out.println("3.Ordenar Archivo tercer campo(Booleanos)");
            System.out.println("4.Ordenar Archivo cuarto campo(Fecha)");
            System.out.println("5.Salir");
            System.out.println("Escoga: ");
            opc = sc.nextLine();
            if (opc.compareTo("1") == 0) {
                ord_enteros = new InterNaturCSV_Enteros();
                ord_enteros.ejecutar();
            } else if (opc.compareTo("2") == 0) {
                ord_cadenas = new InterNaturCSV_Cadenas();
                ord_cadenas.ejecutar();
            } else if (opc.compareTo("3") == 0) {
                ord_booleanos = new InterNaturCSV_Booleanos();
                ord_booleanos.ejecutar();
            } else if (opc.compareTo("4") == 0) {
                ord_fechas = new InterNaturCSV_Fechas();
                ord_fechas.ejecutar();
            } else if (opc.compareTo("5") == 0) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opcion incorrecta\n");
            }
        }while(opc.compareTo("5") != 0);
        
    }
}
