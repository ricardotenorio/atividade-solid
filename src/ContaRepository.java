import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContaRepository {

  private List<Conta> contas = new ArrayList<>() {
    {
      add(new ContaComum());
      add(new ContaComum());
      add(new ContaEstudante());
      add(new ContaComum());
      add(new ContaEstudante());
    }
  };

  public ContaRepository() {
    inicializar();
  }

  public void renderContas() {
    contas
        .stream()
        .filter(ContaComum.class::isInstance)
        .map(ContaComum.class::cast)
        .forEach(ContaComum::render);
  }

  public String exibirSaldoContas() {
    return contas
        .stream()
        .map(conta -> conta.toString())
        .collect(Collectors.joining("\n"));
  }

  private void inicializar() {
    contas
        .stream()
        .forEach(
            conta -> {
              try {
                conta.depositar(100);
              } catch (ValorInvalidoException e) {
                e.printStackTrace();
              }
            }
        );
  }

}
