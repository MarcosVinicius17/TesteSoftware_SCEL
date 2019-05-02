package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.Usuario;

public class UC05CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("123123");
			u.setNome("Marcos");
		} catch (RuntimeException e) {

			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02CadastrarUsuarioComRAEmBranco() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("");
			u.setNome("Marcos");
		} catch (RuntimeException e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComRANulo() {
		try {
			Usuario u = new Usuario();
			
			u.setRa(null);
			u.setNome("Marcos");
		} catch (RuntimeException e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComNomeEmBranco() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("123123");
			u.setNome("");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComNomeNulo() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("123123");
			u.setNome(null);
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT06CadastrarUsuarioGetRA() {
		Usuario u = new Usuario();
		try {
			u.setNome("Marcos");
			u.setRa("123123");
		} catch (RuntimeException e) {
			fail("nao deve falhar");
		}
		
	assertEquals("Marcos",u.getNome());
	}	
	
	@Test
	public void CT07CadastrarUsuarioGetRA() {
		Usuario u = new Usuario();
		try {
			u.setNome("Marcos");
			u.setRa("123123");
		} catch (RuntimeException e) {
			fail("nao deve falhar");
		}
		
		assertEquals("123123",u.getRa());
	}	
	
	
	
}
