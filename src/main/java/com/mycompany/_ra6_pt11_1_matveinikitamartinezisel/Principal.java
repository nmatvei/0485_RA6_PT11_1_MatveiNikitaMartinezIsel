package com.mycompany._ra6_pt11_1_matveinikitamartinezisel;

import java.util.Scanner;

/**
 * Script on l'usuari introdueix el seu quadrat màgic i comprova si ho és o no
 *
 * @author nikita i isel
 */
public class Principal {

    public static void main(String[] args) {
        /*Declaracio de variables*/
        int dimensio;
        String opcio;
        Scanner sc = new Scanner(System.in);
        QuadratMagic quadrat = null;
        
        System.out.println("COMPROVAR SI EL TEU QUADRAT ÉS UN QUADRAT MÀGIC");
        System.out.println("Es crearà un quadrat on podràs introduïr els valors "
                + "en cada camp.");
        System.out.println("Vols determinar la grandària del quadrat?" + "(si no "
                + "ho fas el quadrat serà de 3X3)");
        System.out.print("Escriur la teva resposta (S/N): ");
        
        /*Llegim la resposta de l'usuari*/
        opcio = sc.nextLine();
        
        /*Si l'usuari vol determinar la dimensió del quadrat, li demanem la dimensió*/
        if (opcio.equalsIgnoreCase("S")){
            System.out.print("Introdueix la gràndaria del teu quadrat: ");
            dimensio = llegirEnterTeclat();
            
            /*Creem el quadrat magic amb la dimensio especificada*/
            quadrat = new QuadratMagic(dimensio);
        }
        
        /*En cas contrari, creem un objecte amb un quadrat 3X3*/ 
        else if (opcio.equalsIgnoreCase("N")){
            quadrat = new QuadratMagic();
        }
        
        /*Estructura FOR per deamanar els valors a l'usuari*/
        dimensio = quadrat.getDimensio();
        for (int i = 0; i < dimensio; i++) {
            System.out.println("Introdueix els valors de la filera numero " + (i+1));
            System.out.println("Per introduir els valors escriu un valor i prem Enter,"
                    + " aixì " + dimensio + " vegades");
            for (int j = 0; j < dimensio; j++) {
                int valor = llegirEnterTeclat();
                quadrat.setValorMatriu(i, j, valor);
            }
        }
        
        /*Mostrem el quadrat introduït*/
        System.out.println("El treu quadrat és e següent: "+"\n\n"+quadrat.toString());
        
        /*Comprovem que el quadrat és màgic*/
        if (quadrat.esMagic()) {
            System.out.println("El quadrat és màgic!");
        } else {
            System.out.println("El quadrat NO és màgic.");
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
                    System.out.print("\nTorna a introduïr el nombre: ");
                } else {
                    demanarNombre = false;
                }
            } else{
                sc.next();
                System.err.println("ERROR: S'ha introduït una dada que no és un" 
                        + " nombre enter.");
                System.out.print("\nTorna a introduïr el nombre: ");
            }
            
        } while (demanarNombre);
        
        /*Retornem el nombre*/
        return nombre;
    }
}
