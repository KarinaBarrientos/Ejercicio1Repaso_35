public abstract class CuentaBancaria {

    int numerodecuenta;
    String nombretitular;
    int balance;

    public CuentaBancaria(int numerodecuenta, String nombretitular, int balance) {
        this.numerodecuenta = numerodecuenta;
        this.nombretitular = nombretitular;
        this.balance = balance;
    }
}
