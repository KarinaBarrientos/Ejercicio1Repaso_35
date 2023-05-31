public class CuentaAhorros extends CuentaBancaria implements Transaccion {

    int interes;

    public CuentaAhorros(int numerodecuenta, String nombretitular, int balance, int interes) {
        super(numerodecuenta, nombretitular, balance);
        this.interes = interes;
    }

    @Override
    public void depositar(int x) {

    }

    @Override
    public void retirar(int x) {

    }

    @Override
    public void transferir() {

    }



    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1234, "Leonardo", 2000000, 3);
        //cuentaAhorros.depositar(350000);

        int interes = cuentaAhorros.balance * cuentaAhorros.interes/100;
        cuentaAhorros.balance = cuentaAhorros.balance - interes;

        System.out.println(cuentaAhorros.balance);
    }
}
