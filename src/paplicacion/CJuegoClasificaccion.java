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
public class CJuegoClasificaccion {
    
    public static String Rg[] = new String[50];
    public static String Rnm[] = new String[50];
    public static String Rm[] = new String[50];
    
    public static String Gases[][] = new String [100][100];
    public static String NMETALES[][] = new String [100][100];
    public static String METALES[][] = new String [100][100];
    
    public static int ContadorBuenas = 0;
    public static int ContadorMalas = 0;
    
    public static String Mensaje = "";
    
    public void comparaGases(){
        Gases[0][0] = "ARGON";
        Gases[1][0] = "XENON";
        Gases[2][0] = "NEON";
        Gases[3][0] = "KRIPTON";
        Gases[4][0] = "HELIO";
        Gases[5][0] = "RADON";
        
        if (Gases[0][1].equalsIgnoreCase(Gases[0][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (Gases[1][1].equalsIgnoreCase(Gases[1][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (Gases[2][1].equalsIgnoreCase(Gases[2][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (Gases[3][1].equalsIgnoreCase(Gases[3][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (Gases[4][1].equalsIgnoreCase(Gases[4][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (Gases[5][1].equalsIgnoreCase(Gases[5][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    
    public void comparaNometales(){
        NMETALES[0][0] = "IODO";
        NMETALES[1][0] = "NITROGENO";
        NMETALES[2][0] = "FLUOR";
        NMETALES[3][0] = "CLORO";
        NMETALES[4][0] = "OXIGENO";
        NMETALES[5][0] = "BROMO";
        
        
        if (NMETALES[0][1].equalsIgnoreCase(NMETALES[0][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (NMETALES[1][1].equalsIgnoreCase(NMETALES[1][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (NMETALES[2][1].equalsIgnoreCase(NMETALES[2][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (NMETALES[3][1].equalsIgnoreCase(NMETALES[3][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (NMETALES[4][1].equalsIgnoreCase(NMETALES[4][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (NMETALES[5][1].equalsIgnoreCase(NMETALES[5][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    
    public void comparaMetales(){
        METALES[0][0] = "RADIO";
        METALES[1][0] = "SODIO";
        METALES[2][0] = "TITANIO";
        METALES[3][0] = "ORO";
        METALES[4][0] = "PLATA";
        METALES[5][0] = "PALADIO";
        
        if (METALES[0][1].equalsIgnoreCase(METALES[0][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
        if (METALES[1][1].equalsIgnoreCase(METALES[1][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
         
        if (METALES[2][1].equalsIgnoreCase(METALES[2][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
          
        if (METALES[3][1].equalsIgnoreCase(METALES[3][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
           
        if (METALES[4][1].equalsIgnoreCase(METALES[4][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
            
        if (METALES[5][1].equalsIgnoreCase(METALES[5][0])) {
            ContadorBuenas++;
        }else{ContadorMalas++;}
        
    }
    
    
    public void mensaje(){
        JuegoClasificacion objeto = new JuegoClasificacion();
        if (ContadorBuenas == 18) {
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
