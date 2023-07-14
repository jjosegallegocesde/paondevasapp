package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando los datos de entrada del problema
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un DATO ESPECIAL para capturar informacion desde el teclado
        Scanner teclado=new Scanner(System.in);

        //Para inicializar las VARIABLES
        System.out.println("\u001B[32m PaOndeVas APP \u001B[0m");

        System.out.print("Digite su ubicación: ");
        ubicacionUsuario=teclado.nextLine();

        System.out.print("Digite su Destino: ");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //PROCESO DEL PROBLEMA
        String distancia="20";//ESTO ES UN TEXTO
        //DEBO HACER PARSEO DE LA VARIABLE distancia
        //PARSEO=CAMBIAR O MODIFICAR EL TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //Salidas del problema
        System.out.println("\u001B[34m Señor Usuario:"+nombreUsuario+ "\u001B[0m");
        System.out.println("\u001B[34m El costo de su viaje es: $"+cobroTotal+ "Pesos\u001B[0m");

    }
}