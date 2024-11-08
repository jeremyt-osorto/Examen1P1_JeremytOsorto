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
    
    public static char[] correcto(char[] desc1, char[] cor, char busc){
        int i,j;
        
        for (i=0; i<desc1.length;i++){
            for(j=0;j<cor.length;j++){
                if (busc==desc1[j]){
                    cor[j]=busc;
                    continue;
                }
            }
        }
        
        return cor;
    }
    
    public static void descifrarCombinacion(){
        Scanner op=new Scanner(System.in);
        Scanner bus=new Scanner(System.in);
        int inte, opc, tam, inte1;
        
        inte1=1;
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
        
        while(inte1<=inte){
            System.out.println("Intento: "+inte1+"/"+inte+"\nIngrese un carecter en minuscula: ");
            char busc=bus.next().charAt(0);
            
            correcto(desc1,cor, busc);
            
            System.out.print("Su progreso: ");
            
            for(int i=0; i<desc1.length;i++){
                System.out.print(cor[i]+" ");
            }
            System.out.println("");
            inte1++;
            
            boolean t;
            t=true;
            
            for (int i=0; i<desc1.length;i++){
                if (desc1[i]==cor[i]){
                    t=true;
                }
                else{
                    t=false;
                }
            }
            
            if (t==true){
                System.out.println("Lo descubriste en "+inte1+" intentos :)");
                break;
            }
        }
        if (inte1==inte+1){
            System.out.println("La bomba exploto :(");
            System.out.println("La cadena era: ");
            for(int i=0; i<desc1.length;i++){
                System.out.print(desc1[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static int[] crearcombinacion(int[] arr, int[] arr1){
        Random ran=new Random();
        int i, rand;
        
        for(i=0; i<arr.length;i++){
            rand=ran.nextInt(1,100);
            arr[i]=rand;
        }
        
        return arr;
    }
    
    public static void rotacionCircular(){
        Scanner lee= new Scanner(System.in);
        Scanner le=new Scanner(System.in);
        int tam;
        
        System.out.println("Ingresa el tamaño del arreglo");
        tam=lee.nextInt();
        
        if (tam>5){
            int[] arr=new int[tam];
            int[] arr1=new int[tam];
            arr=crearcombinacion(arr, arr1);
            
            System.out.print("Arreglo generado: [");
            for (int i=0; i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println(" ]");
            
            System.out.println("Ingrese la cadena de rotación (formato i|d:número): ");
            String nu=le.next();
            
            String c=nu.substring(0);
            String d=nu.substring(2);
            
            int g=Integer.parseInt(d);
            char t=c.charAt(0);
            
            System.out.println(g+""+t);
        }
        else{
            System.out.println("ingrese un valor mayor 5");
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
                    rotacionCircular();
                    break;
                case 3:
                    break;
            }
        }
        while(opc<4);
    }
    
}