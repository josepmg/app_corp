package br.uff.app_corp.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EventoDAO implements DAO {
	
	@Override
	public void create(Object obj) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Evento e = (Evento) obj;
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
		Query query = entityManager.createQuery("SELECT * FROM evento");
//		List<Edicao> list = query.getResultList();
		return query.getResultList();
	}

	@Override
	public void update(Object obj) throws Exception {
		try {
			EntityManager entityManager = JPAUtil.getEntityManager();
			Evento newEvento = (Evento) obj;
			Evento oldEvento = entityManager.find(Evento.class, newEvento.getEventoId());
	        entityManager.getTransaction().begin();
	        oldEvento.setNome(newEvento.getNome());
	        oldEvento.setSigla(newEvento.getSigla());
	        oldEvento.setAreaConcentracao(newEvento.getAreaConcentracao());
	        oldEvento.setInstituicaoOrganizadora(newEvento.getInstituicaoOrganizadora());
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
			Evento e = entityManager.find(Evento.class, ((Evento) obj).getEventoId());
	        entityManager.getTransaction().begin();
	        entityManager.remove(e);
	        entityManager.getTransaction().commit();
	        entityManager.close();
		} catch (Exception e) {
			throw e;
		}

	}

}
