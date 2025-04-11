package ProyectoSistemaEscolar.dsoo.presentacion.profesores;

/**
 * @author albert
 */
import ProyectoSistemaEscolar.dsoo.presentacion.profesores.*;
import ProyectoSistemaEscolar.dao.profesores.ProfesorDaoImpl;
import ProyectoSistemaEscolar.bd.domain.Profesor;
import javax.swing.JOptionPane;
public class ProfesoresModal extends javax.swing.JFrame {

    Profesores papa;
    int op;
    int idAlumno;
    public void opcion(int opcion,Profesores p){
        op=opcion;
        papa = p;
        //System.out.println(p);
        if(op==1){
            tituloTxt.setText("Agregar Profesor");
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearAlumno.png")));
        }
        if(op==2){
            tituloTxt.setText("Editar Profesor");
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar1.png")));
        }
    }
    
    public void asignar(Profesor dato){
        idAlumno = dato.getId_profesor();
        nombreTxt.setText(dato.getNombres());
        apellidoPaternoTxt.setText(dato.getApellido_paterno());
        apellidoMaternoTxt.setText(dato.getApellido_materno());
        correoTxt.setText(dato.getCorreo());
        matriculaTxt.setText(dato.getTelefono());
    }
    
    /**
     * Creates new form AlumnosModal
     */
    public ProfesoresModal() {
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
        jLabel1 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoPaternoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoMaternoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        matriculaTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        volverBtn = new javax.swing.JButton();
        enviarBtn = new javax.swing.JButton();
        tituloTxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(241, 250, 218));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setForeground(new java.awt.Color(38, 80, 115));
        jLabel1.setText("Nombre");

        nombreTxt.setForeground(new java.awt.Color(102, 0, 204));

        jLabel2.setForeground(new java.awt.Color(38, 80, 115));
        jLabel2.setText("Apellido Paterno");

        apellidoPaternoTxt.setForeground(new java.awt.Color(102, 0, 204));

        jLabel3.setForeground(new java.awt.Color(38, 80, 115));
        jLabel3.setText("Apellido Materno");

        apellidoMaternoTxt.setForeground(new java.awt.Color(102, 0, 204));

        jLabel4.setForeground(new java.awt.Color(38, 80, 115));
        jLabel4.setText("Telefono");

        matriculaTxt.setForeground(new java.awt.Color(102, 0, 204));

        jLabel5.setForeground(new java.awt.Color(38, 80, 115));
        jLabel5.setText("Correo");

        correoTxt.setForeground(new java.awt.Color(102, 0, 204));

        volverBtn.setBackground(new java.awt.Color(255, 0, 0));
        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha_izq.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        enviarBtn.setBackground(new java.awt.Color(45, 149, 150));
        enviarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Check.png"))); // NOI18N
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        tituloTxt.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(38, 80, 115));
        tituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(matriculaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoMaternoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoPaternoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(volverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addComponent(tituloTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidoPaternoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(apellidoMaternoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matriculaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enviarBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(volverBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
    if (!nombreTxt.getText().equals("") && !apellidoPaternoTxt.getText().equals("") && !apellidoMaternoTxt.getText().equals("") && !matriculaTxt.getText().equals("") && !correoTxt.getText().equals("")) {
            ProfesorDaoImpl profeService = new ProfesorDaoImpl();
            Profesor profe = new Profesor();
        
            if(op==1){
                profe.setNombres(nombreTxt.getText());
                profe.setApellido_paterno(apellidoPaternoTxt.getText());
                profe.setApellido_materno(apellidoMaternoTxt.getText());
                profe.setTelefono(matriculaTxt.getText());
                profe.setCorreo(correoTxt.getText());
                if(profeService.registrarProfesor(profe)){
                    JOptionPane.showMessageDialog(rootPane,"Profesor añadido");
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se pudo añadir");
                }
                papa.llamar();
            }
        
            if(op==2){
                profe.setId_profesor(idAlumno);
                profe.setNombres(nombreTxt.getText());
                profe.setApellido_paterno(apellidoPaternoTxt.getText());
                profe.setApellido_materno(apellidoMaternoTxt.getText());   
                profe.setTelefono(matriculaTxt.getText());
                profe.setCorreo(correoTxt.getText());
                if(profeService.actualizarProfesor(profe)){
                    JOptionPane.showMessageDialog(rootPane,"Profesor actualizado");
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se pudo editar");
                }
                papa.llamar();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacíos");
        }
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.dispose();
        System.out.println(op);
    }//GEN-LAST:event_volverBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProfesoresModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesoresModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesoresModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesoresModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProfesoresModal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMaternoTxt;
    private javax.swing.JTextField apellidoPaternoTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matriculaTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel tituloTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
