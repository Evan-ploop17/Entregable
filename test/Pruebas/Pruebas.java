/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controladores.Empleado;
import Controladores.Empleado_Planilla;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esteban
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @Test
    public void test(){
        fail("Not yet implemented");
    }
    
     @Test
     public void testSueldoBruto(){
        // Empleado_Planilla empleadoPlanilla = new Empleado_Planilla("Esteban", 
        //"100", "cll",20,"Bachiller",10,45, 1000, 0, "Afp", "onp" );

        Empleado_Planilla empleado;
        empleado = new Empleado_Planilla(null, null, null, null, 20, null, 10, 45, 1000, 1, null, null);
        double resultado;
        resultado = empleado.sueldoBruto();
         assertEquals((45*1000), resultado, 0.00);
         
     }
}
