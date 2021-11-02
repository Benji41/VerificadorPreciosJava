
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.Spring.width;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjimon41
 */
public class FramePrincipal extends javax.swing.JFrame {

    static Timer timer = new Timer();
    static int seconds = 4000;
    private String codigo = "";
    private int segundos = 0;
    private String localDir = System.getProperty("user.dir");

    public FramePrincipal() {
        this.getContentPane().setBackground(new Color(60, 179, 113));
        this.setExtendedState(FramePrincipal.MAXIMIZED_BOTH);
        setResizable(false);
        setUndecorated(true);

        initComponents();

        //imagenes
        this.img_barcode.setIcon(new ImageIcon(localDir + "\\src\\rsz_barcode-scan.gif"));
        this.img_barcode.setLocation((this.getWidth() - img_barcode.getWidth()) / 2 + 945, 550);
        this.img_logo.setIcon(new ImageIcon(localDir + "\\src\\rsz_Captura_de_pantalla_2021-09-28_234407-removebg-preview.png"));
        //producto
        this.img_producto.setLocation(240, 300);
        this.lb_desc_desc.setLocation(240, 600);
        this.lb_descP.setLocation(245, 660);
        this.lb_desc_nombre.setLocation(750, 400);
        this.lb_desc_precio.setLocation(805, 450);
        this.lb_desc_stock.setLocation(750, 500);
        this.lb_nombreP.setLocation(965, 400);
        this.lb_precioP.setLocation(965, 450);
        this.lb_stockP.setLocation(965, 500);
        //anuncios
        this.lb_porfavor.setLocation((this.getWidth() - lb_porfavor.getWidth()) / 2 + 945, 350);
        this.lb_porfavor2.setLocation((this.getWidth() - lb_porfavor2.getWidth()) / 2 + 945, 450);
        this.lb_porfavor3.setLocation((this.getWidth() - lb_porfavor3.getWidth()) / 2 + 945, 950);
        this.lb_porfavor3.setVisible(false);
        //outcome
        this.lb_outcome.setVisible(false);
        this.lb_outcome_text.setVisible(false);
        this.img_outcome.setVisible(false);
        this.Inicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_outcome = new javax.swing.JLabel();
        lb_outcome = new javax.swing.JLabel();
        lb_porfavor3 = new javax.swing.JLabel();
        lb_desc_desc = new javax.swing.JLabel();
        lb_descP = new javax.swing.JLabel();
        lb_desc_nombre = new javax.swing.JLabel();
        lb_desc_precio = new javax.swing.JLabel();
        lb_desc_stock = new javax.swing.JLabel();
        lb_nombreP = new javax.swing.JLabel();
        lb_precioP = new javax.swing.JLabel();
        lb_stockP = new javax.swing.JLabel();
        lb_porfavor = new javax.swing.JLabel();
        lb_porfavor2 = new javax.swing.JLabel();
        img_barcode = new javax.swing.JLabel();
        img_logo = new javax.swing.JLabel();
        lb_outcome_text = new javax.swing.JLabel();
        img_producto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(img_outcome);
        img_outcome.setBounds(1180, 90, 330, 240);

        lb_outcome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        lb_outcome.setText("jLabel1");
        getContentPane().add(lb_outcome);
        lb_outcome.setBounds(10, 31, 810, 70);

        lb_porfavor3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_porfavor3.setForeground(new java.awt.Color(105, 105, 105));
        lb_porfavor3.setText("¡Siga comprando más por menos!");
        getContentPane().add(lb_porfavor3);
        lb_porfavor3.setBounds(570, 50, 651, 43);

        lb_desc_desc.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_desc_desc.setForeground(new java.awt.Color(105, 105, 105));
        lb_desc_desc.setText("Descripción:");
        getContentPane().add(lb_desc_desc);
        lb_desc_desc.setBounds(0, 240, 248, 43);

        lb_descP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lb_descP.setForeground(new java.awt.Color(255, 215, 0));
        lb_descP.setText("jLabel1");
        getContentPane().add(lb_descP);
        lb_descP.setBounds(0, 430, 93, 29);

        lb_desc_nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_desc_nombre.setForeground(new java.awt.Color(105, 105, 105));
        lb_desc_nombre.setText("Producto:");
        getContentPane().add(lb_desc_nombre);
        lb_desc_nombre.setBounds(0, 465, 192, 43);

        lb_desc_precio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_desc_precio.setForeground(new java.awt.Color(105, 105, 105));
        lb_desc_precio.setText("Precio:");
        getContentPane().add(lb_desc_precio);
        lb_desc_precio.setBounds(0, 514, 139, 43);

        lb_desc_stock.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_desc_stock.setForeground(new java.awt.Color(105, 105, 105));
        lb_desc_stock.setText("Unidades:");
        getContentPane().add(lb_desc_stock);
        lb_desc_stock.setBounds(0, 563, 196, 43);

        lb_nombreP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_nombreP.setForeground(new java.awt.Color(255, 215, 0));
        lb_nombreP.setText("jLabel1");
        getContentPane().add(lb_nombreP);
        lb_nombreP.setBounds(210, 465, 1360, 43);

        lb_precioP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_precioP.setForeground(new java.awt.Color(255, 215, 0));
        lb_precioP.setText("jLabel1");
        getContentPane().add(lb_precioP);
        lb_precioP.setBounds(210, 514, 340, 43);

        lb_stockP.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_stockP.setForeground(new java.awt.Color(255, 215, 0));
        lb_stockP.setText("jLabel1");
        getContentPane().add(lb_stockP);
        lb_stockP.setBounds(214, 563, 310, 43);

        lb_porfavor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        lb_porfavor.setForeground(new java.awt.Color(255, 215, 0));
        lb_porfavor.setText("Por favor pase el codigo de barras por debajo del escaner");
        getContentPane().add(lb_porfavor);
        lb_porfavor.setBounds(0, 612, 1529, 57);

        lb_porfavor2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_porfavor2.setForeground(new java.awt.Color(105, 105, 105));
        lb_porfavor2.setText("¡Busque el codigo de barra de su producto y lleveselo!");
        getContentPane().add(lb_porfavor2);
        lb_porfavor2.setBounds(0, 680, 1063, 43);

        img_barcode.setText("barcode");
        getContentPane().add(img_barcode);
        img_barcode.setBounds(868, 193, 251, 187);

        img_logo.setText("img logo");
        getContentPane().add(img_logo);
        img_logo.setBounds(584, 163, 278, 217);

        lb_outcome_text.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lb_outcome_text.setForeground(new java.awt.Color(105, 105, 105));
        lb_outcome_text.setText("ss");
        getContentPane().add(lb_outcome_text);
        lb_outcome_text.setBounds(180, 370, 1590, 30);
        getContentPane().add(img_producto);
        img_producto.setBounds(1140, 150, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() != 10) {
            codigo += evt.getKeyChar();
        } else {
            Connection con = null;
            try {

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verificador_precios2", "root", "");
                PreparedStatement pstm = con.prepareStatement("SELECT producto_nombre, producto_precio, producto_stock, producto_desc, producto_imagen FROM productos WHERE producto_codigo =" + codigo + ";");
                ResultSet rs = pstm.executeQuery();

                if (rs.next()) {

                    Resultado(0);
                    lb_nombreP.setText(rs.getString(1));
                    lb_precioP.setText(rs.getString(2));
                    lb_stockP.setText(rs.getString(3));
                    lb_descP.setText(rs.getString(4));
                    String ruta = rs.getString(5);
                    if (ruta != null) {
                        ImageIcon icono = new ImageIcon(new URL(ruta));
                        img_producto.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                    }
                    seconds=4;
                    this.MyTimer();
                    

                } else {
                    Resultado(1);
                    this.MyTimer();
                }
            } catch (ClassNotFoundException ex) {
                Resultado(2);
                System.out.println(ex.getCause());
            } catch (SQLException ex) {
                Resultado(2);
                System.out.println(ex.getCause());

            } catch (MalformedURLException ex) {
                Logger.getLogger(FramePrincipal.class
                        .getName()).log(Level.SEVERE, null, ex);
            } 
            codigo = "";

        }
    }//GEN-LAST:event_formKeyPressed

