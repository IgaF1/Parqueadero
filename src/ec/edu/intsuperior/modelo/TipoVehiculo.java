/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author 59399
 */
public class TipoVehiculo {
    
    private String idTipo;
    private String descripcionVehiculo;

    public TipoVehiculo() {
    }

    public TipoVehiculo(String idTipo, String descripcionVehiculo) {
        this.idTipo = idTipo;
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public String getDescripcionVehiculo() {
        return descripcionVehiculo;
    }

    public void setDescripcionVehiculo(String descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public String toString() {
        return getIdTipo()+"\t"
                +getDescripcionVehiculo();
    }
    
    
    
}
