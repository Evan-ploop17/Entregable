/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

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
    /*
    @Test
    public void test(){
        fail("Not yet implemented");
    }*/
    
     @Test
     public void testSueldoBruto(){
         Empleado_Planilla empleado;
        empleado = new Empleado_Planilla(null, null, null, null, 20, null, 10, 45, 1000, 1, null, null);
        double resultado;
        resultado = empleado.sueldoBruto();
         assertEquals((45*1000), resultado, 0.00);
     }
     
    @Test 
    public void testHorasExtras(){
        Empleado_Planilla empleado;
        empleado = new Empleado_Planilla(null, null, null, null, 20, null, 10, 45, 1000, 1, null, null);
        int resultado;
        resultado = empleado.cant_horas_extras();
        assertEquals(5, resultado);
        
    }
    
    @Test
    public void testBonoHijos(){
        Empleado_Planilla empleado;
        empleado = new Empleado_Planilla(null, null, null, null, 20, null, 1, 45, 1000, 2, null, null);
        double resultado;
        resultado = empleado.bonoHijos();
        assertEquals(((45*1000)*0.032), resultado, 0.00);
    }
}
