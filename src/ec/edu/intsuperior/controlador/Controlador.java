/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Propietario;
import ec.edu.intsuperior.modelo.TipoVehiculo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author 59399
 */
public class Controlador {
    
    ArrayList<TipoVehiculo>listaTipoVehiculo=new ArrayList<>();
    ArrayList<Propietario>listaPropietario=new  ArrayList<>();
    
    public void agregarTipoVehiculo(){
        int op;
        do {            
        TipoVehiculo tv = new TipoVehiculo();
        tv.setIdTipo(JOptionPane.showInputDialog("Igresa el codiodo del tipo : "));
        tv.setDescripcionVehiculo(JOptionPane.showInputDialog("Ingresa la descripcion del tipo de vehiculo: "));
        listaTipoVehiculo.add(tv);
        op= JOptionPane.showConfirmDialog(null,"Deseas continuar.....?");
       } while (op!=1);
    } 
    
    public void mostrarTiposVehiculos(){
        JOptionPane.showConfirmDialog(null,listaTipoVehiculo.toString());
        
    }
    
    private  Propietario crearPropietario(){
        Propietario p = new  Propietario();
        p.setCi(JOptionPane.showInputDialog("Ingresa la cedula"));
        p.setApellido1(JOptionPane.showInputDialog("Ingresa un apellido"));
        p.setNombre1(JOptionPane.showInputDialog("Ingresa un nombre"));
        return p;
        
    }
    
    public void anadirListaPropietario(){
        
        int op;
        do {            
            op=JOptionPane.showConfirmDialog(null, "Deseas ingresar un propietario :");
            if(op!=1){
                listaPropietario.add(crearPropietario());
             }
        } while (op==0);
        
        JOptionPane.showMessageDialog(null,listaPropietario.toString());
        
//        listaPropietario.add(crearPropietario());
        
    }
     
    public void crearArchivo(){
        try {
        String ruta ="C:\\Users\\59399\\Desktop\\INT SEGUNDO SEMESTRE\\Programacion orientada a objetos\\ISMAELFLORES\\datos.txt" ;
        File file = new File(ruta);
        if (!file.exists()) {
            file.createNewFile();
            
            
        }
        } catch (Exception e) {
         e.printStackTrace();
       } 
    }

    }

    
    