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
    private final static int DIMENSIO_PREDETERMINADA = 3;

    /**
     * Constructor per defecte que truca al constructor parametritzat
     */
    public QuadratMagic() {
        this(DIMENSIO_PREDETERMINADA);
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

    /**
     * Mètode GET per conseguir la dimensió de la matriu
     *
     * @return dimensio
     */
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
    public void setValorMatriu(int fila, int columna, int valor) {
        quadrat[fila][columna] = valor;
    }

    /**
     * Mètode esMagic que repc com a paràmetre una matriu quadrada per veure si
     * aquesta és màgica
     *
     * @return comprovacio
     */
    public boolean esMagic() {
        /*Declaració de variables*/
        int nombre, resultat, resultatDiagonal = 0;

        /*Comprovarem si la suma dels valors horitzontalment, és la mateixa en 
        cada filera*/
        resultat = 0;
        nombre = 0;
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                resultat += quadrat[i][j];

                if (i == j) {
                    resultatDiagonal += quadrat[i][j];
                }
            }
            if (i == 0) {
                nombre = resultat;
            }
            if (resultat != nombre || resultatDiagonal != nombre) {
                return false;
            }
        }

        /*Comprovem si la suma dels valors verticalment son els mateixos en cada 
        columne*/
        resultat = 0;
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                resultat += quadrat[j][i];
            }
            if (resultat != nombre) {
                return false;
            }
        }

        /*Comrpovem la suma dels valors de la segona diagonal (de dreta a esquerre)*/
        int j = dimensio - 1;
        resultat = 0;
        for (int i = 0; i < dimensio; i++) {
            resultat += quadrat[i][j];
            j--;
        }
        if (resultat != nombre) {
            return false;
        }

        /*Retornem true si es que tot ha sigut*/
        return true;
    }

    /**
     * Mètode per mostrar la matriu de forma elegant.
     *
     * @return mostrarMatriu
     */
    @Override
    public String toString() {
        String mostrarMatriu = "";
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                /*Concatenem els nombres amb el mètode format i donant 4 espais
                entre cadascun d'ells*/
                mostrarMatriu += String.format("%4d", quadrat[i][j]);
            }
            /*Afegim un salt de línia després de cada fila*/
            mostrarMatriu += "\n";
        }
        
        /*Retornem la matriu amb el nou format*/
        return mostrarMatriu;
    }
}
