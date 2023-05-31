public class CuentaCorriente extends CuentaBancaria implements Transaccion{

    int pagomensual;
    public CuentaCorriente(int numerodecuenta, String nombretitular, int balance, int pagomensual) {
        super(numerodecuenta, nombretitular, balance);
        this.pagomensual = pagomensual;
    }

    @Override
    public void depositar (int x) {
        this.balance += x;
    }

    @Override
    public  void retirar (int x) {
        this.balance -= x;
    }

    @Override
    public void transferir() {

    }

    public static void main(String[] args) {

        CuentaCorriente cuentaCorriente = new CuentaCorriente(123, "Dante", 30000, 20);
        cuentaCorriente.retirar(20000);
        System.out.println(cuentaCorriente.balance);
    }
}
