/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paplicacion;

import static com.oracle.jrockit.jfr.Transition.To;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;


/**
 *
 * @author numbe
 */
public class CJCcorreoelectronico {
    
/**
 *
 * @author numbe
 */
    

   public static String usuarioCorreo;
    public static String nombreArchivo;
    public static String contracena;
    public static String rutaArchivo;
    public static String destino;
    public static String Asunto;
    public static String Mensaje;
    
    public CJCcorreoelectronico(){
        
    }
    
    public CJCcorreoelectronico(String usuarioCorreo, String nombreArchivo, String contracena, String rutaArchivo, String destino, String asunto, String mensaje){
        
        
        this.usuarioCorreo = usuarioCorreo;
        this.nombreArchivo = nombreArchivo;
        this.contracena = contracena;
        this.rutaArchivo = rutaArchivo;
        this.destino = destino;
        this.Asunto = asunto;
        this.Mensaje = mensaje;
        
    }

    public static String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public static void setUsuarioCorreo(String usuarioCorreo) {
       CJCcorreoelectronico.usuarioCorreo = usuarioCorreo;
    }

    public static String getNombreArchivo() {
        return nombreArchivo;
    }

    public static void setNombreArchivo(String nombreArchivo) {
        CJCcorreoelectronico.nombreArchivo = nombreArchivo;
    }

    public static String getContracena() {
        return contracena;
    }

    public static void setContracena(String contracena) {
        CJCcorreoelectronico.contracena = contracena;
    }

    public static String getRutaArchivo() {
        return rutaArchivo;
    }

    public static void setRutaArchivo(String rutaArchivo) {
        CJCcorreoelectronico.rutaArchivo = rutaArchivo;
    }

    public static String getDestino() {
        return destino;
    }

    public static void setDestino(String destino) {
        CJCcorreoelectronico.destino = destino;
    }

    public static String getAsunto() {
        return Asunto;
    }

    public static void setAsunto(String Asunto) {
        CJCcorreoelectronico.Asunto = Asunto;
    }

    public static String getMensaje() {
        return Mensaje;
    }

    public static void setMensaje(String Mensaje) {
        CJCcorreoelectronico.Mensaje = Mensaje;
    }
    
    public String getAdjunto(){
        return Asunto;
    }
    
    public void setAdjunto(String adjunto){
        this.Asunto = adjunto;
    }
    

}
