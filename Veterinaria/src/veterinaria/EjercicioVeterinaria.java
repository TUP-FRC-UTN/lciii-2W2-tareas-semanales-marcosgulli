package veterinaria;

import java.util.Scanner;

public class EjercicioVeterinaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese Cantidad de Clientes a Cargar:");
        cantidad = sc.nextInt();
        Clientes[] cl = new Clientes[cantidad];
        int acuEdad=0;

        for (int i = 0; i < cl.length; i++) {
            
            

            int nroCliente;
            System.out.println("Ingrese Id de Cliente nro:" + (i + 1));
            nroCliente = sc.nextInt();

            String nombre;
            System.out.println("Ingrese nombre Cliente:");
            nombre = sc.nextLine();

            sc.nextLine();

            int antiguedad;
            System.out.println("Ingrese antiguedad del cliente en años");
            antiguedad = sc.nextInt();

            String nombreMascota;
            System.out.println("Ingrese nombre de la mascota");
            nombreMascota = sc.nextLine();

            sc.nextLine();

            int edadMascota;
            System.out.println("ingrese edad de la mascota");
            edadMascota = sc.nextInt();
            acuEdad += edadMascota;
            

            cl[i] = new Clientes(nroCliente, nombre, antiguedad, nombreMascota, edadMascota);

        }

        System.out.println("La cantidad de clientes cargados es " + cl.length);
      
        System.out.println("El promedio de edad de las mascotas es "+ (double)acuEdad / cl.length+" años");
        
        int contMas5=0;
        
        for (int i = 0; i < cl.length; i++) {
            
            if (cl[i]!=null && cl[i].getAntiguedad()>5) {
                contMas5 ++;
            }
        }
        
        System.out.println("Hay "+contMas5+" clientes antigüedad mayor a 5 años");
        
    }
}
