public class Ejercicio1 {
    public static void ejercicio1(){
    String[] vector = new String[Entrada.getInt("Dame el tamaño del vector")];
    rellenar(vector);
    imprimir(vector);
        System.out.println("vector ordenado");
    ordenar(vector);
    imprimir(vector);
    }
    public static void rellenar(String[]vector){
        for (int i=0; i<vector.length;i++){
            vector[i]=Entrada.getString("ingresa una palabra");
        }
    }

    public static void imprimir(String[] vector){
        for (String imprime: vector
             ) {
            System.out.println(imprime);

        }
    }

    public static void ordenar(String[] vector){
        for (int i = 0; i < vector.length -1; i++) {
            for (int j = 0; j < vector.length -1 ; j++) {
                if (vector[j].compareTo(vector[j + 1])>0) {
                    intercambiar(vector,j,j+1);
                }
            }
        }
    }

    public static void intercambiar(String[] v, int i, int j) {
        String aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
