/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.modelo.Propietario;
import ec.edu.intsuperior.modelo.TipoVehiculo;

/**
 *
 * @author 59399
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
//        p = new Propietario();
//        p.setApellido1("Flores");
//        p.setNombre1("Andres");
//         Propietario
//        System.out.println(p.toString()); 
//        
//        Propietario p1 = new Propietario();
//        p1.setCi("1712934858");
//        p1.setApellido1("Flores");
//        p1.setApellido1("Gomez");
//        
//        System.out.println(p1.toString());

//          TipoVehiculo tv=new TipoVehiculo();
//          tv.setIdTipo("T001");
//          tv.setDescripcionVehiculo("Chevrolet");
//          
//          System.out.println(tv.toString());
//          
//          TipoVehiculo tv1= new   TipoVehiculo();
//          tv1.setIdTipo("T002");
//          tv1.setDescripcionVehiculo("Mazda");
//          
//          System.out.println(tv1.toString());

            Controlador c = new Controlador();
            c.agregarTipoVehiculo();
            c.mostrarTiposVehiculos();
            
 
    }
    
}
