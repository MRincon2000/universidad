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
public class Module {
    private String lecturer;
    private String name;
    private ArrayList<Grade>grades;
    public Module(String l, String n){
        this.lecturer=l;
        this.name=n;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
public void añadirGrade(Grade g){
    this.grades=new ArrayList<>();
    this.grades.add(g);
    g.setModule(this);
}
}
