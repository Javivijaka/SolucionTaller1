package com.company;

import clases.CapacidadEndedudamiento;
import clases.Mensajes;
//import javafx.scene.input.KeyCode;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {

        Mensajes mensaje1 = new Mensajes();
        CapacidadEndedudamiento capacidad = new CapacidadEndedudamiento();

        int n = 0;
        String v = "S";
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje1.ingreso);
        do try {
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    while (v.equals("S")) {
                        System.out.println(mensaje1.gastosFijos);
                        try {
                            int gastosFijos = sc.nextInt();
                            System.out.println(mensaje1.gastoVaribales);
                            int gastosVariables = sc.nextInt();
                            System.out.println(mensaje1.ingresosTotales);
                            int ingresosTotales = sc.nextInt();
                            capacidad.setGastosFijos(gastosFijos);
                            capacidad.setGastoVariables(gastosVariables);
                            capacidad.setIngresosTotales(ingresosTotales);
                            System.out.println(mensaje1.Result + capacidad.getCapacidadEndeudamiento());
                            n = 1;
                            v = "N";
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            v = "S";
                            System.out.println(mensaje1.errorDatos);
                        }
                    }
                    break;
                case 2:
                    System.out.println(mensaje1.Opcion2);
                    n = 1;
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(mensaje1.errorDatos);
            sc.nextLine();
        } while (n == 0);

        sc.close();

    }

}
