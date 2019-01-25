/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;
import java.util.Scanner;
/**
 *
 * @author salan503
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    private static Scanner leer = new Scanner(System.in);
    private static HojaDeVida hdv = null;
    private static String Intereses = "";
    private static Stack s;
    private static Estudio [] listaestudios;
    private static Estudio estudio1;
    private static Estudio estudio2;
    private static Estudio estudio3;
    private static Estudio estudio4;
    private static Empleos [] experiencia;
    private static Empleos empleos1;
    private static Empleos empleos2;
    private static Empleos empleos3;
    private static Empleos empleos4;
    private static Acercade acercade;
    private static int tam = 4;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Intereses = Intereses();
        
        listaestudios = new Estudio [tam];
        estudio1 = new Estudio("01/01/1991", "02/02/1991", "ITM", "Ing de sistemas", "Medellin");
        estudio2 = new Estudio("03/12/1999", "03/03/2000", "U de A", "Zootecnia", "Medellin");
        estudio3 = new Estudio("03/03/2001", "04/12/2001", "U de envigado", "Tarot", "Medellin");
        estudio4 = new Estudio("03/03/2009", "04/12/20010", "MIT", "Maestria de Sistemas", "Boston");
        listaestudios [0] = estudio1;
        listaestudios [1] = estudio2;
        listaestudios [2] = estudio3;
        listaestudios [3] = estudio4;
        
        experiencia = new Empleos [listaestudios.length];
        empleos1 = new Empleos("01/01/1991", "02/02/1991", "konecta", "asesor comercial de tarjeta de credito", "Medellin", "asesor");
        empleos2 = new Empleos("03/12/1999", "03/03/2000", "Emtelco", "servicio al cliente de exito", "Medellin", "asesor");
        empleos3 = new Empleos("03/03/2001", "04/12/2001", "Fase ll", "Bailarin de medio tiempo", "Medellin", "Bailarin");
        empleos4 = new Empleos("03/03/2009", "04/12/20010", "Nasa", "Astronauta espacial", "Boston", "astronauta");
        experiencia [0] = empleos1;
        experiencia [1] = empleos2;
        experiencia [2] = empleos3;
        experiencia [3] = empleos4;
        
        acercade = new Acercade("Carlo", "Car 43", "Medellin", "soloinformatica.com", "carlitox@gmail.com");
        
        
        hdv = new HojaDeVida(Intereses, listaestudios, experiencia, acercade);
        s.push(hdv);
        
        
                
        
        
        
        
        
        
        
    }
    
    public static String Intereses(){
        String Intereses = "";
        System.out.println("Digite un breve resumen de sus intereses");
        Intereses = leer.next();
        return Intereses;
    }
    
}
