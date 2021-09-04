/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Categoria;
import service.CategoriaService;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hola mundo");
            
            List<Categoria> categorias = new CategoriaService().findAll();
            
            for (Categoria cat : categorias) {
                System.out.println(""+ cat.getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
