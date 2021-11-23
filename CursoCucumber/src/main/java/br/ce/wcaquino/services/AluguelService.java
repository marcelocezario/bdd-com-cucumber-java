package br.ce.wcaquino.services;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}
