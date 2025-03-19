package com.mycompany._ra6_pt11_1_matveinikitamartinezisel;

import java.util.Scanner;

/**
 * Script on l'usuari introdueix el seu quadrat màgic i comprova si ho és o no
 *
 * @author nikita i isel
 */
public class Principal {

    public static void main(String[] args) {
        String opcio;
        Scanner sc = new Scanner(System.in);
        System.out.println("COMPROVAR SI EL TEU QUADRAT ÉS UN QUADRAT MÀGIC");
        System.out.println("Es crearà un quadrat on podràs introduïr els valors "
                + "en cada camp, vols cambiar la seva grandària? (si no ho fas "
                + "la taula serà de 3X3)");
        System.out.print("Escriur la teva resposta (S/N): ");
        opcio = sc.nextLine();
        if (opcio.equalsIgnoreCase("S")){
            System.out.print("Introdueix la gràndaria del teu quadrat: ");
            int dimensio = llegirEnterTeclat();
            QuadratMagic quadrat = new QuadratMagic(dimensio);
        }
        else if (opcio.equalsIgnoreCase("N")){
            QuadratMagic quadrat = new QuadratMagic();
        }
        else {
            System.out.println("ERROR: Has introduït una dimensió invàlida");
        }
   }
    
    /**
     * Mètode llegirEnterTeclat per comprovar si el nombre que s'introdueix és
     * un enter positiu
     * 
     * @return nombre
     */
    public static int llegirEnterTeclat() {
        
        /*Declaració de variables*/
        int nombre = 0;
        boolean demanarNombre = true;
        Scanner sc = new Scanner(System.in);
        
        /*Estructura DO-WHILE per fer les comprovacions sobre el nombre*/
        do {
            if (sc.hasNextInt()) {
                nombre = sc.nextInt();
                if (nombre <= 0) {
                    System.err.println("ERROR: Nombre negatiu introduït.");
                } else {
                    demanarNombre = false;
                }
            } else{
                sc.next();
                System.err.println("ERROR: S'ha introduït una dada que no és un" 
                        + " nombre enter.");
            }
        } while (demanarNombre);
        
        /*Retornem el nombre*/
        return nombre;
    }
}
