/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import com.mycompany.calculadora3.Calculadora3;
import com.mycompany.calculadora3.Operacion;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ALEJANDRO
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
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
        boton_mas = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        boton_igual = new javax.swing.JButton();
        boton_menos = new javax.swing.JButton();
        boton_0 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_multiplicacion = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        boton_seno = new javax.swing.JButton();
        boton_raiz_cuadrada = new javax.swing.JButton();
        boton_coseno = new javax.swing.JButton();
        boton_potencia = new javax.swing.JButton();
        boton_tangente = new javax.swing.JButton();
        boton_iva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        boton_mas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_mas.setText("+");
        boton_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_masActionPerformed(evt);
            }
        });

        pantalla.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N

        boton_igual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_igual.setText("=");
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });

        boton_menos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_menos.setText("-");
        boton_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_menosActionPerformed(evt);
            }
        });

        boton_0.setText("0");
        boton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_0ActionPerformed(evt);
            }
        });

        boton_1.setText("1");
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });

        boton_2.setText("2");
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });

        boton_3.setText("3");
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });

        boton_4.setText("4");
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });

        boton_5.setText("5");
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });

        boton_6.setText("6");
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });

        jButton3.setText(",");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        boton_7.setText("7");
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });

        boton_8.setText("8");
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });

        boton_9.setText("9");
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });

        boton_multiplicacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_multiplicacion.setText("x");
        boton_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_multiplicacionActionPerformed(evt);
            }
        });

        boton_division.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_division.setText("/");
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("AC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boton_seno.setText("Sin()");
        boton_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_senoActionPerformed(evt);
            }
        });

        boton_raiz_cuadrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton_raiz_cuadrada.setText("√");
        boton_raiz_cuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_raiz_cuadradaActionPerformed(evt);
            }
        });

        boton_coseno.setText("Coseno()");
        boton_coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cosenoActionPerformed(evt);
            }
        });

        boton_potencia.setText("X^");
        boton_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_potenciaActionPerformed(evt);
            }
        });

        boton_tangente.setText("Tan()");
        boton_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tangenteActionPerformed(evt);
            }
        });

        boton_iva.setText("IVA");
        boton_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boton_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(boton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(boton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(boton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(boton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_mas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(boton_multiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(boton_division, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(boton_menos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_raiz_cuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                    .addComponent(boton_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton_seno, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(boton_coseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_potencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_tangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_raiz_cuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_menos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_mas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Calculadora3 calc=new Calculadora3();
    
    double numero1;
    double numero2;
    String signo;
    double resultado2;
    
    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
     
        String total;
        //numero2=Double.parseDouble(pantalla.getText());
        
        if(signo.equals("+")){
            numero2=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.suma(numero1, numero2);
            total= String.valueOf(resultado2);
            pantalla.setText(total);
        }
        if(signo.equals("-")){
            numero2=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.resta(numero1, numero2);
            total=String.valueOf(resultado2);
            pantalla.setText(total);
            
        }
        if(signo.equals("*")){
            numero2=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.multi(numero1, numero2);
            total=String.valueOf(resultado2);
            pantalla.setText(total);
            
            
        }
        if((!pantalla.getText().equals("0")) && signo.equals("/")){
           
            numero2=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.divi(numero1, numero2);
            total=String.valueOf(resultado2);
            pantalla.setText(total);
            
        }
        if(signo.equals("?")){
         numero2=Double.parseDouble(pantalla.getText());
         resultado2=Operacion.potencia(numero1, numero2);
         total=String.valueOf(resultado2);
         pantalla.setText(total);
            
        }
        if(signo.equals("#")){
            numero2=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.raiz(numero1, numero2);
            total=String.valueOf(resultado2);
            pantalla.setText(total);
        }
        if(signo.equals("¿")){
        numero2=Double.parseDouble(pantalla.getText());
        resultado2=Operacion.iva(numero1, numero2);
        total=String.valueOf(resultado2);
        pantalla.setText(total);
            
        }
       
        
        
        
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
       pantalla.setText(pantalla.getText()+"2");
        

    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_menosActionPerformed
        
        
        if(!pantalla.getText().equals("")){
           
        numero1=Double.parseDouble(pantalla.getText());
        signo="-";
        pantalla.setText("");
        }
        
        
        
        
    }//GEN-LAST:event_boton_menosActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
    pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
      
     pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_masActionPerformed
    
        if(!pantalla.getText().equals("")){
    
    numero1=Double.parseDouble(pantalla.getText());
        signo="+";
        pantalla.setText("");
    
}       
        
        
        /*String mensaje;
        double numero1=Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        double numero2=Double.parseDouble(pantalla.getText());
        double resultado2=calc.suma(numero1, numero2);
        mensaje= String.valueOf(resultado2);
        pantalla.setText(mensaje);*/
      
        
        
        
    }//GEN-LAST:event_boton_masActionPerformed

    private void boton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_0ActionPerformed

        pantalla.setText(pantalla.getText()+"0");
      
    }//GEN-LAST:event_boton_0ActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
      
      pantalla .setText(pantalla.getText()+"1");
      
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
    pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
    pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
    pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
    pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
    pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_boton_8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   pantalla.setText(pantalla.getText()+",");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multiplicacionActionPerformed
    if(!pantalla.getText().equals("")){
       numero1=Double.parseDouble(pantalla.getText());
        signo="*";
        pantalla.setText(""); 
        
    }
        
        
    }//GEN-LAST:event_boton_multiplicacionActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
       
        if(!pantalla.getText().equals("")){
            
        numero1=Double.parseDouble(pantalla.getText());
        signo="/";
        pantalla.setText("");   
            
          }
        
        
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     pantalla.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_raiz_cuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_raiz_cuadradaActionPerformed
       String total2;
        if(!pantalla.getText().equals("")){
         numero1= Double.parseDouble(pantalla.getText());
         signo="#";
         pantalla.setText("");   
        }
    }//GEN-LAST:event_boton_raiz_cuadradaActionPerformed

    private void boton_senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_senoActionPerformed
        String total3;
        if(!pantalla.getText().equals("")){
           numero1= Double.parseDouble(pantalla.getText());
           resultado2=Operacion.sen(numero1);
           total3=String.valueOf(resultado2);
           pantalla.setText(total3);
                   
        }
        
        
    }//GEN-LAST:event_boton_senoActionPerformed

    private void boton_cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cosenoActionPerformed
  
        String total3;
        if(!pantalla.getText().equals("")){
        
         numero1=Double.parseDouble(pantalla.getText());
         resultado2=Operacion.cos(numero1);
         total3=String.valueOf(resultado2);
         pantalla.setText(total3);
        }
        
        
    }//GEN-LAST:event_boton_cosenoActionPerformed

    private void boton_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_potenciaActionPerformed
      
        
        if(!pantalla.getText().equals("")){
          numero1=Double.parseDouble(pantalla.getText());
          signo="?";
          pantalla.setText("");
          
          
          
    }//GEN-LAST:event_boton_potenciaActionPerformed

    }
    private void boton_tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tangenteActionPerformed
        
        String total3;
        if(!pantalla.getText().equals("")){
            numero1=Double.parseDouble(pantalla.getText());
            resultado2=Operacion.tangente(numero1);
            total3=String.valueOf(resultado2);
            pantalla.setText(total3);
            
        }
        
        
        
    }//GEN-LAST:event_boton_tangenteActionPerformed

    private void boton_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ivaActionPerformed
        numero1=Double.parseDouble(pantalla.getText());
        signo="¿";
        pantalla.setText("");
    }//GEN-LAST:event_boton_ivaActionPerformed
    
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_coseno;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_iva;
    private javax.swing.JButton boton_mas;
    private javax.swing.JButton boton_menos;
    private javax.swing.JButton boton_multiplicacion;
    private javax.swing.JButton boton_potencia;
    private javax.swing.JButton boton_raiz_cuadrada;
    private javax.swing.JButton boton_seno;
    private javax.swing.JButton boton_tangente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
