import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto7 {

    static Scanner lectorOpciones = new Scanner(System.in);

    public static void main(String[] args) {
        Carretera carretera = new Carretera();
        carretera.anhadirTramo(new TramoSinAsfaltar(0, 1, 1, 0, "arena", 1));
        carretera.anhadirTramo(new TramoAsfaltado(1, 0, 2, 1, "Argos", 40, true));
        carretera.anhadirTramo(new TramoAsfaltado(2, 1, 3, 1, "Argos", 35, true));
        carretera.anhadirTramo(new TramoAsfaltado(3, 1, 4, 0, "Cementos del Oriente", 25, false));
        carretera.anhadirTramo(new TramoSinAsfaltar(4, 0, 5, 1, "arena", 0.8));
        carretera.anhadirTramo(new TramoSinAsfaltar(5, 1, 5, 2, "piedra", 0.6));
        carretera.anhadirTramo(new TramoAsfaltado(5, 2, 3, 3, "Cementos Tequendama", 30, false));
        carretera.anhadirTramo(new TramoSinAsfaltar(3, 3, 2, 2, "Balastro", 0.1));
        carretera.anhadirTramo(new TramoAsfaltado(2, 2, 1, 4, "Cementos Atlantico", 30, true));
        carretera.anhadirTramo(new TramoAsfaltado(1, 4, 0, 4, "Cementos Tequendama", 35, true));

        System.out.println("Acciones a ejecutar sobre la carretera");
        System.out.println("1. Informacion de un tramo concreto");
        System.out.println("2. Longitud Carretera");
        System.out.println("3. Area carretera");
        System.out.println("4. Volumen total carretera");
        System.out.println("5. Volumen tramos asfaltados");
        System.out.println("6. Volumen tramo sin asfaltar");
        System.out.println("7. Esta conectada la carretera?");
        int opcionMenu = 0;
        try {
            opcionMenu = lectorOpciones.nextInt();
            if(opcionMenu<0 || opcionMenu>7){
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Ingrese un numero entero positivo entre 1 y 7");
            System.exit(0);
        }
        switch(opcionMenu) {
            case 1:
                System.out.println("Indique la posicion del tramo(Arranca desde 0)");
                int tramoSeleccionado;
                try {
                    tramoSeleccionado = lectorOpciones.nextInt();
                    System.out.println("Esta es la informacion del tramo");
                    System.out.println(carretera.getConjuntoVias().get(tramoSeleccionado));
                }catch(InputMismatchException e){
                    System.out.println("La posicion del tramo tiene que ser un numero entero positivo");
                }catch (IndexOutOfBoundsException e){
                    System.out.println("El tramo seleccionado no hace parte de la carretera.");
                }
                break;
            case 2:
                System.out.println("Longitud: "+carretera.longitud());
                break;
            case 3:
                System.out.println("Area: "+carretera.area());
                break;
            case 4:
                System.out.println("Volumen total: "+carretera.volumenTotal());
                break;
            case 5:
                System.out.println("Volumen asfaltado: "+carretera.volumenAsfaltado());
                break;
            case 6:
                System.out.println("Volumen sin asfaltar: "+carretera.volumenSinAsfaltar());
                break;
            case 7:
                System.out.println("Estan conectados todos los tramos? Respuesta: "+carretera.conectados());
                break;
        }

    }
}
