package br.uff.app_corp.model;

import java.util.List;

import javax.persistence.*;

public class EdicaoDAO implements DAO {

	@Override
	public void create(Object obj) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Edicao e = (Edicao) obj;
			entityManager.getTransaction().begin();
			entityManager.persist(e);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Object getById(int id) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Evento e = entityManager.find(Evento.class, id);
			entityManager.close();
			return e;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Object> getAll() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("SELECT * FROM edicao");
//		List<Edicao> list = query.getResultList();
		return query.getResultList();
	}

	@Override
	public void update(Object obj) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Edicao newEdicao = (Edicao) obj;
			Edicao e = entityManager.find(Edicao.class, newEdicao.getEdicaoId());
			entityManager.getTransaction().begin();
			e.setNumero(newEdicao.getNumero());
			e.setAno(newEdicao.getAno());
			e.setDataInicio(newEdicao.getDataInicio());
			e.setDataFim(newEdicao.getDataFim());
			e.setCidadeSede(newEdicao.getCidadeSede());
			e.setPaisSede(newEdicao.getPaisSede());
			e.setEvento(newEdicao.getEvento());
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void delete(Object obj) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Edicao e = entityManager.find(Edicao.class, ((Edicao) obj).getEdicaoId());
			entityManager.getTransaction().begin();
			entityManager.remove(e);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			throw e;
		}

	}

}
