/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paplicacion;
import java.applet.AudioClip;
/**
 *
 * @author numbe
 */
public class Sounds {
    public static AudioClip SoundM;
    public static AudioClip SoundF;
    public static AudioClip SoundQ1;
    public static AudioClip SoundQ2;
    
    public void sonidoMenu(){
        //Sound = java.applet.Applet.newAudioClip(getClass().getResource("/paplicacion/PIANO.wav"));
        
            SoundM = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/PIANO2.wav"));
            SoundM.loop();
        
    }
    
    public void sonidoFisica(){
        //Sound = java.applet.Applet.newAudioClip(getClass().getResource("/paplicacion/PIANO.wav"));
        
        SoundF = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/CF.wav"));
        SoundF.loop();
        
    }
    
    public void sonidoQuimica1(){
        //Sound = java.applet.Applet.newAudioClip(getClass().getResource("/paplicacion/PIANO.wav"));
        
            SoundQ1 = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/SHAPE.wav"));
            SoundQ1.loop();  
        
    }
    
    public void sonidoQuimica2(){
        //Sound = java.applet.Applet.newAudioClip(getClass().getResource("/paplicacion/PIANO.wav"));
       
            SoundQ2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sounds/VIOLIN.wav"));
            SoundQ2.loop();  

    }
    
    
    
    
    
}
