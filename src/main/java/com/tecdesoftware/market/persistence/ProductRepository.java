package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;

import java.util.List;

public class ProductRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner SELECT * from productos
    public List<Producto> getALL() {
        //convirtiendo un iterable<T> a una lista de productos List <Producto>
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
