package miPrincipal;
import logica.Persona;
import logica.Empleado;
import logica.Alumno;
import java.time.LocalDate;
import java.util.Arrays;
import empleado.EmpleadoComision;
import empleado.EmpleadoPorHoras;
import empleado.EmpleadoSueldoFijo;
import logica.Ventana;
import logica.VentanaEspecial;


import logica.Publicacion;
import logica.Libro;
import logica.Revista;
import logica.Fecha;
import logica.FechaDetallada;
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
        //Si recibes la fecha como texto con 
        // formato AAAA-MM-DD, se puede
        // con LocalDate.parse("2026-10-08").
        LocalDate f1 = LocalDate.of(2026,10,8);
        Publicacion pub1 = new Publicacion("Alfaguara", f1);
        System.out.println(pub1);
        Libro lib1 = new Libro(pub1.getEditorial(),pub1.getFechaPub(), 
                        "ISBN-1","Gabriel García Marquez","Cien Años de Soledad");
        Libro lib2 = new Libro(pub1.getEditorial(),pub1.getFechaPub(), "ISBN-2","Julio Cortazar","Rayuela");
        Libro lib3 = new Libro("Fondo de Cultura Económica",LocalDate.of(1953,1,1),
                        "ISBN-3","Juan Rulfo","El llano en llamas");
        Libro lib4 = new Libro("Editorial Planeta",LocalDate.of(1989,1,1),
                    "ISBN-4","Laura Esquivel","Como Agua para Chocolate");
        
        System.out.println(lib1);
        System.out.println(lib2);
        System.out.println(lib3);
        System.out.println(lib4);

        Publicacion pub2 = new Publicacion("Nexos, Sociedad, Ciencia y Literatura, S. A. de C. V.",
                                LocalDate.of(1978,1,1));
        Revista rev1 = new Revista(pub2.getEditorial(), pub2.getFechaPub(),
                        1,"Nexos", "mensual");
        Revista rev2 = new Revista("Comunicación e Información, S. A. de C. V. (CISA)",LocalDate.of(1976,1,1),
                2,"Proceso","mensual");

        System.out.println("Editorial:"+rev1.getEditorial()+"Fecha pub:"+rev1.getFechaPub()+" "+rev1);
        System.out.println(rev2);

        System.out.println("======================================================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA EN CLASE BASE FECHA Y DERIVADA FECHADETALLADA");
        System.out.println("======================================================================");

        Fecha fec1 = new Fecha(13,10,2026);
        System.out.println(fec1.toString());
        Fecha fec2 = new Fecha();
        System.out.println(fec2);

        FechaDetallada fec3 = new FechaDetallada();
        System.out.println(fec3);

        FechaDetallada fec4 = new FechaDetallada(13,10,2026);
        System.out.println(fec4);

        Fecha fec5 = new Fecha(11,2,1968);
        Fecha fec6 = new Fecha(11,2,1968);
        System.out.println("Fecha 5:"+fec5);
        System.out.println("Fecha 6:"+fec6);
        System.out.println("es "+fec5+" igual a "+fec6+" "+(fec5.equals(fec6)));

        int a = 5;
        int b = 5;
        System.out.println("es "+a+" igual a "+b+ " "+(a==b));

        String cad1 ="hola";
        String cad2 ="hola";
        System.out.println("es "+cad1+" igual a "+cad2+ " "+(cad1.equals(cad2)));

        //Comparar igualdad en dos fecha detalladas
        FechaDetallada fec7 = new FechaDetallada(14,10,2026);
        FechaDetallada fec8 = new FechaDetallada(14,10,2026);
        FechaDetallada fec9 = new FechaDetallada(15,10,2026);

        System.out.println("la fecha :"+fec7+" es igual a la fecha:"+fec8+" ? "+fec7.equals(fec8));
        System.out.println("la fecha :"+fec8+" es igual a la fecha:"+fec9+" ? "+fec8.equals(fec9));

        //String arreglo_meses[] = fec8.meses; //DEJO DE FUNCIONAR PORQUE LA HICE PROIVADA
        System.out.println("El arreglo de meses de "+fec8+":");
        //String cadena = fec8.getMeses(); //DEJO DE FUNCIONAR PORQUE EL METODO LO HICE ESTATICO
        //System.out.println(cadena);
        /* 
        for(int i=0;i<arreglo_meses.length;i++){
            System.out.println(arreglo_meses[i]);
        }
            */
        //arreglo_meses = fec9.meses; //DEJO DE FUNCIONAR PORQUE LA HICE PRIVADA
        System.out.println("El arreglo de meses de "+fec9+":");
        //cadena = fec9.getMeses(); //DEJO DE FUNCIONAR PORQUE EL METODO LO HICE STATICO
        //System.out.println(cadena);
        /* 
        for(int i=0;i<arreglo_meses.length;i++){
            System.out.println(arreglo_meses[i]);
        }
            */

        //arreglo_meses = fec7.meses; //DEJO DE FUNCIONAR PORQUE LA HICE PRIVADA
        System.out.println("El arreglo de meses de "+fec7+":");
        //cadena = fec7.getMeses(); //DEJO DE FUNCIONAR PORQUE EL METODO LO HICE ESTATICO
        //System.out.println(cadena);
        /* 
        String cadena = Arrays.toString(arreglo_meses);
        System.out.println(cadena);

        //arreglo_meses = FechaDetallada.meses; //DEJO DE FUNCIONAR PORQUE LA HICE PROVADA
        */
        String cadena = FechaDetallada.getMeses();
        System.out.println(cadena);
        System.out.println("Cantidad de Fechas que he creado:"+FechaDetallada.getContador());

        System.out.println("================================================================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA EN CLASE EMPLEADO Y DERIVADA: COMISION,POR HORAS Y FIJO");
        System.out.println("================================================================================");

        empleado.Empleado emp1 = new empleado.Empleado("Juan Perez",21,"Base");
        System.out.println(emp1);
        EmpleadoSueldoFijo emp2 = new EmpleadoSueldoFijo("Emilia Cazarez",18,
                "EVENTUAL",15000.00);
        System.out.println("Nombre:"+emp2.getNombre()+" Edad "+emp2.getEdad()+" Tipo:"+emp2.getTipoRelacionLaboral()+" "+emp2);

        System.out.println("==================================================================================");
        System.out.println("DEMOSTRACIÓN DE SOBRECARGA DE METODOS DE CLASES DERIVADAS: Ventana y VentanaEspecial");
        System.out.println("===================================================================================");

        VentanaEspecial mv = new VentanaEspecial();
        Ventana v = new Ventana();
        v.copiar("cualquie cadena", 0, 0);
        mv.copiar(v);
        mv.copiar("Esto es una cadena", 1, 5);
        mv.copiar('$',10,1,5);

    }
}
