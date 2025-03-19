package com.mycompany._ra6_pt11_1_matveinikitamartinezisel;

/**
 * Classe QuadratMagic
 *
 * @author nikita i isel
 */
public class QuadratMagic {

    /*Declaració de variables i atributs*/
    private int quadrat[][];
    private int dimensio;
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
        this.dimensio = dimensio;
        this.quadrat = new int[dimensio][dimensio];
    }
    
    public int getDimensio() {
        return dimensio;
    }
    /**
     * Mètode setValorMatriu per donar els valors a la matriu en una fila i
     * columna determinada
     * 
     * @param fila
     * @param columna
     * @param valor 
     */
    public void setValorMatriu(int fila, int columna, int valor){
        quadrat[fila][columna] = valor;
    }
    
    /**
     * Mètode esMagic que repc com a paràmetre una matriu quadrada per veure si
     * aquesta és màgica
     *
     * @param magic[][]
     * @return comprovacio
     */
    public boolean esMagic(int magic[][]) {
        /*Declaració de variables*/
        int i, nombre, resultat;
        magic = this.quadrat;
        boolean comprovacio = true;
        
        /*Comprovarem si la suma dels valors horitzontalment, és la mateixa en 
        cada filera*/
        i = 0;
        resultat = 0;
        nombre = 0;
        while(i < dimensio && comprovacio){
            for (int j = 0; j < dimensio; j++) {
                resultat += magic[i][j];
            }
            if (i == 0){
                nombre = resultat;
            }
            if (resultat != nombre){
                comprovacio = false;
            }
        }
        
        /*Comprovem si la suma dels valors verticalment és la mateixa en cada 
        columne*/
        i = 0;
        resultat = 0;
        while(i < dimensio && comprovacio){
            for (int j = 0; j < dimensio; j++) {
                resultat += magic[j][i];
            }
            if (resultat != nombre){
                comprovacio = false;
            }
        }
        
        /*Comrpovem la suma dels valors de la primera diagonal (d'esquerre a dreta)*/
        resultat = 0;
        for (i = 0; i < dimensio; i++) {
            resultat += magic[i][i];
        }
        if(resultat != nombre){
            comprovacio = false;
        }
        
        /*Comrpovem la suma dels valors de la segona diagonal (de dreta a esquerre)*/
        i = 0;
        int j = dimensio - 1;
        resultat = 0;
        while (i < dimensio && comprovacio){
            resultat += magic[i][j];
            i++;
            j--;
        }
        if(resultat != nombre){
            comprovacio = false;
        }
        
        /*Retornem la comprovació*/
        return comprovacio;
    }
}
