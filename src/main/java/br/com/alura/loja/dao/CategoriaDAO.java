package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

public class CategoriaDAO {
	private EntityManager em;

	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria); // s� pra garantir que a categoria estar� no estado merge
	}
	
	public void remover(Categoria categoria) {
		categoria = this.em.merge(categoria); //precisa estar no estado managed
		this.em.remove(categoria);
	}
	
 
}
