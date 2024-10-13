public class MetodosOrdenamientoDes {

    public int[] sortByBubbleDes(int[] arregloDes) {

        int tamanio = arregloDes.length;

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arregloDes[j] < arregloDes[j + 1]) {
                    int aux = arregloDes[j];
                    arregloDes[j] = arregloDes[j + 1];
                    arregloDes[j + 1] = aux;
                }
            }
        }
        return arregloDes;
    }

    public void printArregloBurDes(int[] arregloDes) {
        for (int elemento : arregloDes) {
            System.out.print("|" + elemento + "|");
        }
    }

    public int[] sortBySeleccionDes(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] > arreglo[indice]) {
                    indice = j;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArregloSelDes(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print("|" + elemento + "|");
        }
    }
}
