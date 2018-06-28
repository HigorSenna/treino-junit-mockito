package br.com.servico;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.entidade.Filme;
import br.com.entidade.Locacao;
import br.com.entidade.Usuario;

public class LocacaoServiceTest {

	@Test
	public void test() {
		LocacaoService locacaoService = new LocacaoService();
		
		Filme filme = new Filme("Filme 1", 2, 5.0);
		Usuario usuario = new Usuario("Usuario 1");
		
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		assertTrue(locacao.getValor() == 5.0);
	}

}
