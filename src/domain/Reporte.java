/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import domain.Producto.Estado;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Reporte {

    private String tipoReporte;
    private LocalDate fechaCreacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Producto> productos;
    private int cantidadTotal;
    private double totalValor;
    private String categoriaFiltro;
    private Estado estadoFiltro;
    private String observaciones;
    private List<String> detalles;// revisar si esta es necesaria

    public Reporte(String tipoReporte, LocalDate fechaCreacion, LocalDate fechaInicio,
            LocalDate fechaFin, List<Producto> productos, int cantidadTotal,
            double totalValor, String categoriaFiltro, Estado estadoFiltro,
            String observaciones, List<String> detalles) {

        this.tipoReporte = tipoReporte;
        this.fechaCreacion = fechaCreacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.productos = productos;
        this.cantidadTotal = cantidadTotal;
        this.totalValor = totalValor;
        this.categoriaFiltro = categoriaFiltro;
        this.estadoFiltro = estadoFiltro;
        this.observaciones = observaciones;
        this.detalles = detalles;

    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    public String getCategoriaFiltro() {
        return categoriaFiltro;
    }

    public void setCategoriaFiltro(String categoriaFiltro) {
        this.categoriaFiltro = categoriaFiltro;
    }

    public Estado getEstadoFiltro() {
        return estadoFiltro;
    }

    public void setEstadoFiltro(Estado estadoFiltro) {
        this.estadoFiltro = estadoFiltro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<String> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<String> detalles) {
        this.detalles = detalles;
    }

}
