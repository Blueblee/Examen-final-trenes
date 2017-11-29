/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_al02734384;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Examen1_Al02734384 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definir variabes
        int tipoEmpleado, tipoAux, tipo2, answ;
        double horasExtra, kmRecorridos, sueldoTotal;
       
        Scanner teclado = new Scanner (System.in);
        //Tipos de empleado
        //Menú
        System.out.println("Ingrese Km recorridos:");
        kmRecorridos = teclado.nextInt();
        System.out.println("Ingrese Horas Extra");
        horasExtra = teclado.nextInt();
        System.out.println("Seleccione tipo de empleado" +"\n"+"1.Auxiliar" + "\n"+ "2.Maquinista" + "\n" + "3.Cargador");
        tipoEmpleado = teclado.nextInt();
         switch (tipoEmpleado) {
            case 1:
                System.out.println("1.Suplente"+ "\n" + "2.Auxiliar interno");
                tipoAux = teclado.nextInt();
                switch (tipoAux){
                    case 1 :
                        System.out.println("1.Maquinista" + "\n"+ "2.Cargador");
                        tipo2 = teclado.nextInt();
                        switch (tipo2){
                            case 1:
                                System.out.println("Salario: " + (sueldoTotal =sueldoBase() + bonoKm (kmRecorridos)+ horasExtraMaq (horasExtra)) );
                                    break;
                            case 2:
                                System.out.println("Salario: " + (sueldoTotal = sueldoBase() + bonoKm (kmRecorridos)+ horasExtraCar (horasExtra)) );
                                break;
                            default:
                        System.out.println("Opción no valida");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("¿Es subcontratado? 1/0");
                        answ = teclado.nextInt();
                         if ( answ == 0 ){
                           System.out.println("Salario: " + (sueldoTotal = sueldoBase() + bonoKm (kmRecorridos)) );
                           System.out.println("Vales de despensa: " + (sueldoTotal * 0.04));
                         } else {
                        System.out.println("Salario: " + sueldoBase() + bonoKm (kmRecorridos) );
                         }
                        break;
                    default:
                    System.out.println("Opción no valida");
                    break;
                }
                break;
            case 2:
                System.out.println("¿Es subcontratado? 1/0");
                        answ = teclado.nextInt();
                         if ( answ == 0 ){
                           System.out.println("Salario: " + (sueldoTotal = sueldoBase() + bonoKm (kmRecorridos)+ horasExtraMaq (horasExtra)) );
                           System.out.println("Vales de despensa: " + (sueldoTotal * 0.04));
                         } else {                          
               System.out.println("Salario: " + (sueldoTotal =sueldoBase() + bonoKm (kmRecorridos)+ horasExtraMaq (horasExtra)) );
                         }
                break;
            case 3:
                System.out.println("¿Es subcontratado? 1/0");
                        answ = teclado.nextInt();
                         if ( answ == 0 ){
                           System.out.println("Salario: " + (sueldoTotal = sueldoBase() + bonoKm (kmRecorridos)+ horasExtraCar (horasExtra)) );
                           System.out.println("Vales de despensa: " + (sueldoTotal * 0.04));
                         } else {
               System.out.println("Salario: " + (sueldoTotal = sueldoBase() + bonoKm (kmRecorridos)+ horasExtraCar (horasExtra)) );
                         }
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    
    }
  //metodos
    public static double bonoKm (double kmRecorridos){
       return 1* kmRecorridos;
    }
    public static double horasExtraMaq (double horasExtra){
        return horasExtra * 15;
    }
    public static double horasExtraCar (double horasExtra){
        return horasExtra * 10;
    }
    public static double sueldoBase (){
        return 50 * 8;
    }
    
}
