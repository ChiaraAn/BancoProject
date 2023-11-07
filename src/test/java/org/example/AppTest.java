package org.example;

import org.example.entities.Cuenta;
import org.example.servicios.CuentaServicios;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void RetiroDineroSaldoSuficiente(){

        Cuenta c1 = new Cuenta(); //Create a Cuenta instance or use a mock object
        CuentaServicios cs = new CuentaServicios();
        c1.setSaldoActual(1000); // Set an initial balance

        cs.retirarDinero(c1, 500);
        Assert.assertEquals(500, c1.getSaldoActual(), 0.01); // Check if the balance is updated correctly, "0.01":  it is used to compare the expected value (50.0) with the actual value obtained from c1.getSaldoActual() within a tolerance of 0.01
    }
    @Test
    public void RetiroDineroSaldoInsuficiente() {

        Cuenta c1 = new Cuenta();
        CuentaServicios cs = new CuentaServicios();
        c1.setSaldoActual(1000); // Set an initial balance

        cs.retirarDinero(c1, 1500);
        Assert.assertEquals(1000, c1.getSaldoActual(), 0.01);
    }
    @Test
    public void IngresoDinero(){
        Cuenta c1 = new Cuenta();
        CuentaServicios cs = new CuentaServicios();
        c1.setSaldoActual(0);

        cs.ingresarDinero(c1,1000);
        Assert.assertEquals(1000, c1.getSaldoActual(), 0.01);
    }
}
