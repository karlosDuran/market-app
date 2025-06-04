package com.tecdesoftware.market.persistence.entity;//package com.tecdesoftware.market.persistence.entity;
//
//
////pra unir las 2 llaves y crear una llave compuesta
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.EmbeddedId;
//
//import java.io.Serializable;
//
//@Embeddable
//
//public class CompraProductoPK implements Serializable {
//    @EmbeddedId
//    private CompraProductoPK id;
//
//    private Integer cantidad;
//    private Double total;
//    private Boolean estado;
//
//    //saber todos los productos
//    public CompraProductoPK getId() {
//        return id;
//    }
//
//    public void setId(CompraProductoPK id) {
//        this.id = id;
//    }
//
//    public Integer getCantidad() {
//        return cantidad;
//    }
//
//    public void setCantidad(Integer cantidad) {
//        this.cantidad = cantidad;
//    }
//
//    public Double getTotal() {
//        return total;
//    }
//
//    public void setTotal(Double total) {
//        this.total = total;
//    }
//
//    public Boolean getEstado() {
//        return estado;
//    }
//
//    public void setEstado(Boolean estado) {
//        this.estado = estado;
//    }
//}

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

//ESta llave es para crear la llave compuesta
@Embeddable
public class CompraProductoPK {

    @Column(name= "id_compra")
    private Integer idCompra;

    @Column(name= "id_producto")
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}