package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
//obtener una lista de productos filtrados por id de categoria y ordenados ascedentemente por nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    //dependiendo del nombre del metodo genera una query sql

    //obtener los productos escasos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
