package com.stanly.inventoryapp.control;


import jakarta.annotation.Resource;
import jakarta.ejb.TransactionManagement;
import jakarta.ejb.TransactionManagementType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import javax.sql.DataSource;
import java.util.List;

public abstract class GenericDAO<T> {

    @Resource(lookup = "java:jboss/datasources/InventoryDS")
    private DataSource dataSource;
    @PersistenceContext
    private EntityManager entityManager;

    private Class<T> entityClass;

    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T findById(long id){
        return entityManager.find(entityClass, id);
    }

    public List<T> findAll(){
        return entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() +
                " e", entityClass).getResultList();
    }

    public List<T> findRange(int startPosition, int maxResults) {
        return entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass)
                .setFirstResult(startPosition)
                .setMaxResults(maxResults)
                .getResultList();
    }

    public void create(T entity) {
        entityManager.persist(entity);
    }

    public void update(T entity){
        entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

}
