package com.fatec.scel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fatec.scel.model.PapelDoUsuario;
import com.fatec.scel.model.Usuario;
import com.fatec.scel.model.UsuarioRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntPredicate;
import javax.validation.ConstraintViolationException;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import com.fatec.scel.model.Livro;
import com.fatec.scel.model.LivroRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UC02CadastrarUsuario {
	@Autowired
	private UsuarioRepository repository;
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	private Usuario usuario;

	/*@Before
	public void start() {
		usuario = new Usuario(UUID.randomUUID(),"prof.edsonalmeida@fatec.sp.br","pwd",);
	}*/
	
	@Test
	public void testStoreUser(IntPredicate user) {
		HashSet<PapelDoUsuario> papel = new HashSet<>();
		papel.add(PapelDoUsuario.PROFESSOR);
		// Usuario user = repository.save(new Usuario(UUID.randomUUID(),
		// "prof.edsonalmeida@fatec.sp.br", "pwd", papel));
		repository.save(new Usuario(UUID.randomUUID(), "prof.edsonalmeida@fatec.sp.br", "pwd", papel));
		assertThat(repository.count()).isEqualTo(1L);
	}



	/*@Test
	public void ct01_saveComISBN_NuloDeveLancarException() throws Exception {
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O isbn deve ser preenchido");
		usuario.setEmail(null);
		
	}*/

}