/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paplicacion;

import java.awt.Color;
import static paplicacion.CJuegoClasificaccion.ContadorBuenas;
import static paplicacion.CJuegoClasificaccion.Mensaje;

/**
 *
 * @author lizbe
 */
public class F1 {
    
    public static String t1;
    public static String t2;
    public static String t3;
    public static String t4;
    public static String t5;
    public static String t6;
    public static String t7;
    public static String t8;
    public static String t9;
    public static String t10;
    public static String t11;
    public static String t12;
    public static String t13;
    public static String t14;
    public static String t15;
    public static String t16;
    
    public static int cuenta1=3; 
    public static int aciertos=0;
    public static int aciertos2=0;
    public static int aciertos3=0;
    public static int aciertos4=0;
    public static int aciertos5=0;
    public static int aciertos6=0;
    public static int aciertos7=0;
    public static int aciertos8=0;
    public static int aciertos9=0;
    public static int aciertos10=0;
    public static int aciertos11=0;
    public static int aciertos12=0;
    public static int aciertos13=0;
    public static int aciertos14=0;
    public static int aciertos15=0;
    public static int aciertos16=0;
    public static int total;
    public static int total2;
    public static String ojo;
    public static String loco;
    
    public static String Mensaje;
    
    public static String respuestas[]={"d/t","v/t","d/v","m*g","vf-vi/t","vi+a*t","m*a","a*v","f*d","m*c^2","m*g*h","1/2m*v^2","w/t","m*v","f/a","m/vol"};
    
    
    
