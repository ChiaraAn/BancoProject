package org.example.entities;

import lombok.Getter;
import lombok.Setter;
public class Cuenta {

    @Getter @Setter
    private int numeroCuenta;
    @Getter @Setter
    private int dni;
    @Getter @Setter
    private double saldoActual;
    @Getter @Setter
    private double interes;

    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, int dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }
}
