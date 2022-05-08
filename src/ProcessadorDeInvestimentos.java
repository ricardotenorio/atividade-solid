import java.util.List;

public class ProcessadorDeInvestimentos {

  public static ContaRepository contasDoBanco = new ContaRepository();

  public static void main(String[] args) {
    String saldos;
    String saldosAtualizados;

    saldos = contasDoBanco.exibirSaldoContas();

    System.out.println("Saldo antes do redimento:");
    System.out.println(saldos + "\n");

    contasDoBanco.renderContas();
    saldosAtualizados = contasDoBanco.exibirSaldoContas();

    System.out.println("Saldo depois da atualização:");
    System.out.println(saldosAtualizados);

  }

}