    public void MyTimer() {

        TimerTask task;

        task = new TimerTask() {
            @Override
            public void run() {
               
                try {
                    Thread.sleep(seconds);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                while (seconds > 0) {
                    seconds-=1000;
                    if(seconds == 0){
                        lb_porfavor3.setVisible(false);
                        lb_outcome.setVisible(false);
                        img_outcome.setVisible(false);
                        lb_outcome_text.setVisible(false);
                        Inicio();
                    }
                }
                seconds=4000;            
            }
        };
        timer.schedule(task, 0, 1000);
    }

    private void Ocultar(Boolean mostrar) {
        //texto
        lb_desc_nombre.setVisible(mostrar);
        lb_desc_precio.setVisible(mostrar);
        lb_desc_stock.setVisible(mostrar);
        lb_desc_desc.setVisible(mostrar);
        //producto
        img_producto.setVisible(mostrar);
        lb_descP.setVisible(mostrar);
        lb_nombreP.setVisible(mostrar);
        lb_precioP.setVisible(mostrar);
        lb_stockP.setVisible(mostrar);

    }

    private void Inicio() {
        Ocultar(false);
        this.img_logo.setLocation((this.getWidth() - this.img_logo.getWidth()) / 2 + 930, 100);
        lb_porfavor.setVisible(true);
        lb_porfavor2.setVisible(true);
        img_barcode.setVisible(true);
    }

    private void Resultado(int estado) {
        lb_outcome_text.setVisible(true);
        img_logo.setLocation(1600, 40);
        lb_porfavor.setVisible(false);
        lb_porfavor2.setVisible(false);
        img_barcode.setVisible(false);
        lb_porfavor3.setVisible(true);
        img_outcome.setVisible(true);
        lb_outcome.setVisible(true);
        if (estado == 0) {
            lb_outcome_text.setVisible(false);
            Ocultar(true);
            img_outcome.setLocation(100, 40);
            this.lb_outcome.setLocation(300, 130);
            this.img_outcome.setIcon(new ImageIcon(localDir + "\\src\\rsz_exito-removebg-preview.png"));
            lb_outcome.setText("¡Busqueda exitosa!");
            lb_outcome.setForeground(Color.green);

        } else {
            Ocultar(false);

            if (estado == 1) {
                img_outcome.setLocation(765, 210);
                lb_outcome.setText("¡Busqueda fallida!");
                lb_outcome.setForeground(Color.red);
                lb_outcome_text.setText("Lo sentimos, el producto que buscaba no fue identificado.\nPor favor acuda a servicio al cliente para mas información.");
                this.img_outcome.setIcon(new ImageIcon(localDir + "\\src\\rsz_error-removebg-preview.png"));
                lb_outcome.setLocation((this.getWidth() - lb_outcome.getWidth()) - 400, 500);
            } else {
                img_outcome.setLocation(805, 210);
                lb_outcome.setText("¡Dispositivo en mantenimiento!");
                lb_outcome.setLocation((this.getWidth() - lb_outcome.getWidth()) / 2 - 20, 500);
                lb_outcome.setForeground(Color.yellow);
                lb_outcome_text.setText("Lo sentimos, intente utilizar el dispositivo mas tarde.\nPor favor acuda a servicio al cliente para mas información.");
                this.img_outcome.setIcon(new ImageIcon(localDir + "\\src\\rsz_alerta-removebg-preview.png"));

            }

            lb_outcome_text.setLocation(200, 600);

        }

    }

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
            java.util.logging.Logger.getLogger(FramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_barcode;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel img_outcome;
    private javax.swing.JLabel img_producto;
    private javax.swing.JLabel lb_descP;
    private javax.swing.JLabel lb_desc_desc;
    private javax.swing.JLabel lb_desc_nombre;
    private javax.swing.JLabel lb_desc_precio;
    private javax.swing.JLabel lb_desc_stock;
    private javax.swing.JLabel lb_nombreP;
    private javax.swing.JLabel lb_outcome;
    private javax.swing.JLabel lb_outcome_text;
    private javax.swing.JLabel lb_porfavor;
    private javax.swing.JLabel lb_porfavor2;
    private javax.swing.JLabel lb_porfavor3;
    private javax.swing.JLabel lb_precioP;
    private javax.swing.JLabel lb_stockP;
    // End of variables declaration//GEN-END:variables
}
