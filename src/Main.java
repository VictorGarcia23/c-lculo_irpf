import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String nombre;
        String apellidos;
        int birthDate;

        System.out.println("dame tu nombre: ");
        nombre = input.nextLine();
        System.out.println("dame tus apellidos: ");
        apellidos = input.nextLine();
        System.out.println("dime tu año de nacimiento: ");
        birthDate = input.nextInt();

        int annos = 2020 - birthDate;

        System.out.println("hola " +  nombre +  apellidos  + " tienes " +  annos  + " años");


    }



}
