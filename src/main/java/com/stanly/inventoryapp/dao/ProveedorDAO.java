package com.stanly.inventoryapp.dao;

import com.stanly.inventoryapp.control.GenericDAO;
import com.stanly.inventoryapp.entity.Proveedor;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Stateless
@Transactional
public class ProveedorDAO extends GenericDAO<Proveedor> {
    @PersistenceContext
    private EntityManager entityManager;

    public ProveedorDAO() {
        super(Proveedor.class);
    }
}
