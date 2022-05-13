
package renata.souza.ramos.melo.c2;


    
    

public class Operadora {

    private String nome;
    private Integer quantidadePlanosVendidos;
    private Integer quantidadeDescontosAplicados;

    public Operadora(String nome) {
        this.nome = nome;
        this.quantidadePlanosVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
    }

    public String realizarVenda(Plano planoVendido, Double valorDaVenda) {
        String situacao;
        if (planoVendido.getQuantidadeDisponivel() >= 1) {
            planoVendido.setValorVenda(valorDaVenda);
            quantidadePlanosVendidos += 1;
            planoVendido.setQuantidadeDisponivel(planoVendido.getQuantidadeDisponivel() - 1);
            situacao = String.format("\nREALIZANDO VENDA SEM DESCONTO: "
                    + "\nID: %d "
                    + "\nNome: %s "
                    + "\nQuantidade disponível: %d "
                    + "\nValor: R$%.2f\n"
                    + "\nValor final: R$%.2f", planoVendido.getId(), planoVendido.getNomePlano(),
                    planoVendido.getQuantidadeDisponivel(), planoVendido.getValorVenda(),
                    planoVendido.getValorVenda());
        } else {
            situacao = "\nOPERAÇÃO INVÁLIDA\n";
        }
        return situacao;
    }

    public String realizarVenda(Plano planoVendido, Double valorDaVenda, Double valorBonus) {
        String situacao;
        if (planoVendido.getQuantidadeDisponivel() >= 1) {
            planoVendido.setValorVenda(valorDaVenda);
            quantidadePlanosVendidos += 1;
            quantidadeDescontosAplicados += 1;
            planoVendido.setQuantidadeDisponivel(planoVendido.getQuantidadeDisponivel() - 1);
            Double calcDesconto = (planoVendido.getValorVenda() * valorBonus) / 100;
            Double valorFinal = planoVendido.getValorVenda() - calcDesconto;
            situacao = String.format("\nREALIZANDO VENDA COM DESCONTO: "
                    + "\nID: %d "
                    + "\nNome: %s "
                    + "\nQuantidade disponível: %d "
                    + "\nValor: R$%.2f\n"
                    + "\nValor desconto: R$%.2f\n"
                    + "\nValor final: R$%.2f", planoVendido.getId(), planoVendido.getNomePlano(),
                    planoVendido.getQuantidadeDisponivel(), planoVendido.getValorVenda(), calcDesconto,
                    valorFinal);
        } else {
            situacao = "\nOPERAÇÃO INVÁLIDA\n";
        }
        return situacao;
    }

    public String cadastrarQuantidadeDisponivel(Plano planoQtd, Integer qtdCadastrada) {
        String alterarQtd;
        planoQtd.setQuantidadeDisponivel(qtdCadastrada);
        alterarQtd = String.format("A quantidade disponível do plano %s foi aumentada",
                planoQtd.getNomePlano());
        return alterarQtd;
    }

    @Override
    public String toString() {
        return String.format("\nOperadora %s "
                + "\nQuantidade de vendas: %d "
                + "\nDescontos aplicados: %d",
                nome, quantidadePlanosVendidos, quantidadeDescontosAplicados);
    }

}

    
    

