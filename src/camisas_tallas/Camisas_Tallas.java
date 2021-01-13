/*
 *Una empresa desea comprarles camisas a sus empleados y para ello requiere 
un sistema para capturar el nombre y la talla de cada uno. Las tallas 
disponibles son XS, S, M, L, XL, XXL y XXXL (valide con un ciclo do-while 
la captura de la talla). El sistema debe imprimir el nombre del empleado, 
la talla de su camisa y la cantidad de camisas de cada talla.
 */
package camisas_tallas;

import java.util.Scanner;

/**
 *
 *Josselyne ester chilito galindez  codigo:20201187434
 */
public class Camisas_Tallas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int empleados;
       int xs=0, s=0, m=0, l=0, xl=0, xxl=0, xxxl=0,c=0;
       
        System.out.println(" DIGITE LA CANTIDAD DE EMPLEADOS");
        empleados= leer.nextInt();
        
        String [][] info = new String [empleados][2];//definir matriz
        
        
        do{
            
            System.out.println("NOMBRE DEL EMPLEADO # "+(c+1));
            info[c][0]= leer.next();
            System.out.println("TALLA DEL EMPLEADO");
            info[c][1]=leer.next();
            
            if ("xs".equals(info[c][1])){
            xs++;
            }else {if ("s".equals(info[c][1]) ){
            s++;
            } else {if ("m".equals(info[c][1])  ){
            m++;
            }else {if ("l".equals(info[c][1])  ){
            l++;
            } else {if ("xl".equals(info[c][1])  ){
            xl++;
            } else {if ("xxl".equals(info[c][1])  ){
            xxl++;
            } else {if ("xxxl".equals(info[c][1])  ){
            xxxl++;
            } }}}} }}
            c++;
        }while(c<empleados);
        System.out.println(" REPORTE ");
        
        for(int j=0;j<empleados;j++){
            System.out.println("----------------------------");
            System.out.println(" NOMBRE DEL EMPLEADO "+ info[j][0]);
            System.out.println(" TALLA: "+info[j][1]);
        }
        System.out.println("NUMERO DE TALLAS XS "+xs);
        System.out.println("NUMERO DE TALLAS S "+s);
        System.out.println("NUMERO DE TALLAS M "+m);
        System.out.println("NUMERO DE TALLAS L "+l);
        System.out.println("NUMERO DE TALLAS XL "+xl);
        System.out.println("NUMERO DE TALLAS XXL "+xxl);
        System.out.println("NUMERO DE TALLAS XXXL "+xxxl);
          
    }
    
}
