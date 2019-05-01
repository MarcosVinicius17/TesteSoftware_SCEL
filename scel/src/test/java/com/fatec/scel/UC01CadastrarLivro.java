package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {

@Test
public void CT01CadastrarLivroComDadosValidos() {
	try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn(null);
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo(null);
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	@Test
	public void CT05CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	@Test
	public void CT06CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("");
		} catch (RuntimeException e) {
			assertEquals("Autor invalido",e.getMessage());
		}
	}
	@Test
	public void CT07CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor(null);
		} catch (RuntimeException e) {
			assertEquals("Autor invalido",e.getMessage());
		}
	}
	
}
