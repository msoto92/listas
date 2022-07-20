/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Miguel
 */
public class Listas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(1);
        a.add(10);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(5);
        a.add(1);
        a.add(10);

        LinkedList<Integer> a1 = new LinkedList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(1);
        b.add(5);
        b.add(7);

        System.out.println("--------------------");

        eliminarRepetidos(a);

        System.out.println("--------------------");

        mostrarRepetidos(a1, b);

        System.out.println("---------------------");

        Persona p1 = new Estudiante("Miguel", "Soto", 30 , "114084555" , "Ing. Sistemas");
        Persona p2 = new Estudiante("Luis", "Torres", 20, "9226545", "Ing. Sistemas");
        Persona p3 = new Estudiante("Luz", "Rueda", 50, "9954657", "Ing. Sistemas");
        Persona p4 = new Estudiante("Julia", "Rodriguez", 18, "9954658", "Ing. Sistemas");

        ArrayList<Persona> totalEstudiantes = new ArrayList<>();
        totalEstudiantes.add(p1);
        totalEstudiantes.add(p2);
        totalEstudiantes.add(p3);
        totalEstudiantes.add(p4);
        
        ArrayList<Persona> asistencia = new ArrayList<>();
        asistencia.add(p2);
        asistencia.add(p4);
        
        
        Vector<Persona> v = new Vector<>();
        v.add(p1);
        v.add(p2);
        v.add(p3);

        inversa(v);

        System.out.println("----------------------");
        ordenar(a);

        System.out.println("----------------------");
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("HTTP", "80");
        hm.put("SSH", "22");
        hm.put("BD", "1434");
        hm.put("FTP", "2022");

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("HTTP", "80");
        hm2.put("SSH", "22");
        hm2.put("BD", "1434");
        hm2.put("FTP", "2022");

        boolean vLlave = validarLlaves(hm, hm2);
        System.out.println(vLlave);
        
        System.out.println("----------------------");
        
        TreeMap<String, String> json = new TreeMap<>();
        json.put("nombre", "Carlos");
        json.put("apellido", "Varela");
        json.put("ciudad", "Barranquilla");
        
        TreeMap<String, String> json1 = new TreeMap<>();
        json.put("nombre", "Juan");
        json.put("apellido", "Contreras");
        json.put("ciudad", "Cartagena");
        json.put("departamento", "Bolivar");
        
        TreeMap<String, String> nuevo = mezcle(json,json1);
        
        for (Map.Entry<String, String> i : nuevo.entrySet()) 
        {
            System.out.println(i.getKey() + ": " + i.getValue());
        }

        System.out.println("-----------------------");
        noFueronAClase(totalEstudiantes, asistencia);
       
    }

    public static void eliminarRepetidos(ArrayList<Integer> numeros) {
        ArrayList<Integer> nuevo = new ArrayList<>();

        for (Integer x : numeros) {
            if (nuevo.contains(x) == false) {
                nuevo.add(x);
            }
        }

        for (int i = 0; i < nuevo.size(); i++) {
            System.out.println(nuevo.get(i));
        }

    }

    public static void mostrarRepetidos(LinkedList<Integer> a, LinkedList<Integer> b) {

        for (Integer x : a) {
            if (b.contains(x)) {
                System.out.println(x);
            }
        }

    }

    public static void inversa(Vector<Persona> v) {
        Vector<Persona> nuevo = new Vector<>();

        for (int i = v.size() - 1; i >= 0; i--) {
            nuevo.add(v.get(i));
        }

        for (Persona p : nuevo) {
            System.out.println(p);
        }

    }

    public static void ordenar(ArrayList<Integer> a) {
        Collections.sort(a);

        for (Integer x : a) {
            System.out.println(x);
        }

    }

    public static boolean validarLlaves(HashMap<String, String> a, HashMap<String, String> b) {
        boolean encontrarPareja = true;

        for (Map.Entry<String, String> p : a.entrySet()) {
            if (b.containsKey(p.getKey())) {
                if (p.getValue().equals(b.get(p.getKey())) == false) {
                    encontrarPareja = false;
                }
            } else {
                encontrarPareja = false;
            }

        }

        return encontrarPareja;
    }

    public static TreeMap<String, String> mezcle(TreeMap<String, String> a, TreeMap<String, String> b) {
        TreeMap<String, String> resultado = new TreeMap<String, String>();
        
        for ( Map.Entry<String, String> i : a.entrySet()) 
        {
            resultado.put(i.getKey(), i.getValue());
        }
        
        for (Map.Entry<String, String> i: b.entrySet()) 
        {
            if(!resultado.containsKey(i.getKey()))    
            {
                resultado.put(i.getKey(), i.getValue());
            }
        }
        
        return resultado;
    }

    public static void noFueronAClase(ArrayList<Persona> total, ArrayList<Persona> a)
    {
        for (Persona p : total) 
        {
            boolean asistio = false;
            
            for (Persona pa: a) 
            {
                if(p.getDocumento().equals(pa.getDocumento()))
                {
                    asistio = true;
                }                
            }
            
            if(asistio == false)
            {
                System.out.println("El estudiante: " + p.toString() +" No fue a clases" );
            }
        }
    }
}
