/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Extremadura {

    public static ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    public static void rellenarDatos() {
        Provincia p;
        p = new Provincia();
        p.setNombre("Badajoz");
        p.setExtension(210456);
        provincias.add(p);

        p = new Provincia();
        p.setNombre("Caceres");
        p.setExtension(167832);
        provincias.add(p);

        Localidad loc;
        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Cachorrilla " + i);
            loc.setExtensión(Math.random() * 3000);
            loc.setHabitantes((int) (Math.random() * 120000));

            provincias.get(0).addLocalidad(loc);
        }

        for (int i = 0; i < 210; i++) {
            loc = new Localidad();
            loc.setNombre("Malpartida " + i);
            loc.setExtensión(Math.random() * 2500);
            loc.setHabitantes((int) (Math.random() * 80000));

            provincias.get(1).addLocalidad(loc);
        }

        //System.out.println("Este pueblo tiene " + provincias.get(0).getLocalidades().get(149).getHabitantes() + " habitantes");
    }

    public static void ejercicio01() {
        //MOSTRAR NOMBRE PROVINCIAS
       /* System.out.println("Las provincias de Extremadura son "
                + provincias.get(0).getNombre() + " y "
                + provincias.get(1).getNombre());*/
        
       //OTRA FORMA DE HACER EL FOR
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
        }
    }

    public static void ejercicio02() {
        //MOSTRAR LOCALIDADES DE LAS PROVINCIAS
/*
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
            for (int z = 0; z < provincias.get(i).getLocalidades().size(); z++) {
                System.out.println(provincias.get(i).getLocalidades().get(z).getNombre());
            }
        }*/

        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
            for (Localidad loc : p.getLocalidades()) {
                System.out.println(loc.getNombre());                
            }            
        }
    }

    public static void ejercicio03() {
        //MOSTRAR NÚMERO DE HABITANTES POR PROVINCIA
/*
        int sumaBadajoz = 0;
        int sumaCaceres = 0;
        
        for (int i = 0; i < provincias.size(); i++){
            //System.out.println(provincias.get(i).getNombre());
            for (int z = 0; z < provincias.get(i).getLocalidades().size(); z++){
                //System.out.println(provincias.get(i).getLocalidades().get(z).getNombre());
                //System.out.println(provincias.get(i).getLocalidades().get(z).getHabitantes());
                
                sumaBadajoz = sumaBadajoz + provincias.get(0).getLocalidades().get(i).getHabitantes();
                sumaCaceres = sumaCaceres + provincias.get(1).getLocalidades().get(i).getHabitantes();
            }
        }
        System.out.println("La suma de los habitantes de Badajoz es " + sumaBadajoz);
        System.out.println("La suma de los habitantes de Caceres es " + sumaCaceres); 
*/
        int sumaProvincia = 0;

        for (Provincia p : provincias) {
            sumaProvincia = 0;
            //System.out.println(p.getNombre());
            for (Localidad loc : p.getLocalidades()) {
                
                sumaProvincia = sumaProvincia + loc.getHabitantes();
            }   
            System.out.println("La suma de los habitantes de " + p.getNombre()+ " es " + sumaProvincia);
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        //ejercicio01();
        //ejercicio02();
        ejercicio03();

    }

}
