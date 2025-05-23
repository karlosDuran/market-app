package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table (name="compras")

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private Integer idCategoria;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private Double medioPago;


    private Integer comentario;

    private Boolean estado;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Double medioPago) {
        this.medioPago = medioPago;
    }

    public Integer getComentario() {
        return comentario;
    }

    public void setComentario(Integer comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}