
package com.mycompany.ficheros;

import java.io.File;

public class Ficheros {

    public static void main(String[] args) {
        File file = new File ("C:/hola.txt"); 
        if (!file.exists()){
           System.out.println ("Nombre del archivo: " + file.getName());
           System.out.println ("Ruta: " + file.getPath());
           System.out.println ("Nombre absoluta: " + file.getAbsolutePath());
           System.out.println ("Se puede escribir? " + file.canWrite());
           System.out.println ("Se puede leer? " + file.canRead());
           System.out.println ("Tamaño: " + file.length());
        }
        
    }
}
