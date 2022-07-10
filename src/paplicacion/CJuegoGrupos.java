/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paplicacion;

/**
 *
 * @author numbe
 */
public class CJuegoGrupos {
    
    public static String RC1[] = new String[50];
    public static String RC2[] = new String[50];
    public static String RC3[] = new String[50];
    
    public static String RC4[] = new String[50];
    public static String RC5[] = new String[50];
    public static String RC6[] = new String[50];
    
    public static String C1[] = {"C","SN","PB","GE"};
    public static String C2[] = {"BE","SR","MG","CA"};
    public static String C3[] = {"O","PO","SE","TE"};
    
    public static String C4[] = {"ZN","HG","CD"};
    public static String C5[] = {"V","TA","NB"};
    public static String C6[] = {"SC","Y","LA"};
    
    public static int ContadorBuenas = 0;
    public static int ContadorMalas = 0;
    
    public static String Mensaje = "";
    
    public void comparaC1(){
        
        if (RC1[0].equalsIgnoreCase(C1[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC1[1].equalsIgnoreCase(C1[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC1[2].equalsIgnoreCase(C1[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC1[3].equalsIgnoreCase(C1[3])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        
    }
    
    
    public void comparaC2(){
        
        if (RC2[0].equalsIgnoreCase(C2[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC2[1].equalsIgnoreCase(C2[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC2[2].equalsIgnoreCase(C2[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC2[3].equalsIgnoreCase(C2[3])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    public void comparaC3(){
        
        if (RC3[0].equalsIgnoreCase(C3[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC3[1].equalsIgnoreCase(C3[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC3[2].equalsIgnoreCase(C3[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC3[3].equalsIgnoreCase(C3[3])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
   
    public void comparaC4(){
        
        if (RC4[0].equalsIgnoreCase(C4[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC4[1].equalsIgnoreCase(C4[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC4[2].equalsIgnoreCase(C4[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    public void comparaC5(){
        
        if (RC5[0].equalsIgnoreCase(C5[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC5[1].equalsIgnoreCase(C5[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC5[2].equalsIgnoreCase(C5[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    public void comparaC6(){
        
        if (RC6[0].equalsIgnoreCase(C6[0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC6[1].equalsIgnoreCase(C6[1])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (RC6[2].equalsIgnoreCase(C6[2])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    
    
    public void mensaje(){
        JuegoGrupos objeto = new JuegoGrupos();
        if (ContadorBuenas > 18) {
            Mensaje = "No dominas el mundo porque no quieres";
        }
        
        if (ContadorBuenas >= 15 && ContadorBuenas < 18) {
            Mensaje = "El FBI ya te debe estar buscando";
        }
        
        if (ContadorBuenas < 15 && ContadorBuenas > 9) {
            Mensaje = "Pos eres promedio, ni fu ni fa";
        }
        
        if (objeto.minutos >= 02 && ContadorBuenas <= 9) {
            Mensaje = "Tanto tiempo para esos aciertos? \n Si sabias que el juego era de quimica no? \n Pos ten tu resultado orale!";
        }
        
        if (ContadorBuenas <= 9 && objeto.minutos < 2) {
            Mensaje = "Eres una verguenza para tu familia";
        }
        
        
        
    }
    
    
}
