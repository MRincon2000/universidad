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
public class Universidad {
    
    private ArrayList<Estudiante>estudiantes;
    private ArrayList<Module>modules;
    public Universidad(){
    estudiantes=new ArrayList<>();
    modules=new ArrayList<>();
    }
    public ArrayList<Estudiante> getEstudiantes(){
        return this.estudiantes;
    }
    
 public ArrayList<Module> getModules(){
        return this.modules;
    }
   public void añadirEstudiante(String s){
      Estudiante e=new Estudiante(s);
      this.estudiantes.add(e);
   }
   public void añadirModulo(String l, String n){
       Module m= new Module(l,n);
       this.modules.add(m);
   }
}
