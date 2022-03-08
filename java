import java.util.Scanner;


public class Ascii202160249 {

    //atributos de la clase
    public int seleccion;
    public int enterOptmatricula;
    public int initialmatricula;
    public int finishmatricula;

    //metodos de la clase
    public void displayMenu() {
        //instrucciones para imprimir el menu de la figura a
        System.out.println("(1) un caracter");
        System.out.println("(2) un rango de entrada de su eleccion");
    }

    public void enterData() {
        Scanner entradaOpt = new Scanner(System.in);

        System.out.println("digite (1) o (2)");
        seleccion = entradaOpt.nextInt();

        if (seleccion == 1) {
            System.out.println("ingrese un dato");
            enterOptmatricula = entradaOpt.nextInt();
        } else {
            System.out.println("ingrese dos datos");
            initialmatricula = entradaOpt.nextInt();
            finishmatricula = entradaOpt.nextInt();
        }
    }

    public void displayCharacter() {

        if (seleccion == 1) {
            System.out.println("el codigo ASCII de " + enterOptmatricula + " es " + (char) enterOptmatricula);
        } else {
            int i;
            for (i = initialmatricula; i <= finishmatricula; i++) {
                System.out.println("el codigo ASCII de " + i + " es " + (char) i);
            }
        }

    }

}
