package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Esta anotacion le dice a spring que este archivo se enlaza con la BD(base de datos)
@Repository
public class ProductRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner SELECT * from productos
    public List<Producto> getALL() {
        //convirtiendo un iterable<T> a una lista de productos List <Producto>
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos (int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    //obtener un producto dado el id
    public Optional<Producto> getProductoById(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //guardar un producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //eliminar producto por id
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}
