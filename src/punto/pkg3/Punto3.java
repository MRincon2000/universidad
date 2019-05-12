/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg3;

/**
 *
 * @author Miguel Rincon
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Universidad u=new Universidad();
        u.añadirEstudiante("Ronalt");

        u.añadirModulo("FaGiraldo","poo");
        
        u.getEstudiantes().get(0).añadirModule(u.getModules().get(0));
        u.getEstudiantes().get(0).añadirGrade(4);
        u.getModules().get(0).añadirGrade(u.getEstudiantes().get(0).getGrades().get(0));
        System.out.println(u.getEstudiantes().get(0).getNombre()+"    "+u.getEstudiantes().get(0).getTakes().get(0).getName()+"     "+u.getEstudiantes().get(0).getGrades().get(0).getMark());
    }
    
}
