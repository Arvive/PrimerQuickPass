/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.time.LocalDate;
/**
 *
 * @author Usuario
 */
public class Producto {
    
    private String id; 
    private String categoria;
    private int numeroCaja; 
    private int consecutivo; 
    private int numeroOficina;
    private String nombreOficina; 
    private int cantidad;
    private double precio;
    private Estado estado; //enumeraciones 
    private Tipo tipo;
    private LocalDate fechaEnvio;
    private int numeroSobre;
    private String observaciones; 
    
    
    public enum Estado {
    Activo, 
    Dañado,
    Perdido,
    }
    
    public enum Tipo{
    Prepago,
    Postpago,
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(int numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getNumeroSobre() {
        return numeroSobre;
    }

    public void setNumeroSobre(int numeroSobre) {
        this.numeroSobre = numeroSobre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
