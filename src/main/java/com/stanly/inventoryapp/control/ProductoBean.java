package com.stanly.inventoryapp.control;

import com.stanly.inventoryapp.dao.CategoriaDAO;
import com.stanly.inventoryapp.dao.ProductoDAO;
import com.stanly.inventoryapp.dao.ProveedorDAO;
import com.stanly.inventoryapp.entity.Categoria;
import com.stanly.inventoryapp.entity.Producto;
import com.stanly.inventoryapp.entity.Proveedor;
import jakarta.annotation.ManagedBean;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ProductoBean implements Serializable {
    private Producto producto;
    private List<Categoria> categorias;
    private List<Proveedor> proveedores;
    private String newCategoria;
    private String newProveedor;
    private ProductoDAO productoDAO;
    private CategoriaDAO categoriaDAO;
    private ProveedorDAO proveedorDAO;


    @PostConstruct
    public void init(){
        producto = new Producto();
        productoDAO = new ProductoDAO();
        categorias = new ArrayList<>();
        categoriaDAO = new CategoriaDAO();
        proveedores = new ArrayList<>();
        proveedorDAO = new ProveedorDAO();
        //Cargar las categorias y proveedores desde la base de datos
    }

    public void guardarProducto(){
        productoDAO.create(producto);
        producto = new Producto();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto guardado exitosamente.", null));
    }

    public void addCategoria(){
        Categoria nuevaCategoria = new Categoria(newCategoria);
        categoriaDAO.create(nuevaCategoria);
        categorias.add(nuevaCategoria);
        newCategoria= "";
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Nueva categoria agregada.", null));
    }

    public void addProveedor(){
        Proveedor nuevoProveedor = new Proveedor(newProveedor);
        proveedorDAO.create(nuevoProveedor);
        proveedores.add(nuevoProveedor);
        newProveedor = "";
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Nuevo proveedor agregada.", null));
    }



    //Getters and Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public String getNewCategoria() {
        return newCategoria;
    }

    public void setNewCategoria(String newCategoria) {
        this.newCategoria = newCategoria;
    }

    public String getNewProveedor() {
        return newProveedor;
    }

    public void setNewProveedor(String newProveedor) {
        this.newProveedor = newProveedor;
    }
}
