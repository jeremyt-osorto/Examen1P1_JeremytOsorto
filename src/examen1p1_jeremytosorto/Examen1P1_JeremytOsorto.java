/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_jeremytosorto;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class Examen1P1_JeremytOsorto {

    /**
     * @param args the command line arguments
     */
    public static char[] crearCombinacion(char []desc, char[] cor){
        Random ran=new Random();
        int i, rand;
        
        for(i=0; i<desc.length;i++){
            rand=ran.nextInt(97,122);
            char conv=(char)rand;
            desc[i]=conv;
        }
        
        for(i=0; i<cor.length;i++){
            cor[i]='-';
        }
        
        return desc;
    }
    
    public static void descifrarCombinacion(){
        Scanner op=new Scanner(System.in);
        int inte, opc, tam, inte1;
        
        inte1=0;
        inte=0;
        tam=0;
        
        System.out.println("1. Fácil\n2. Medio\n3. Díficil");
        opc=op.nextInt();
        
        switch (opc){
            case 1:
                tam=6;
                inte=22;
                break;
            case 2:
                tam=8;
                inte=20;
                break;
            case 3:
                tam=10;
                inte=18;
                break;
        }
        char[] desc=new char[tam];
        char[] cor=new char[tam];
        char[] desc1=crearCombinacion(desc, cor);
        
        for(int i=0; i<desc1.length;i++){
            System.out.print(cor[i]+" ");
        }
        
        while(inte1<=inte){
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int opc;
        
        do{
            System.out.println("Menu: ");
            System.out.println("1) Descifrar la combinación\n2) Rotación circular del arreglo\n3)Bono: Suma de Binarios\n4) Salir");
            opc=scan.nextInt();
            
            switch(opc){
                case 1:
                    descifrarCombinacion();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
        while(opc<4);
    }
    
}
