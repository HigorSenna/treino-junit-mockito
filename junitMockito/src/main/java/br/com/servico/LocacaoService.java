package br.com.servico;

import java.util.Date;

import org.junit.Test;

import br.com.entidade.Filme;
import br.com.entidade.Locacao;
import br.com.entidade.Usuario;
import br.com.utils.DataUtils;

public class LocacaoService {

	public Locacao alugarFilme(Usuario usuario, Filme filme) {
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
		LocacaoService locacaoService = new LocacaoService();
		
		Filme filme = new Filme("Filme 1", 2, 5.0);
		Usuario usuario = new Usuario("Usuario 1");
		
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		System.out.println();
	}
}
