package com.mycompany._ra6_pt11_1_matveinikitamartinezisel;

/**
 * Classe QuadratMagic
 *
 * @author nikita i isel
 */
public class QuadratMagic {
    /*Declaració de variables i atributs*/
    private int quadrat[][];
    private final static int NUM_COLUMNES_DEFAULT = 3;
    private final static int NUM_FILES_DEFAULT = 3;
    
    /**
     * Constructor per defecte que truca al constructor parametritzat
     */
    public QuadratMagic(){
        this(NUM_COLUMNES_DEFAULT, NUM_FILES_DEFAULT);
    }
    
    /**
     * Constructor paramatritzat que rep el nombre de columnes i fileres
     * 
     * @param columnes
     * @param files 
     */
    public QuadratMagic (int columnes, int files){
        this.quadrat = new int [files][columnes];
    }
    
    /**
     * Mètode comprovarQuadratMagic que repc com a paràmetre 
     * 
     * @param magic[][]
     * @return comprovacio
     */
    public boolean comprovarQuadratMagic(int magic[][]){
        magic = this.quadrat;
        boolean comprovacio = false;
        
        
        return comprovacio;
    }
}
