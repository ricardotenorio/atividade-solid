public abstract class Conta {

  protected double saldo;

  public Conta() {
    this.saldo = 0;
  }

  public void depositar(double valor) throws ValorInvalidoException {
    if(valor <= 0)
      throw new ValorInvalidoException();
    this.saldo += valor;
  }

  public double consultarSaldo() {
    return saldo;
  }

}
