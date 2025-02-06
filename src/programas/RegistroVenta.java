
package programas;

import java.util.Scanner;
public class RegistroVenta {
   public static void main(String[] args){
       //declarar variables
       String vendedor;
       Double vt1,vt2,vt3,comision,sm,sn;
       Scanner lectura=new Scanner(System.in);
       //entrada de datos
       System.out.print("Nombre de Vendedor:");
       vendedor=lectura.next();
       System.out.print("Sueldo Mensual:");
       sm=lectura.nextDouble();
       System.out.print("Ingresar la Venta 1:");
       vt1=lectura.nextDouble();
       System.out.print("Ingresar la Venta 2:");
       vt2=lectura.nextDouble();
       System.out.print("Ingresar la Venta 3:");
       vt3=lectura.nextDouble();
       //proceso de datos
       comision=(vt1+vt2+vt3)*0.10;
       sn=sm+comision;
       //salida de datos
       System.out.println("Sueldo mensual:"+sm);
       System.out.println("Comisión de ventas:"+comision);
       System.out.println("Sueldo Neto:"+sn); 
   }  
}
