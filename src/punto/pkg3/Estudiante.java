/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg3;
import java.util.*;
/**
 *
 * @author Miguel Rincon
 */
public class Estudiante {
    private String nombre;
    private ArrayList<Grade>grades;
    private ArrayList<Module>takes;
    
    public Estudiante(String n){
        this.grades= new ArrayList<>();
        this.takes=new ArrayList<>();
        this.nombre=n;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public ArrayList<Module> getTakes() {
        return takes;
    }
    
    public void añadirGrade(int mark){
        Grade grade=new Grade(mark);
        this.grades.add(grade);
        grade.setEstudiante(this);
    }
public void añadirModule(Module m){
    this.takes.add(m);
}
}
