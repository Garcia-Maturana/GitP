/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paplicacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author lizbe
 */
public class Fisica1 extends javax.swing.JFrame {

    /**
     * Creates new form Fisica1
     */
        public Timer tiempo;
        public int centesimas_segundos = 0;
        public int segundos = 0;
        public int minutos = 0;
        public int horas = 0;
        
        CJCcorreoelectronico c = new CJCcorreoelectronico();
        CRegistro d = new CRegistro();
        F1 objeto = new F1();
        
        
        
        private ActionListener acciones = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
       
            centesimas_segundos ++;
            if (centesimas_segundos == 100) {
                segundos ++;
                centesimas_segundos =0;
            }
            if (segundos == 60) {
                minutos ++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas ++;
                minutos =0;
            }
            if (horas==24) {
                horas =0;
            }
            
            actualizarEtiquetaTiempo();
        }
    };
    
    private void actualizarEtiquetaTiempo(){
    String texto = (horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos+":"+(centesimas_segundos <=9?"0":"")+centesimas_segundos;
    ctiempo.setText(texto);
    }
        
        
    public Fisica1() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializar();
        tiempo = new Timer(10, acciones);
    }
    
    ImageIcon icono = new ImageIcon("src/Imagenes/A6.png");
    private void inicializar() {
   ImageIcon icono = new ImageIcon("src/Imagenes/A5.png");
    this.setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        r11 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        r16 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r15 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        r6 = new javax.swing.JTextField();
        r14 = new javax.swing.JTextField();
        r13 = new javax.swing.JTextField();
        r5 = new javax.swing.JTextField();
        r12 = new javax.swing.JTextField();
        r4 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        r2 = new javax.swing.JTextField();
        r1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        r8 = new javax.swing.JTextField();
        e = new javax.swing.JLabel();
        r7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        intentos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Bp = new javax.swing.JButton();
        labeliniciar = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ctiempo = new javax.swing.JLabel();
        Bi = new javax.swing.JButton();
        Bd = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Bd1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Bi2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        revisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 60, 30));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ENERGÍA CIINÉTICA:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("POTENCIA:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mecanica Clasica");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ÍMPETU:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VELOCIDAD:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, -1));

        jLabel16.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ESFUERZO:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DISTANCIA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));

        jLabel17.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DENSIDAD:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIEMPO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, -1));

        r10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r10.setEnabled(false);
        jPanel1.add(r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 120, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PESO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, -1));

        r11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r11.setEnabled(false);
        jPanel1.add(r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 120, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ACELERACIÓN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));

        r9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r9.setEnabled(false);
        jPanel1.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 120, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VELOCIDAD FINAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        r16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r16.setEnabled(false);
        jPanel1.add(r16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 120, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FUERZA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, -1));

        r15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r15.setEnabled(false);
        jPanel1.add(r15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 120, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GASTO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 190, -1));

        r6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r6.setEnabled(false);
        jPanel1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, -1));

        r14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r14.setEnabled(false);
        jPanel1.add(r14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 120, -1));

        r13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r13.setEnabled(false);
        jPanel1.add(r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 120, -1));

        r5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r5.setEnabled(false);
        jPanel1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 120, -1));

        r12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r12.setEnabled(false);
        jPanel1.add(r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, -1));

        r4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r4.setEnabled(false);
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 120, -1));

        r3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r3.setEnabled(false);
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, -1));

        jLabel18.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("revisar");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, -1, -1));

        r2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r2.setEnabled(false);
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, -1));

        r1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r1.setEnabled(false);
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));

        jLabel20.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ERRORES:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        r8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r8.setEnabled(false);
        jPanel1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 120, -1));

        e.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 60, 30));

        r7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        r7.setEnabled(false);
        jPanel1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 120, -1));

        jLabel19.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("INTENTOS:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Home");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        intentos.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        intentos.setForeground(new java.awt.Color(255, 255, 255));
        intentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intentos.setText("3");
        jPanel1.add(intentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 30, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ENERGÍA EN REPOSO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ENERGÍA POTENCIAL:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel22.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("pausar");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 70, 20));

        Bp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bp.setBorder(null);
        Bp.setBorderPainted(false);
        Bp.setContentAreaFilled(false);
        Bp.setEnabled(false);
        Bp.setFocusPainted(false);
        Bp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpActionPerformed(evt);
            }
        });
        jPanel1.add(Bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 160, 60));

        labeliniciar.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        labeliniciar.setForeground(new java.awt.Color(0, 0, 0));
        labeliniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeliniciar.setText("iniciar");
        jPanel1.add(labeliniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 130, 20));

        jLabel23.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("detener");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 80, 20));

        ctiempo.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        ctiempo.setForeground(new java.awt.Color(255, 255, 255));
        ctiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctiempo.setText("00:00:00:00");
        jPanel1.add(ctiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 40));

        Bi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi.setBorder(null);
        Bi.setBorderPainted(false);
        Bi.setContentAreaFilled(false);
        Bi.setFocusPainted(false);
        Bi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiActionPerformed(evt);
            }
        });
        jPanel1.add(Bi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 160, 60));

        Bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd.setBorder(null);
        Bd.setBorderPainted(false);
        Bd.setContentAreaFilled(false);
        Bd.setFocusPainted(false);
        Bd.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdActionPerformed(evt);
            }
        });
        jPanel1.add(Bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 60));

        jLabel24.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("TRABAJO:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        Bd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd1.setBorder(null);
        Bd1.setBorderPainted(false);
        Bd1.setContentAreaFilled(false);
        Bd1.setEnabled(false);
        Bd1.setFocusPainted(false);
        Bd1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bd1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 160, 60));

        jLabel25.setFont(new java.awt.Font("Felix Titling", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ACIERTOS:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        Bi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi2.setBorder(null);
        Bi2.setBorderPainted(false);
        Bi2.setContentAreaFilled(false);
        Bi2.setFocusPainted(false);
        Bi2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Bi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bi2ActionPerformed(evt);
            }
        });
        jPanel1.add(Bi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 160, 60));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 740));

        revisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        revisar.setText("REVISAR");
        revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisarActionPerformed(evt);
            }
        });
        jPanel1.add(revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void enviarCorreo(){
       c.setContracena("yoyitojuan");
       c.setUsuarioCorreo("juanjesusgarciamaturana@gmail.com");
       c.setAdjunto("Equipo Atom");
       c.setMensaje(d.nickname + " Tenemos tus resultados!!!\n" + "\n" + "Especialidad: FISICA\n" + "\n" + "Modo de juego: MECANICA CLASICA\n" + "\n"  + "Aciertos: " + objeto.total + " / 16" + "\n" + "\n"
               + "Tiempo: " + Integer.toString(horas) + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos) + ":" + Integer.toString(centesimas_segundos) + "\n" + "\n"
       + " El Equipo de Atom espera que te haya gustado el juego y que sigas mejorando tu puntaje.\n" + "\n" + " Por cierto... " + objeto.Mensaje);
       c.setDestino(d.correo);
       c.setNombreArchivo("15.png");
       c.setRutaArchivo("src/Imagenes/A5.png");
       CJCcontrolador co = new CJCcontrolador();
        if (co.enviarcorreo(c)) {
            JOptionPane.showMessageDialog(null, "Tus resultados fueron enviados\n a tu correo electronico.\n Corre a verlos!!!\n", "Correo Enviado",JOptionPane.PLAIN_MESSAGE, this.icono);
            
        }else{JOptionPane.showMessageDialog(null, "Tus resultados no fueron enviados\n a tu correo electronico.","Correo No Enviado",JOptionPane.PLAIN_MESSAGE, this.icono);}
    }
    
    
    
    
    private void BiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiActionPerformed
       //Revisar
        F1 objeto = new F1 ();

        objeto.cuenta1--;

        objeto.t1=r1.getText();
        objeto.t2=r2.getText();
        objeto.t3=r3.getText();
        objeto.t4=r4.getText();
        objeto.t5=r5.getText();
        objeto.t6=r6.getText();
        objeto.t7=r7.getText();
        objeto.t8=r8.getText();
        objeto.t9=r9.getText();
        objeto.t10=r10.getText();
        objeto.t11=r11.getText();
        objeto.t12=r12.getText();
        objeto.t13=r13.getText();
        objeto.t14=r14.getText();
        objeto.t15=r15.getText();
        objeto.t16=r16.getText();

        intentos.setText(Integer.toString(objeto.cuenta1));

        Colores();
        try {
            in();}
        catch(NullPointerException e){

        }

        objeto.getTotal();
        a.setText(Integer.toString(objeto.total));

        objeto.getTotal2();
        e.setText(Integer.toString(objeto.total2));
        
        
        
        if (objeto.cuenta1 == 0) {
         F1 objeto2 = new F1 ();   
        tiempo.stop();
        objeto.mensaje();   
        JOptionPane.showMessageDialog(null, objeto.Mensaje,"Correo Enviado",JOptionPane.PLAIN_MESSAGE, this.icono);
        enviarCorreo();
        objeto2.cuenta1=3;
        intentos.setText("3");
        }
        
        
        

    }//GEN-LAST:event_BiActionPerformed

    private void BpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpActionPerformed
        // BOTON PAUSAR
        tiempo.stop();
        Bi.setEnabled(true);
    }//GEN-LAST:event_BpActionPerformed

    private void BdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdActionPerformed
        // Boton DETENER
        Sounds c = new Sounds();
        SeleccionQYF objeto = new SeleccionQYF();
        if (tiempo.isRunning()) {
            tiempo.stop();
            
        }

        centesimas_segundos = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;

        actualizarEtiquetaTiempo();
        Bi.setEnabled(true);
        Bp.setEnabled(false);
        Bd.setEnabled(false);
        labeliniciar.setText("Iniciar");
        
        this.setVisible(false);
        objeto.setVisible(true);
        c.SoundF.stop();
        c.sonidoMenu();
    }//GEN-LAST:event_BdActionPerformed

    private void Bd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bd1ActionPerformed

    private void Bi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bi2ActionPerformed
        // Boton INICIAR
        tiempo.start();
        labeliniciar.setText("Reanudar");
        Bd.setEnabled(true);
        Bp.setEnabled(true);

        r1.setEnabled(true); r2.setEnabled(true); r3.setEnabled(true);
        r4.setEnabled(true); r5.setEnabled(true); r6.setEnabled(true);
        r7.setEnabled(true); r8.setEnabled(true); r9.setEnabled(true);
        r10.setEnabled(true); r11.setEnabled(true); r12.setEnabled(true);
        r13.setEnabled(true); r14.setEnabled(true); r15.setEnabled(true);
        r16.setEnabled(true); 


    }//GEN-LAST:event_Bi2ActionPerformed

    private void revisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisarActionPerformed
        // REVISAR

        }

        public void Colores(){
            F1 objeto = new F1 ();

            objeto.getResp1();

            if (objeto.ojo.equalsIgnoreCase("c")){
                r1.setBackground(Color.GREEN);
                r1.setEditable(false);
            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r1.setBackground(Color.RED);
            }

            objeto.getResp2();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r2.setBackground(Color.GREEN);
                r2.setEditable(false);
            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r2.setBackground(Color.RED);

            }

            objeto.getResp3();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r3.setBackground(Color.GREEN);
                r3.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r3.setBackground(Color.RED);
            }

            objeto.getResp4();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r4.setBackground(Color.GREEN);
                r4.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r4.setBackground(Color.RED);
            }

            objeto.getResp5();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r5.setBackground(Color.GREEN);
                r5.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r5.setBackground(Color.RED);
            }

            objeto.getResp6();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r6.setBackground(Color.GREEN);
                r6.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r6.setBackground(Color.RED);
            }

            objeto.getResp7();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r7.setBackground(Color.GREEN);
                r7.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r7.setBackground(Color.RED);

            }

            objeto.getResp8();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r8.setBackground(Color.GREEN);
                r8.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r8.setBackground(Color.RED);

            }

            objeto.getResp9();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r9.setBackground(Color.GREEN);
                r9.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r9.setBackground(Color.RED);
            }

            objeto.getResp10();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r10.setBackground(Color.GREEN);
                r10.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r10.setBackground(Color.RED);
            }

            objeto.getResp11();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r11.setBackground(Color.GREEN);
                r11.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r11.setBackground(Color.RED);
            }

            objeto.getResp12();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r12.setBackground(Color.GREEN);
                r12.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r12.setBackground(Color.RED);
            }

            objeto.getResp13();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r13.setBackground(Color.GREEN);
                r13.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r13.setBackground(Color.RED);
            }

            objeto.getResp14();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r14.setBackground(Color.GREEN);
                r14.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r14.setBackground(Color.RED);
            }

            objeto.getResp15();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r15.setBackground(Color.GREEN);
                r15.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r15.setBackground(Color.RED);
            }

            objeto.getResp16();
            if (objeto.ojo.equalsIgnoreCase("c")){
                r16.setBackground(Color.GREEN);
                r16.setEditable(false);

            }
            if(objeto.ojo.equalsIgnoreCase("i")){
                r16.setBackground(Color.RED);
            }
        }

        public void in(){
            F1 objeto = new F1 ();
            objeto.getIntentos();
            if(objeto.loco.equalsIgnoreCase("c")){
                revisar.setEnabled(false);
                r1.setEnabled(false);
                r2.setEnabled(false);
                r3.setEnabled(false);
                r4.setEnabled(false);
                r5.setEnabled(false);
                r6.setEnabled(false);
                r7.setEnabled(false);
                r8.setEnabled(false);
                r9.setEnabled(false);
                r10.setEnabled(false);
                r11.setEnabled(false);
                r12.setEnabled(false);
                r13.setEnabled(false);
                r14.setEnabled(false);
                r15.setEnabled(false);
                r16.setEnabled(false);

            }
    }//GEN-LAST:event_revisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fisica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fisica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fisica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fisica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fisica1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bd;
    private javax.swing.JButton Bd1;
    private javax.swing.JButton Bi;
    private javax.swing.JButton Bi2;
    private javax.swing.JButton Bp;
    private javax.swing.JLabel a;
    private javax.swing.JLabel ctiempo;
    private javax.swing.JLabel e;
    private javax.swing.JLabel intentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeliniciar;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r10;
    private javax.swing.JTextField r11;
    private javax.swing.JTextField r12;
    private javax.swing.JTextField r13;
    private javax.swing.JTextField r14;
    private javax.swing.JTextField r15;
    private javax.swing.JTextField r16;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JTextField r8;
    private javax.swing.JTextField r9;
    private javax.swing.JButton revisar;
    // End of variables declaration//GEN-END:variables
}
