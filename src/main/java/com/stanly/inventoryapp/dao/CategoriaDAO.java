package com.stanly.inventoryapp.dao;

import com.stanly.inventoryapp.control.GenericDAO;
import com.stanly.inventoryapp.entity.Categoria;
import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import javax.sql.DataSource;

@Stateless
@Transactional
public class CategoriaDAO extends GenericDAO<Categoria> {

    @Resource(lookup = "java:jboss/datasources/InventoryDS")
    private DataSource dataSource;

    @PersistenceContext
    private EntityManager entityManager;

    public CategoriaDAO(){
        super(Categoria.class);
    }

}
