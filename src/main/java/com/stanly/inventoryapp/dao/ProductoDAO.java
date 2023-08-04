package com.stanly.inventoryapp.dao;

import com.stanly.inventoryapp.control.GenericDAO;
import com.stanly.inventoryapp.entity.Producto;
import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import javax.sql.DataSource;

@Stateless
@Transactional
public class ProductoDAO extends GenericDAO<Producto> {

    @Resource(lookup = "java:jboss/datasources/InventoryDS")
    private DataSource dataSource;

    @PersistenceContext
    private EntityManager entityManager;

    public ProductoDAO() {
        super(Producto.class);
    }

    public void updateCantidad(Producto producto){
        Producto productoDB = findById(producto.getCantidad());

        if (productoDB != null){
            productoDB.setCantidad(producto.getCantidad());
            update(productoDB);
        }
    }

}
