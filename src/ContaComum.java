public class ContaComum extends Conta {

  public void render() {
    this.saldo *= 1.1;
  }

  @Override
  public String toString() {
    return "ContaComum{" +
        "saldo=" + saldo +
        '}';
  }

}