package Exercise_2;

/** Código en Java para responder a la pregunta:
 * ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?
 * En caso positivo, ¿cómo se determina el punto de entrada a un programa?
 *
 * Sí. Sí se puede tener varias clases que tengan el método 'main()'; pero para que se pueda determinar el punto
 * de entrada del programa, al menos una de esas clases debe ser pública y declararse para que la Java Virtual Machine pueda
 * iniciarla como un subproceso del Main.
 */

public class Main_2{
    public static void main(String[] args){
        System.out.println("This is the Main 1.");
    }
}

class Main2{
    public static void main(String[] args){
        System.out.println("This is the Main 2.");
    }
}