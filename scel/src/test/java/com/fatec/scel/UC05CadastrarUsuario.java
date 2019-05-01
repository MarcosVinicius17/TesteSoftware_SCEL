package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;


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
	public void CT02CadastrarUsuarioComDadosInvalidos() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("");
			u.setNome("Marcos");
		} catch (RuntimeException e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComDadosInvalidos() {
		try {
			Usuario u = new Usuario();
			
			u.setRa(null);
			u.setNome("Marcos");
		} catch (RuntimeException e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComDadosInvalidos() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("123123");
			u.setNome("");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComDadosInvalidos() {
		try {
			Usuario u = new Usuario();
			
			u.setRa("123123");
			u.setNome(null);
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
}
