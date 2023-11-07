package org.example.servicios;

import java.util.Scanner;
import org.example.entities.Cuenta;

public class CuentaServicios {

    Scanner scan = new Scanner(System.in);

    Cuenta c1 = new Cuenta();

    public void crearCuenta(Cuenta c1){
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(scan.nextInt());
        System.out.println("Ingrese el numero de DNI");
        c1.setDni(scan.nextInt());
        System.out.println("Ingrese su saldo");
        c1.setSaldoActual(scan.nextInt());
    }
    // Metodo para que el usuario ingrese por consola
   /* public void ingresarDinero(Cuenta c1){

        double ingreso;

        System.out.println("Escriba el monto a ingresar");
        ingreso = scan.nextDouble();
        c1.setSaldoActual(ingreso + c1.getSaldoActual());
        System.out.println("Su nuevo saldo es de $ " + c1.getSaldoActual());
    }*/
    //Metodo para testear
    public void ingresarDinero(Cuenta c1, double ingreso){

        c1.setSaldoActual(ingreso + c1.getSaldoActual());
        System.out.println("Su nuevo saldo es de $ " + c1.getSaldoActual());
    }

    // metodo para que el usuario ingrese por consola
    /** public void retirarDinero(Cuenta c1){

        double retiro;
        System.out.println("Ingrese el monto a retirar");
        retiro = scan.nextDouble();
        if (retiro <= c1.getSaldoActual()){
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
            System.out.println("Su saldo actual es de $ " + c1.getSaldoActual());
        } else {
            System.out.println("No dispone de fondos suficientes para realizar esta operacion");
        }
    } **/
    /* Metodo para testear en jUnit */
    public void retirarDinero(Cuenta c1, double retiro) {
        if (retiro <= c1.getSaldoActual()) {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
            System.out.println("Su saldo actual es de $ " + c1.getSaldoActual());
        } else {
            System.out.println("No dispone de fondos suficientes para realizar esta operación");
        }
    }

    public void extraccionRapida(Cuenta c1){

        double retiro;

        System.out.println("Ingrese el monto que desea retirar con la extraccion rapida");
        retiro = scan.nextDouble();
        if (retiro <= (c1.getSaldoActual() * 20/100)) {
            c1.setSaldoActual(c1.getSaldoActual()-retiro);
            System.out.println("Su saldo actual es de $ " + c1.getSaldoActual());
        } else {
            System.out.println("Los fondos solicitados superan los requisitos de la Extraccion Rapida");
        }
    }
    public void consultarSaldo(Cuenta c1){
        System.out.println("Su saldo actual es de $ "+ c1.getSaldoActual());
    }
    public void consultarDatos(Cuenta c1){
        System.out.println("Su cuenta es la numero: "+ c1.getNumeroCuenta());
        System.out.println("Su DNI es: "+ c1.getDni());
    }
}
