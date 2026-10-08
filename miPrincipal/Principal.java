package miPrincipal;
import logica.Persona;
import logica.Empleado;

import java.time.LocalDate;

import logica.Alumno;

public class Principal {
   
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA EN CLASE PERSONA");
        System.out.println("==========================================");
        Persona p1 = new Persona();
        Persona p2 = new Persona("Tito Ramirez",13);
        System.out.println("Nombre de p1:"+p1.getNombre());
        System.out.println("Edad de p1:"+p1.getEdad());
        System.out.println();
        System.out.println("Nombre de p2:"+p2.getNombre());
        System.out.println("Edad de p2:"+p2.getEdad());
        System.out.println();

        p1.setNombre("Emma Tomson");
        p1.setEdad(55);
        System.out.println("Nombre de p1 modificado:"+p1.getNombre());
        System.out.println("Edad de p1 modificado:"+p1.getEdad());
        System.out.println();

        Alumno a1 = new Alumno();
        System.out.println("Nombre de a1:"+a1.getNombre());
        System.out.println("Edad de a1:"+a1.getEdad());
        System.out.println("Matricula de a1:"+a1.getMatricula());
        a1.setNombre("Juliana Beltran");
        a1.setEdad(20);
        a1.setMatricula("202700001");
        System.out.println("Nombre de a1 MODIFICADO:"+a1.getNombre());
        System.out.println("Edad de a1 MODIFICADO:"+a1.getEdad());
        System.out.println("Matricula de a1 MODIFICADA:"+a1.getMatricula());
        System.out.println();

        Alumno a2 = new Alumno("Carlos Cossio",17,"20260002");
        System.out.println("Nombre de a2:"+a2.getNombre());
        System.out.println("Edad de a2:"+a2.getEdad());
        System.out.println("Matricula de a2:"+a2.getMatricula());
        System.out.println();

        Empleado e1 = new Empleado();
        System.out.println("Nombre de e1:"+e1.getNombre());
        System.out.println("Edad de e1:"+e1.getEdad());
        System.out.println("Salario de e1:"+e1.getSalario());
        System.out.println();

        Empleado e2 = new Empleado("Beatriz Trillo", 45, 25000.50);
        System.out.println("Nombre de e2:"+e2.getNombre());
        System.out.println("Edad de e2:"+e2.getEdad());
        System.out.println("Salario de e2:"+e2.getSalario());

        //utilinzado el metodo para mostrar detalles de Persona
        System.out.println("Objetos tipo Persona (BASE)");
        System.out.println("Detalle de p1:"+p1.mostrarDatos());
        System.out.println("Detalle de p2:"+p2.mostrarDatos());
        System.out.println("Objetos tipo Alumno y Empleado (DERIVADAS)");
        System.out.println("Detalle de a1:"+a1.mostrarDatos());
        System.out.println("Detalle de a2:"+a2.mostrarDatos());
        System.out.println("Detalle de e1:"+e1.mostrarDatos());
        System.out.println("Datalle de e2:"+e2.mostrarDatos());

        //Otroa de mostrar los detalles de un objeto
        System.out.println("Persona p1"+p1.toString());
        System.out.println("Persona p1"+p2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(e1);
        System.out.println(e2);

        //DEMOSTRACION DE LA JERARQUIA DE CLASES PUBLICACION-LIBRO-REVISTA
        System.out.println("==================================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA EN CLASE BASE PUBLICACION");
        System.out.println("=================================================");        
        //LocalDate crea una fecha sin hora
        //LocalDate(año,mes,dia)
        //LocalDate fecha = LocalDate.of(2026,10,8);
        //LocalDate fechaActual = LocalDate.now();
        


        







 
    }
}