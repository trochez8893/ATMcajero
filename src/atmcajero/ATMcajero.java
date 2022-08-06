package atmcajero;

import java.util.Scanner;

public class ATMcajero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int saldoInicial = 10000;
        int deposito;
        int retiro;

        int saldo;
        do {
            System.out.println("----------------------------------------");
            System.out.println("BIENVENIDO ATM CEUTEC");
            System.out.println("Indique el numero de la operacion que desea realizar");
            System.out.println("----------------------------------------");

            System.out.println("    1. DEPOSITO");
            System.out.println("    2. RETIRO");
            System.out.println("    3. SALIR");

            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("Indique la cantidad a depositar");
                    deposito = entrada.nextInt();
                    saldo = saldoInicial + deposito;
                    System.out.println("Su saldo inicial es:" + saldoInicial);
                    System.out.println("Su deposito es:" + deposito);
                    System.out.println("Su saldo total es:" + saldo);
                    break;

                case 2:
                    System.out.println("Indique la cantidad que desea retirar");
                    retiro = entrada.nextInt();
                    saldo = saldoInicial - retiro;

                    if (retiro > saldoInicial) {
                        System.out.println("su saldo es insuficiente para realizar este retiro");
                    } else {
                        saldo = saldoInicial - retiro;
                        System.out.println("Su saldo restante es: Lps" + saldo);
                        System.out.println("Su saldo retirado es: Lps" + retiro);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese opcion nuevamente");
            }
        } while (opcion < 3);
        System.out.println("SESION FINALIZADA");
        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");

        int dineroSolicitado = 0;
        final int BILLETES[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int billetesEntregados[] = new int[BILLETES.length];
        int dineroEntregado = 0, dineroRestante = 0;

        System.out.println("Ingrese la cantidad de dinero que necesita retirar: ");
        dineroSolicitado = entrada.nextInt();

        dineroRestante = dineroSolicitado;
        for (int x = 0; x < BILLETES.length; x++) {
            if (dineroRestante >= BILLETES[x]) {
                billetesEntregados[x] = dineroRestante / BILLETES[x];  //Conocer cuantos billetes entrego de esta denominacion
                dineroEntregado = billetesEntregados[x] * BILLETES[x];  //Dinero entregando con estos billetes
                dineroRestante -= dineroEntregado;                    //Restar esa cifra para saber cuanto me falta pagar
            } else {
                billetesEntregados[x] = 0;
            }
            System.out.println("Billetes de " + BILLETES[x] + " entregados: " + billetesEntregados[x] + " DINERO Entregado: " + dineroEntregado + " DINERO Restante: " + dineroRestante);
            dineroEntregado = 0;

        }

    }
}
