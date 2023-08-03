package com.stanly.inventoryapp.dao;

import com.stanly.inventoryapp.control.GenericDAO;
import com.stanly.inventoryapp.entity.Producto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Stateless
@Transactional
public class ProductoDAO extends GenericDAO<Producto> {
    @PersistenceContext
    private EntityManager entityManager;

    public ProductoDAO() {
        super(Producto.class);
    }
}
