package br.com.servico;

import java.util.Date;

import org.junit.Test;

import br.com.entidade.Filme;
import br.com.entidade.Locacao;
import br.com.entidade.Usuario;
import br.com.utils.DataUtils;

public class LocacaoService {

	public Locacao alugarFilme(Usuario usuario, Filme filme) throws RuntimeException {
		
		if(filme.getEstoque() == 0 ) {
			throw new RuntimeException("Sem estoque");
		}
		
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());
		
		Date dataEntrega = new Date();
		dataEntrega = DataUtils.adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//salvar locacao
		
		return locacao;
	}
	
	@Test
	public void teste() {
		
	}
}
