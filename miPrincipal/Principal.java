package miPrincipal;
import logica.Persona;
import logica.Prioridad;
import logica.Empleado;
import logica.Alumno;
import java.time.LocalDate;
import java.util.Arrays;
import empleado.EmpleadoComision;
import empleado.EmpleadoPorHoras;
import empleado.EmpleadoSueldoFijo;
import logica.Ventana;
import logica.VentanaEspecial;
import logica.Barco;
import logica.DeVapor;
import logica.Velero;
import logica.Carguero;
import java.util.ArrayList;

import logica.Publicacion;
import logica.Libro;
import logica.Revista;
import logica.Fecha;
import logica.FechaDetallada;

import logica.DiaSemana;
import logica.Estado;

import logica.Tarea;

import logica.EstadoSolicitud;
import logica.Solicitud;

import logica.Animal;
import logica.Perro;
import logica.Gato;
import logica.Pajaro;
import interfases.CriterioAlumEdad;
import interfases.CriterioAlumNombre;
import interfases.CriterioAlumProm;
import interfases.Util;

import genericidad.*;

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

        mv.metodo1();
        //v.metodo1() //no es visible desde otro paquete porque no tiene identificador de acceso o}
                      //porque sea proteguida.

        System.out.println("================================================================");
        System.out.println("DEMOSTRACION DE CONVERCIONES DE TIPO EN UNA JERARQUIA DE CLASES:");
        System.out.println("================================================================");
        Barco b1 = new Barco();
        DeVapor dv = new DeVapor();
        Velero vel = new Velero();
        Carguero c1 = new Carguero();
        b1.alarma();
        b1.alarma("help ");
        System.out.println();
        dv.alarma();
        dv.alarma("help");
        System.out.println();
        vel.alarma();
        vel.alarma("help ");
        System.out.println();
        c1.alarma();
        c1.alarma("help ");
        //PENDIENTE MOSTRAR LAS CONVERSIONES DE TIPO
        int k = (int)5.8;
        System.out.println("Valor k convertido:"+k);
        //las conversiones pueden hacercon con refencias a objetos
        //pero no son posibles todas la conversiones entre referencias, hay algunas imposibles
        Integer g = 66;
        //Revista pb = (Revista)g;
        //Por lo general, solo se pueden hacer conversiones en una jerarquia de clases
        Barco b2;
        Velero v2 = new Velero();
        DeVapor dv1 = new DeVapor();
        b2 = (Barco) v2; //conversion explicita
        b2 = v2; //conversion inmplícita o automatica
        b2 = dv1;
        b2 = (Barco)dv1;

        Barco b3;
        DeVapor dv2;
        Carguero c2 = new Carguero();
        b3 = c2;
        dv2 = c2;
        Velero v3;
        c2.alarma("Auxilio");
        b3.alarma("Auxilio 2");

        //v3 = (Velero) c2; //NO ES POSIBLE PORQUE UN CARGERO NO ES UN VELERO

        System.out.println("================================================================");
        System.out.println("DEMOSTRACION DE LAS CLASES ArrayList y LinkedList:              ");
        System.out.println("================================================================");
        
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("la posicion 0 de nombres= "+nombres.get(0));
        System.out.println("la posicion 2 de nombres= "+nombres.get(2));
        System.out.println("la posicion 1 de nombres= "+nombres.get(1));

        System.err.println("RECORRO EL ARRAYLIST SECUENCIALMENTE:");
        for(int i=0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        System.out.println(); 

        System.out.println("==========================================");
        System.out.println("DEMOSTRACION DEL USO DE Enum               ");
        System.out.println("===========================================");

        DiaSemana dia = DiaSemana.MIERCOLES;
        if(dia == DiaSemana.MIERCOLES){
            System.out.println("Estoy en mitad de Semana");
        }
        System.out.println("Dia="+dia);

        //COMPARACION DE ENUM VERSUS STRING
        String diaSem= "MIiERCOLEs";
        if(diaSem.equalsIgnoreCase("MIERCOLES")){
            System.out.println("Estoy en mitad de Semana");
        }
        System.out.println("Dia="+diaSem);

        dia = DiaSemana.VIERNES;
        System.out.println("Nombre:"+dia.name());
        System.out.println("Posicion Ordinal:"+dia.ordinal());

        DiaSemana arreglo_dias[] = DiaSemana.values();
        System.out.println("Recorriendo a traves de Iteradores:");
        for(DiaSemana d:arreglo_dias){
            System.out.println(d);
        }
        System.out.println("Recorriendo a través de indice:");
        for(int i=0;i<arreglo_dias.length;i++){
            System.out.println(arreglo_dias[i].name());
        }

        Estado pedido = Estado.PENDIENTE;
        switch (pedido) {
            case PENDIENTE:
                System.out.println("El pedido esta pendiente...");
                break;
            case PROCESO:
                System.out.println("El pedido esta en proceso...");
                break;
            case TERMINADO:
                System.out.println("El pedido esta terminado..");
                break;
            default:
                System.out.println("Estado incorrecto...");
                break;
        }

        //ejemplo de un atributo tipo enum
        Tarea tarea = new Tarea("Elaboracion Reporte", Prioridad.ALTA);
        System.out.println(tarea.getPrioridad());
        //ejempo de un enumerado en la clase Solicitud
        EstadoSolicitud estadoSol = EstadoSolicitud.EN_REVISION;
        Solicitud sol = new Solicitud("Lourdes Armenta", 123, estadoSol);
        System.out.println(sol);
        sol.setEstado(EstadoSolicitud.ACEPTADA);
        estadoSol = sol.getEstado();
        System.out.println(sol);
        switch (estadoSol) {
            case RECIBIDA:
                System.out.println("La solicitud esta recibida...");
                break;
            case EN_REVISION:
                System.out.println("La solicitud esta en revision...");  
                break;
            case ACEPTADA:
                System.out.println("La solicitud esta Aceptada...");
                break;
            case RECHAZADA:
                System.out.println("La solicitud esta Rechazada...");
                break;
            default:
                System.out.println("La solicitud tiene un estado inválido...");
                break;
        }
        //DEMOSTRACION DEL USO DE POLIMORFISMO
        Gato gato1 = new Gato();
        Perro perro1 = new Perro();
        Pajaro pajaro1 = new Pajaro();
        Animal lista_animales[]={perro1,gato1,pajaro1};
        lista_animales[0].hacerSonido();
        lista_animales[1].hacerSonido();
        lista_animales[2].hacerSonido();
        gato1.hacerSonido();
        perro1.hacerSonido();
        pajaro1.hacerSonido();

        Animal gato2 = new Gato();
        Animal perro2 = new Perro();
        Animal pajaro2 = new Pajaro();
       // Animal animal2 = new Animal(); //esto no es posible porque ahors Animal es
                                        //abstracta y no puede instanciarse
        gato2.hacerSonido();
        //animal2.hacerSonido(); //no esposible porque ahora Animal es abstracto
        gato2.moverse();
        perro2.moverse();
        pajaro2.moverse();
        
        Animal perro3 = new Perro("Paulino");
        Animal gato3 = new Gato("Adelitaaaaa");
        Animal pajaro3 = new Pajaro("Lorita");
        System.out.println(perro3);
        System.out.println(gato3);
        System.out.println(pajaro3);
        gato3.setNombre("Adelita");
        System.out.println(gato3);
        System.out.print(perro3+" ");
        perro3.hacerSonido();
        perro3.moverse();
        gato3.dormir();
        perro3.dormir();
        //Ejemplo de variables polimorficas
        Animal miAnimal; //variable polimorfica
        miAnimal = new Perro("Fiona");
        miAnimal.hacerSonido();
        miAnimal = new Gato("preciosa");
        miAnimal.hacerSonido();

        interfases.Animal animal1 = new interfases.Gato();
        animal1.hacerSonido();
        animal1.moverse();

        interfases.Gato gato4 = new interfases.Gato();
        gato4.hacerSonido();
        gato4.moverse();

        interfases.Cachorro perro4 = new interfases.Perro();
        perro4.hacerSonido();
        perro4.moverse();
        perro4.jugar();

        interfases.TelefonoInteligente tel1 = new interfases.TelefonoInteligente();
        interfases.Telefono tel2 = new interfases.TelefonoInteligente();
        interfases.Camara tel3 = new interfases.TelefonoInteligente();

        tel1.tomarFoto();
        tel1.hacerLlamada();

        tel2.hacerLlamada();
        
        tel3.tomarFoto();

        //demostracion de la interfase Comparable
        interfases.Alumno alumno1 = new interfases.Alumno("Andres",15,87.5);
        interfases.Alumno alumno2 = new interfases.Alumno("Andrea",15,95.0);
        if(alumno1.compareTo(alumno2) >0){
            System.out.println(alumno1.getNombre()+ " es mayor que "+alumno2.getNombre());
        }else{
            if(alumno1.compareTo(alumno2)<0){
                System.out.println(alumno2.getNombre()+ " es mayor que "+alumno1.getNombre());
            }else{
                System.out.println(alumno1.getNombre()+" es igual que "+alumno2.getNombre());
            }
        }
        //Ordenar una coleccion de Alumnos
        interfases.Alumno arr[]={ new interfases.Alumno("Juan",20,85.0),
                                  new interfases.Alumno("Pedro", 18, 73.0),
                                  new interfases.Alumno("Alberto", 19, 70.5)
                                };
        //ordenamos el arreglo original
        Util.ordenar(arr);
        System.out.println("Mostrar el arreglo de Alumos Ordenados por Edad:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
          
        }
        interfases.Alumno arr2[]={ new interfases.Alumno("Juan",20,85.0),
                                  new interfases.Alumno("Pedro", 18, 73.0),
                                  new interfases.Alumno("Alberto", 19, 70.5)
                                };
        //ordenamos el arreglo original por nombre
        Util.ordenar(arr2,new CriterioAlumNombre());
        System.out.println("Mostrar el arreglo de Alumos Ordenados por Nombre:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
          
        }
        //ordenanos el arreglo por edad
         Util.ordenar(arr2,new CriterioAlumEdad());
         System.out.println("Mostrar el arreglo de Alumos Ordenados por Edad:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
          
        }
        //ordenamos el arreglo por promedio
        Util.ordenar(arr2, new CriterioAlumProm());
        System.out.println("Mostrar el arreglo de Alumos Ordenados por Promedio:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
          
        }

        //DEMOSTRAR LA GENERICIDAD
        CajaEnteros cajaenteros = new CajaEnteros(10);
        System.out.println(cajaenteros.getDato());
        CajaDobles cajadobles = new CajaDobles(9.81);
        System.out.println(cajadobles.getDato());
        CajaCadenas cajacadenas = new CajaCadenas("Hola, que tal!");
        System.out.println(cajacadenas.getDato());

        Caja<Integer> caja1 = new Caja<Integer>(90);
        System.out.println(caja1.getDato());

        Caja<Alumno> caja2 = new Caja<Alumno>(new Alumno("Juan", 18, "20260001"));
        System.out.println(caja2.getDato());

        Caja<String> caja3 = new Caja<>("nueva cadena");
        System.out.println(caja3.getDato());







    }
}
