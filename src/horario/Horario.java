/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;
import java.util.Scanner;
/**
 *
 * @author End User
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora;
        String text = null;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora desea conocer?(Favor de escribarla en el sistema horario de 24 horas) ");
        hora = sc.nextInt();
        
        if (hora <= 24){
            switch (hora) {
            case 0:
                text="jugar Valorant con tus amigos";
                break;
            case 1:
                text="jugar LOL con tus amigos";
                break;
            case 2:
                text="ver Tik Toks en lo que te duermes";
                break;
            case 3:
                text="dormir";
                break;
            case 4:
                text="dormir";
                break;
            case 5:
                text="dormir";
                break;
            case 6:
                text="dormir";
                break;
            case 7:
                text="dormir";
                break;
            case 8:
                text="dormir";
                break;
            case 9:
                text="tomar clase de Física";
                break;
            case 10:
                text="tomar clase de Álgebra Lineal";
                break;
            case 11:
                text="tomar clase de Cálculo Integral";
                break;
            case 12:
                text="tomar clase de organización computacional";
                break;
            case 13:
                text="hacer la comida";
                break;
            case 14:
                text="comer con mi hermana";
                break;
            case 15:
                text="ver mi serie The Good Doctor en Prime Video";
                break;
            case 16:
                text="recibir a tú máma después de su jornada laboral";
                break;
            case 17:
                text="salir con tú máma a ver las cosas de la casa";
                break;
            case 18:
                text="comer un snack";
                break;
            case 19:
                text="hacer ejercicio";
                break;
            case 20:
                text="tomar un baño";
                break;    
            case 21:
                text="hacer tarea";
                break;
            case 22:
                text="hacer tarea";
                break;
            case 23:
                text="cenar";
                break;
            case 24:
                text="platicar con tú máma";
                break;
            default:
               
                break;
        }
            System.out.println("Para las " + hora + " horas tienes agendado " + text);
        }else {
            System.out.println("Favor de escribir un número que este dentro de la lista");
        }
    }
    
}
