package com.mycompany._ra6_pt11_1_matveinikitamartinezisel;

/**
 * Classe QuadratMagic
 *
 * @author nikita i isel
 */
public class QuadratMagic {

    /*Declaració de variables i atributs*/
    protected int quadrat[][];
    private final static int DIMENSIÓ_PREDETERMINADA = 3;

    /**
     * Constructor per defecte que truca al constructor parametritzat
     */
    public QuadratMagic() {
        this(DIMENSIÓ_PREDETERMINADA);
    }

    /**
     * Constructor parametritzat que dona la dimensió a la matriu en base al
     * paràmetre que rep
     * 
     * @param dimensio 
     */
    public QuadratMagic(int dimensio) {
        this.quadrat = new int[dimensio][dimensio];
    }

    /**
     * Mètode comprovarQuadratMagic que repc com a paràmetre
     *
     * @param magic[][]
     * @return comprovacio
     */
    public boolean comprovarQuadratMagic(int magic[][]) {
        /*Declaració de variables*/
        int i, nombre, resultat;
        magic = this.quadrat;
        boolean comprovacio = false;
        boolean comprovacioVertical = true;
        boolean comprovacioHoritzontal = true;
        boolean comrpovacioDiagonal1 = true;
        boolean comprovacioDiagonal2 = true;
        
        /*Comprovarem si la suma dels valors horitzontalment, és la mateixa en 
        cada filera*/
        i = 0;
        resultat = 0;
        nombre = 0;
        while(i < magic.length && comprovacioVertical){
            for (int j = 0; j < magic[i].length; j++) {
                resultat += magic[i][j];
            }
            if (i == 0){
                nombre = resultat;
            }
            if (nombre != resultat){
                comprovacioVertical = false;
            }
        }
        
        /*Comprovem si la suma dels valors verticalment és la mateixa en cada 
        columne*/
        i = 0;
        resultat = 0;
        
        /*Comrpovem la suma dels valors de la primera diagonal (d'esquerre a dreta)*/
        
        /*Comrpovem la suma dels valors de la segona diagonal (de dreta a esquerre)*/
        
        /*Comprovacio final*/
        if (comprovacioVertical && comprovacioHoritzontal && comrpovacioDiagonal1
            && comprovacioDiagonal2){
            comprovacio = true;
        }
        
        /*Retornem la comprovació*/
        return comprovacio;
    }
}
