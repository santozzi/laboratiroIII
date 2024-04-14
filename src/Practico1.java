public class Practico1 {
    private String variableDeInstancia  = "soy una variable de instancia";

    private int cantidadDeHolas;

    private String nombre;
    private final int LADOS_DE_UN_TRIANGULO=3;
    public Practico1() { }

    public Practico1(int cantidadDeHolas) {
        this.cantidadDeHolas = cantidadDeHolas;
    }
    //Ejercicio 15

    /***
     * Ordenamiento de argumentos numéricos con el método Burbuja
     * Fuente: https://www.youtube.com/watch?v=Iv3vgjM8Pv4&ab_channel=kamalyassin
     * @param argumentosNumericos, es un arreglo de números enteros.
     *
     * @return argumentos numéricos ordenados
     */
    public void ordenamientoBurbuja(int[] argumentosNumericos){
        boolean ordenado = false;
        boolean huboCambio;
        int longitudDeArgumentoEnDecrecion = argumentosNumericos.length-1;
        //si el tamaño de los argumentos numérico es 0 o 1 entonces el mismo ya esta ordenado.
        if(argumentosNumericos.length>=2) {
            while (!ordenado) {
                huboCambio = false;

                for (int i = 0; i < longitudDeArgumentoEnDecrecion; i++) {
                    if (argumentosNumericos[i] > argumentosNumericos[i + 1]) {
                        swap(argumentosNumericos, i, i + 1);
                        huboCambio = true;
                    }
                }
                if (!huboCambio) {
                    ordenado = true;
                } else {
                    longitudDeArgumentoEnDecrecion--;
                }


            }
        }
    }
    private void swap(int[] argumentosNumericos, int primerIndice, int segundoIndice){
        int auxiliar = argumentosNumericos[primerIndice];
        argumentosNumericos[primerIndice] = argumentosNumericos[segundoIndice];
        argumentosNumericos[segundoIndice] = auxiliar;
    }
    /**
     * Ejercicio 16: Pasa numeros en base 10 a base 2
     * @param numeroAConvertir
     * @return String con resultado binario
     */
    public String enteroABinario(int numeroAConvertir){

        if(numeroAConvertir<0){
           return "Este algoritmo no funciona con números negativos aum";
        }

        return enteroABinarioRecu(numeroAConvertir);
    }


    private String enteroABinarioRecu(int numeroAConvertir ){

        if(numeroAConvertir / 2 == 0){

           return  String.valueOf(numeroAConvertir % 2);
        }else{
            return enteroABinarioRecu(numeroAConvertir / 2) + String.valueOf(numeroAConvertir % 2);

        }
    }

    /***
     * Ejercicio 22: Muestra una variable de instancia
     *
     */
    public void mostrarVariableDeInstancia(){
        System.out.println(variableDeInstancia);
    }

    /***
     * Ejercicio 23:Saluda cantidad de veces tenga cantidadDeHolas
     */
    public void saludar(){
        String saludo="";
        if(cantidadDeHolas == 0){
            System.out.println("No te saludo");
        }else if( cantidadDeHolas< 0){
            saludo = "Chau!!!!";
            cantidadDeHolas = Math.abs(cantidadDeHolas);
        }else{
            saludo = "Hola!!!!";
        }

        for(int i = 0; i<cantidadDeHolas;i++){
            System.out.println((i+1)+"-"+saludo);
        }
    }
    //Ejerciocio 24
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    //Ejercicio 25
    public static float areaDelRectangulo(float base, float altura){
        return base*altura;
    }

    //Ejercicio 26
    public void mostrarLadosDeUnTriangulo(){
        System.out.println(LADOS_DE_UN_TRIANGULO);
    }


}
