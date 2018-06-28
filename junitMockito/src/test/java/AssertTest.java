import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


import org.junit.Assert;
import org.junit.Test;

import br.com.entidade.Filme;
import br.com.entidade.Locacao;
import br.com.entidade.Usuario;
import br.com.servico.LocacaoService;

public class AssertTest {

	@Test
	public void teste() {
		Assert.assertEquals(0.523, 0.528, 0.01); //Implementação com delta => Math.abs(valor1 - valor2) <= delta -> valor absoluto(sem sinal) dos dois numeros é menor ou igual ao delta? = true
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		LocacaoService locacaoService = new LocacaoService();
		
		Filme filme = new Filme("Filme 1", 2, 5.0);
		Usuario usuario = new Usuario("Usuario 1");
		
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		
		assertThat(locacao.getValor(), is(equalTo(5.0)));
		assertThat(locacao.getValor(), is(not(6.0)));
	
	}
}
