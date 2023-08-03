package com.stanly.inventoryapp.dao;

import com.stanly.inventoryapp.control.GenericDAO;
import com.stanly.inventoryapp.entity.Categoria;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Stateless
@Transactional
public class CategoriaDAO extends GenericDAO<Categoria> {
    @PersistenceContext
    private EntityManager entityManager;

    public CategoriaDAO(){
        super(Categoria.class);
    }
}
