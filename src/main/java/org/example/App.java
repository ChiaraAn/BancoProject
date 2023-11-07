package org.example;

import org.example.entities.Cuenta;
import org.example.servicios.CuentaServicios;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        double retiro;
        double ingreso;
        ingreso = 0;
        retiro = 0;
        Cuenta c1 = new Cuenta();
        CuentaServicios cs = new CuentaServicios();

        System.out.println("Bienvenido/a!\\nA continuación le solicitaremos vuestros datos bancarios");
        cs.crearCuenta(c1);
        System.out.println(c1);
        System.out.println("-------------");
        cs.ingresarDinero(c1, ingreso);
        System.out.println(c1);
        System.out.println("-----------------");
        cs.retirarDinero(c1, retiro);
        System.out.println("-------------------");
        cs.extraccionRapida(c1);
        cs.consultarSaldo(c1);
        cs.consultarDatos(c1);

    }
}
