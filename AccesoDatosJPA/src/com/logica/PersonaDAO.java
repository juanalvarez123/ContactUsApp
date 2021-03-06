package com.logica;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.modelo.PersonaEntity;

import java.util.*;

@Stateless
public class PersonaDAO implements IPersonaDAO {
	
	@PersistenceContext(unitName = "AccesoDatosJPA")
	private EntityManager em;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<PersonaEntity> consultarPersonas() {
		return (List<PersonaEntity>) em.createNamedQuery("PersonaEntity.findAll").getResultList();
	}
	
	@Override
	public boolean registrarPersona(PersonaEntity persona) {
		try {
			em.persist(persona);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

}