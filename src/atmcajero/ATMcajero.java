package atmcajero;

import java.util.Scanner;

public class ATMcajero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        int saldoInicial = 10000;
        int deposito;
        int retiro;
        int contadordeposito = 0;
        int contadorretiro = 0;

        int saldo;
        do {
            System.out.println("----------------------------------------");
            System.out.println("BIENVENIDO ATM CEUTEC");
            System.out.println("Indique el numero de la operacion que desea realizar");
            System.out.println("----------------------------------------");

            System.out.println("    1. DEPOSITO");
            System.out.println("    2. RETIRO");
            System.out.println("    3. HISTORIAL");
            System.out.println("    4. SALIR");

            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("Indique la cantidad a depositar");
                    deposito = entrada.nextInt();
                    saldo = saldoInicial + deposito;
                    contadordeposito++;
                    System.out.println("Su saldo inicial es: Lps" + saldoInicial);
                    System.out.println("Su deposito es: Lps" + deposito);
                    System.out.println("Su saldo total es: Lps" + saldo);
                    break;

                case 2:
                    System.out.println("Indique la cantidad que desea retirar");
                    retiro = entrada.nextInt();
                    saldo = saldoInicial - retiro;
                    contadorretiro++;

                    if (retiro > saldoInicial) {
                        System.out.println("su saldo es insuficiente para realizar este retiro, no debe exceder los Lps10000");
                    } else {
                        saldo = saldoInicial - retiro;
                        System.out.println("Su saldo restante es: Lps" + saldo);
                        System.out.println("Su saldo retirado es: Lps" + retiro);
                    }
                    break;

                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("Su historial es el siguiente:");
                    System.out.println("Ha recargado: " + contadordeposito + " veces");
                    System.out.println("Ha retirado: " + contadorretiro + " veces");

                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese opcion nuevamente");
            }
        } while (opcion < 4);
        System.out.println("SESION FINALIZADA");
        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");

    }
}