    public String setResp1 (){
        
        
        if(this.t1.equalsIgnoreCase(respuestas[0]) && !this.t1.equalsIgnoreCase(this.t2) && !this.t1.equalsIgnoreCase(this.t3) && !this.t1.equalsIgnoreCase(this.t4) && !this.t1.equalsIgnoreCase(this.t5) && !this.t1.equalsIgnoreCase(this.t6) && !this.t1.equalsIgnoreCase(this.t7) && !this.t1.equalsIgnoreCase(this.t8) && !this.t1.equalsIgnoreCase(this.t9) && !this.t1.equalsIgnoreCase(this.t10) && !this.t1.equalsIgnoreCase(this.t11) && !this.t1.equalsIgnoreCase(this.t12) && !this.t1.equalsIgnoreCase(this.t13) && !this.t1.equalsIgnoreCase(this.t14) && !this.t1.equalsIgnoreCase(this.t15) && !this.t1.equalsIgnoreCase(this.t16)){
            this.aciertos=1;
            this.ojo="c";
           
        } else{
     
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp1(){
        setResp1();
    }
    
    
    public String setResp2 (){
        if(this.t2.equalsIgnoreCase(respuestas[1]) && !this.t2.equalsIgnoreCase(this.t1) && !this.t2.equalsIgnoreCase(this.t3) && !this.t2.equalsIgnoreCase(this.t4) && !this.t2.equalsIgnoreCase(this.t5) && !this.t2.equalsIgnoreCase(this.t6) && !this.t2.equalsIgnoreCase(this.t7) && !this.t2.equalsIgnoreCase(this.t8) && !this.t2.equalsIgnoreCase(this.t9) && !this.t2.equalsIgnoreCase(this.t10) && !this.t2.equalsIgnoreCase(this.t11) && !this.t2.equalsIgnoreCase(this.t12) && !this.t2.equalsIgnoreCase(this.t13) && !this.t2.equalsIgnoreCase(this.t14) && !this.t2.equalsIgnoreCase(this.t15) && !this.t2.equalsIgnoreCase(this.t16)){
            this.aciertos2=1;
            this.ojo="c";
        } else{
         
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp2(){
        setResp2();
    }
    
    
    public String setResp3 (){
        if(this.t3.equalsIgnoreCase(respuestas[2]) && !this.t3.equalsIgnoreCase(this.t1) && !this.t3.equalsIgnoreCase(this.t2) && !this.t3.equalsIgnoreCase(this.t4) && !this.t3.equalsIgnoreCase(this.t5) && !this.t3.equalsIgnoreCase(this.t6) && !this.t3.equalsIgnoreCase(this.t7) && !this.t3.equalsIgnoreCase(this.t8) && !this.t3.equalsIgnoreCase(this.t9) && !this.t3.equalsIgnoreCase(this.t10) && !this.t3.equalsIgnoreCase(this.t11) && !this.t3.equalsIgnoreCase(this.t12) && !this.t3.equalsIgnoreCase(this.t13) && !this.t3.equalsIgnoreCase(this.t14) && !this.t3.equalsIgnoreCase(this.t15) && !this.t3.equalsIgnoreCase(this.t16)){
            this.aciertos3=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp3(){
        setResp3();
    }
    
    
    public String setResp4 (){
        if(this.t4.equalsIgnoreCase(respuestas[3]) && !this.t4.equalsIgnoreCase(this.t1) && !this.t4.equalsIgnoreCase(this.t2) && !this.t4.equalsIgnoreCase(this.t3) && !this.t4.equalsIgnoreCase(this.t5) && !this.t4.equalsIgnoreCase(this.t6) && !this.t4.equalsIgnoreCase(this.t7) && !this.t4.equalsIgnoreCase(this.t8) && !this.t4.equalsIgnoreCase(this.t9) && !this.t4.equalsIgnoreCase(this.t10) && !this.t4.equalsIgnoreCase(this.t11) && !this.t4.equalsIgnoreCase(this.t12) && !this.t4.equalsIgnoreCase(this.t13) && !this.t4.equalsIgnoreCase(this.t14) && !this.t4.equalsIgnoreCase(this.t15) && !this.t4.equalsIgnoreCase(this.t16)){
            this.aciertos4=1;
            this.ojo="c";
        } else{
           
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp4(){
        setResp4();
    }
    
    
    public String setResp5 (){
        if(this.t5.equalsIgnoreCase(respuestas[4]) && !this.t5.equalsIgnoreCase(this.t1) && !this.t5.equalsIgnoreCase(this.t2) && !this.t5.equalsIgnoreCase(this.t3) && !this.t5.equalsIgnoreCase(this.t4) && !this.t5.equalsIgnoreCase(this.t6) && !this.t5.equalsIgnoreCase(this.t7) && !this.t5.equalsIgnoreCase(this.t8) && !this.t5.equalsIgnoreCase(this.t9) && !this.t5.equalsIgnoreCase(this.t10) && !this.t5.equalsIgnoreCase(this.t11) && !this.t5.equalsIgnoreCase(this.t12) && !this.t5.equalsIgnoreCase(this.t13) && !this.t5.equalsIgnoreCase(this.t14) && !this.t5.equalsIgnoreCase(this.t15) && !this.t5.equalsIgnoreCase(this.t16)){
            this.aciertos5=1;
            this.ojo="c";
        } else{
           
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp5(){
        setResp5();
    }
    
    
    
    public String setResp6 (){
        if(this.t6.equalsIgnoreCase(respuestas[5]) && !this.t6.equalsIgnoreCase(this.t1) && !this.t6.equalsIgnoreCase(this.t2) && !this.t6.equalsIgnoreCase(this.t3) && !this.t6.equalsIgnoreCase(this.t4) && !this.t6.equalsIgnoreCase(this.t5) && !this.t6.equalsIgnoreCase(this.t7) && !this.t6.equalsIgnoreCase(this.t8) && !this.t6.equalsIgnoreCase(this.t9) && !this.t6.equalsIgnoreCase(this.t10) && !this.t6.equalsIgnoreCase(this.t11) && !this.t6.equalsIgnoreCase(this.t12) && !this.t6.equalsIgnoreCase(this.t13) && !this.t6.equalsIgnoreCase(this.t14) && !this.t6.equalsIgnoreCase(this.t15) && !this.t6.equalsIgnoreCase(this.t16)){
            this.aciertos6=1;
            this.ojo="c";
        } else{
           
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp6(){
        setResp6();
    }
    
    
    
    public String setResp7 (){
        if(this.t7.equalsIgnoreCase(respuestas[6]) && !this.t7.equalsIgnoreCase(this.t1) && !this.t7.equalsIgnoreCase(this.t2) && !this.t7.equalsIgnoreCase(this.t3) && !this.t7.equalsIgnoreCase(this.t4) && !this.t7.equalsIgnoreCase(this.t5) && !this.t7.equalsIgnoreCase(this.t6) && !this.t7.equalsIgnoreCase(this.t8) && !this.t7.equalsIgnoreCase(this.t9) && !this.t7.equalsIgnoreCase(this.t10) && !this.t7.equalsIgnoreCase(this.t11) && !this.t7.equalsIgnoreCase(this.t12) && !this.t7.equalsIgnoreCase(this.t13) && !this.t7.equalsIgnoreCase(this.t14) && !this.t7.equalsIgnoreCase(this.t15) && !this.t7.equalsIgnoreCase(this.t16)){
            this.aciertos7=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp7(){
        setResp7();
    }
    
    
    
    public String setResp8 (){
        if(this.t8.equalsIgnoreCase(respuestas[7]) && !this.t8.equalsIgnoreCase(this.t1) && !this.t8.equalsIgnoreCase(this.t2) && !this.t8.equalsIgnoreCase(this.t3) && !this.t8.equalsIgnoreCase(this.t4) && !this.t8.equalsIgnoreCase(this.t5) && !this.t8.equalsIgnoreCase(this.t6) && !this.t8.equalsIgnoreCase(this.t7) && !this.t8.equalsIgnoreCase(this.t9) && !this.t8.equalsIgnoreCase(this.t10) && !this.t8.equalsIgnoreCase(this.t11) && !this.t8.equalsIgnoreCase(this.t12) && !this.t8.equalsIgnoreCase(this.t13) && !this.t8.equalsIgnoreCase(this.t14) && !this.t8.equalsIgnoreCase(this.t15) && !this.t8.equalsIgnoreCase(this.t16)){
            this.aciertos8=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp8(){
        setResp8();
    }
    
    
    
    public String setResp9 (){
        if(this.t9.equalsIgnoreCase(respuestas[8]) && !this.t9.equalsIgnoreCase(this.t1) && !this.t9.equalsIgnoreCase(this.t2) && !this.t9.equalsIgnoreCase(this.t3) && !this.t9.equalsIgnoreCase(this.t4) && !this.t9.equalsIgnoreCase(this.t5) && !this.t9.equalsIgnoreCase(this.t6) && !this.t9.equalsIgnoreCase(this.t7) && !this.t9.equalsIgnoreCase(this.t8) && !this.t9.equalsIgnoreCase(this.t10) && !this.t9.equalsIgnoreCase(this.t11) && !this.t9.equalsIgnoreCase(this.t12) && !this.t9.equalsIgnoreCase(this.t13) && !this.t9.equalsIgnoreCase(this.t14) && !this.t9.equalsIgnoreCase(this.t15) && !this.t9.equalsIgnoreCase(this.t16)){
            this.aciertos9=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp9(){
        setResp9();
    }
    
    
    
    public String setResp10 (){
        if(this.t10.equalsIgnoreCase(respuestas[9]) && !this.t10.equalsIgnoreCase(this.t1) && !this.t10.equalsIgnoreCase(this.t2) && !this.t10.equalsIgnoreCase(this.t3) && !this.t10.equalsIgnoreCase(this.t4) && !this.t10.equalsIgnoreCase(this.t5) && !this.t10.equalsIgnoreCase(this.t6) && !this.t10.equalsIgnoreCase(this.t7) && !this.t10.equalsIgnoreCase(this.t8) && !this.t10.equalsIgnoreCase(this.t9) && !this.t10.equalsIgnoreCase(this.t11) && !this.t10.equalsIgnoreCase(this.t12) && !this.t10.equalsIgnoreCase(this.t13) && !this.t10.equalsIgnoreCase(this.t14) && !this.t10.equalsIgnoreCase(this.t15) && !this.t10.equalsIgnoreCase(this.t16)){
            this.aciertos10=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp10(){
        setResp10();
    }
    
    
    
    public String setResp11 (){
        if(this.t11.equalsIgnoreCase(respuestas[10]) && !this.t11.equalsIgnoreCase(this.t1) && !this.t11.equalsIgnoreCase(this.t2) && !this.t11.equalsIgnoreCase(this.t3) && !this.t11.equalsIgnoreCase(this.t4) && !this.t11.equalsIgnoreCase(this.t5) && !this.t11.equalsIgnoreCase(this.t6) && !this.t11.equalsIgnoreCase(this.t7) && !this.t11.equalsIgnoreCase(this.t8) && !this.t11.equalsIgnoreCase(this.t9) && !this.t11.equalsIgnoreCase(this.t10) && !this.t11.equalsIgnoreCase(this.t12) && !this.t11.equalsIgnoreCase(this.t13) && !this.t11.equalsIgnoreCase(this.t14) && !this.t11.equalsIgnoreCase(this.t15) && !this.t11.equalsIgnoreCase(this.t16)){
            this.aciertos11=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp11(){
        setResp11();
    }
    
    
    
    public String setResp12 (){
        if(this.t12.equalsIgnoreCase(respuestas[11]) && !this.t12.equalsIgnoreCase(this.t1) && !this.t12.equalsIgnoreCase(this.t2) && !this.t12.equalsIgnoreCase(this.t3) && !this.t12.equalsIgnoreCase(this.t4) && !this.t12.equalsIgnoreCase(this.t5) && !this.t12.equalsIgnoreCase(this.t6) && !this.t12.equalsIgnoreCase(this.t7) && !this.t12.equalsIgnoreCase(this.t8) && !this.t12.equalsIgnoreCase(this.t9) && !this.t12.equalsIgnoreCase(this.t10) && !this.t12.equalsIgnoreCase(this.t11) && !this.t12.equalsIgnoreCase(this.t13) && !this.t12.equalsIgnoreCase(this.t14) && !this.t12.equalsIgnoreCase(this.t15) && !this.t12.equalsIgnoreCase(this.t16)){
           this.aciertos12=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp12(){
        setResp12();
    }
    
    
    
    public String setResp13 (){
        if(this.t13.equalsIgnoreCase(respuestas[12]) && !this.t13.equalsIgnoreCase(this.t1) && !this.t13.equalsIgnoreCase(this.t2) && !this.t13.equalsIgnoreCase(this.t3) && !this.t13.equalsIgnoreCase(this.t4) && !this.t13.equalsIgnoreCase(this.t5) && !this.t13.equalsIgnoreCase(this.t6) && !this.t13.equalsIgnoreCase(this.t7) && !this.t13.equalsIgnoreCase(this.t8) && !this.t13.equalsIgnoreCase(this.t9) && !this.t13.equalsIgnoreCase(this.t10) && !this.t13.equalsIgnoreCase(this.t11) && !this.t13.equalsIgnoreCase(this.t12) && !this.t13.equalsIgnoreCase(this.t14) && !this.t13.equalsIgnoreCase(this.t15) && !this.t13.equalsIgnoreCase(this.t16)){
           this.aciertos13=1;
            this.ojo="c";
        } else{
           
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp13(){
        setResp13();
    }
    
    
    
    public String setResp14 (){
        if(this.t14.equalsIgnoreCase(respuestas[13]) && !this.t14.equalsIgnoreCase(this.t1) && !this.t14.equalsIgnoreCase(this.t2) && !this.t14.equalsIgnoreCase(this.t3) && !this.t14.equalsIgnoreCase(this.t4) && !this.t14.equalsIgnoreCase(this.t5) && !this.t14.equalsIgnoreCase(this.t6) && !this.t14.equalsIgnoreCase(this.t7) && !this.t14.equalsIgnoreCase(this.t8) && !this.t14.equalsIgnoreCase(this.t9) && !this.t14.equalsIgnoreCase(this.t10) && !this.t14.equalsIgnoreCase(this.t11) && !this.t14.equalsIgnoreCase(this.t12) && !this.t14.equalsIgnoreCase(this.t13) && !this.t14.equalsIgnoreCase(this.t15) && !this.t14.equalsIgnoreCase(this.t16)){
            this.aciertos14=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp14(){
        setResp14();
    }
    
    
    
    public String setResp15 (){
        if(this.t15.equalsIgnoreCase(respuestas[14]) && !this.t15.equalsIgnoreCase(this.t1) && !this.t15.equalsIgnoreCase(this.t2) && !this.t15.equalsIgnoreCase(this.t3) && !this.t15.equalsIgnoreCase(this.t4) && !this.t15.equalsIgnoreCase(this.t5) && !this.t15.equalsIgnoreCase(this.t6) && !this.t15.equalsIgnoreCase(this.t7) && !this.t15.equalsIgnoreCase(this.t8) && !this.t15.equalsIgnoreCase(this.t9) && !this.t15.equalsIgnoreCase(this.t10) && !this.t15.equalsIgnoreCase(this.t11) && !this.t15.equalsIgnoreCase(this.t12) && !this.t15.equalsIgnoreCase(this.t13) && !this.t15.equalsIgnoreCase(this.t14) && !this.t15.equalsIgnoreCase(this.t16)){
            this.aciertos15=1;
            this.ojo="c";
        } else{
            
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp15(){
        setResp15();
    }
    
    
    public String setResp16 (){
        if(this.t16.equalsIgnoreCase(respuestas[15]) && !this.t16.equalsIgnoreCase(this.t1) && !this.t16.equalsIgnoreCase(this.t2) && !this.t16.equalsIgnoreCase(this.t3) && !this.t16.equalsIgnoreCase(this.t4) && !this.t16.equalsIgnoreCase(this.t5) && !this.t16.equalsIgnoreCase(this.t6) && !this.t16.equalsIgnoreCase(this.t7) && !this.t16.equalsIgnoreCase(this.t8) && !this.t16.equalsIgnoreCase(this.t9) && !this.t16.equalsIgnoreCase(this.t10) && !this.t16.equalsIgnoreCase(this.t11) && !this.t16.equalsIgnoreCase(this.t12) && !this.t16.equalsIgnoreCase(this.t13) && !this.t16.equalsIgnoreCase(this.t14) && !this.t16.equalsIgnoreCase(this.t15)){
            this.aciertos16=1;
            this.ojo="c";
        } else{
           
            this.ojo="i";
        }
        return this.ojo;
    }
    
    public void getResp16(){
        setResp16();
    }
    
    
    public String setIntentos (){
        
        if(this.cuenta1<=0){
            this.loco="c";
        } else{
            this.loco="i";
        }
        
        return this.loco;
        
    }
    
    public void getIntentos(){
        setIntentos();
    }
    
    
    public int setTotal(){
        getResp1();
        getResp2();
        getResp3();
        getResp4();
        getResp5();
        getResp6();
        getResp7();
        getResp8();
        getResp9();
        getResp10();
        getResp11();
        getResp12();
        getResp13();
        getResp14();
        getResp15();
        getResp16();
        
        this.total= aciertos+aciertos2+aciertos3+aciertos4+aciertos5+aciertos6+aciertos7+aciertos8+aciertos9+aciertos10+aciertos11+aciertos12+aciertos13+aciertos14+aciertos15+aciertos16;
        
        return this.total;
        
    }
    
    public void getTotal (){
        setTotal();
    }
    
    
    public int setTotal2(){
        getResp1();
        getResp2();
        getResp3();
        getResp4();
        getResp5();
        getResp6();
        getResp7();
        getResp8();
        getResp9();
        getResp10();
        getResp11();
        getResp12();
        getResp13();
        getResp14();
        getResp15();
        getResp16();
        
        
        total2=16-this.total;
        return this.total2;
    }
    
    public void getTotal2 (){
        setTotal2();
    }
    
    
    
    
    public void mensaje(){
        Fisica1 objeto = new Fisica1();
        if (total == 18) {
            Mensaje = "No dominas el mundo porque no quieres";
        }
        
        if (total >= 15 && total< 18) {
            Mensaje = "El FBI ya te debe estar buscando";
        }
        
        if (total < 15 && total > 9) {
            Mensaje = "Pos eres promedio, ni fu ni fa";
        }
        
        if (objeto.minutos >= 02 && total <= 9) {
            Mensaje = "Tanto tiempo para esos aciertos? \n Si sabias que el juego era de quimica no? \n Pos ten tu resultado orale!";
        }
        
        if (total <= 9 && objeto.minutos <=02) {
            Mensaje = "Eres una verguenza para tu familia";
        }
    }
    
    
    
    
}
