package proyecto_dds;

import javax.swing.JOptionPane;


public class adicionar_empleado extends javax.swing.JFrame {

    
    public adicionar_empleado() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        caja4 = new javax.swing.JTextField();
        caja5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        caja6 = new javax.swing.JTextField();
        caja7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar Empleado");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        caja1.setBackground(new java.awt.Color(255, 255, 255));
        caja1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 190, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("(x-xxx-xxxx)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 22, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 380, 70));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Primer Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Primer Apellido:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Segundo Apellido:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Segundo Nombre:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        caja2.setEditable(false);
        caja2.setBackground(new java.awt.Color(255, 255, 255));
        caja2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja2.setForeground(new java.awt.Color(0, 0, 0));
        caja2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(caja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 200, 30));

        caja3.setEditable(false);
        caja3.setBackground(new java.awt.Color(255, 255, 255));
        caja3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja3.setForeground(new java.awt.Color(0, 0, 0));
        caja3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(caja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, 30));

        caja4.setEditable(false);
        caja4.setBackground(new java.awt.Color(255, 255, 255));
        caja4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja4.setForeground(new java.awt.Color(0, 0, 0));
        caja4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(caja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 30));

        caja5.setEditable(false);
        caja5.setBackground(new java.awt.Color(255, 255, 255));
        caja5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja5.setForeground(new java.awt.Color(0, 0, 0));
        caja5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.add(caja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 200));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caja6.setBackground(new java.awt.Color(255, 255, 255));
        caja6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja6.setForeground(new java.awt.Color(0, 0, 0));
        caja6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(caja6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        caja7.setBackground(new java.awt.Color(255, 255, 255));
        caja7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caja7.setForeground(new java.awt.Color(0, 0, 0));
        caja7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(caja7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Horas Trabajadas:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Salario por hora:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 380, 100));

        jButton2.setBackground(new java.awt.Color(153, 255, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("+ Agregar ");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Regresar >>");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        empleados fm = new empleados();
        fm.setCedula(caja1.getText());
        if(fm.mostrarempleado()){
            caja2.setText(fm.getNombre());
            caja3.setText(fm.getNombre2());
            caja4.setText(fm.getApellido());
            caja5.setText(fm.getApellido2());
            
        }else{
            JOptionPane.showMessageDialog(null, "Este Usuario No fue encontrado");
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       this.setVisible(false);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (caja2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa Un Empleado con la cédula Primero");
        } else if (caja6.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa un valor en Horas Trabajadas");
        }else if (caja7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa un Valor en Salario Por horas");
        }
        
        empleados fm = new empleados ();
        fm.setHorastrabajadas(Double.valueOf(caja6.getText()));
        fm.setSalarioporhora(Double.valueOf(caja7.getText()));
        fm.setCedula(caja1.getText());
        fm.setNombre(caja2.getText());
        fm.setNombre2(caja3.getText());
        fm.setApellido(caja4.getText());
        fm.setApellido2(caja5.getText());
        if(fm.modificar()){
            JOptionPane.showMessageDialog(null, "Datos Subidos al Archivo");
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
            
    }                                        

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adicionar_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JTextField caja6;
    private javax.swing.JTextField caja7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration                   
}
