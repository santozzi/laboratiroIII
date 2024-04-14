public class Main {
    public static void main(String[] args) {
        int[] argumentosNumericos = {3,0,1,8,7,2,5,4,6,9};


        mostrarArreglo(argumentosNumericos);
        //Ejercicio 15
        Practico1 practicoTest = new Practico1();
        practicoTest.ordenamientoBurbuja(argumentosNumericos);

        mostrarArreglo(argumentosNumericos);
        //Ejercicio 16
        int numeroAConvertirABinario = 42;

        System.out.println("Número binario: " + practicoTest.enteroABinario(numeroAConvertirABinario));

        //Ejercicio 22
        practicoTest.mostrarVariableDeInstancia();

        //Ejercicio 23
        practicoTest = new Practico1(5);
        practicoTest.saludar();

        //Ejercicio 24
        practicoTest.setNombre("Sergio");
        System.out.println(practicoTest.getNombre());

        //Ejrecicio 25
        float area = Practico1.areaDelRectangulo(25,38);
        System.out.println("El área del rectángulo: "+area);

        //Ejercicio 26
        practicoTest.mostrarLadosDeUnTriangulo();

    }
    private static void mostrarArreglo(int[] arreglo){
        System.out.print("-");
        for(int i= 0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+"-");
        }
        System.out.println();
    }

}