package br.com.redes.ufc.frame;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UserHome extends javax.swing.JFrame {
    DatagramSocket socketAberto;
    InetAddress ipOrigem;
    
    String usuario;
    int portaOrigem;
    
    public UserHome() {
        initComponents();
    }

    public UserHome(JTextField textNome, JTextField textPorta) throws UnknownHostException {
        initComponents();
        
        this.usuario = textNome.getText();
        this.portaOrigem = Integer.parseInt(textPorta.getText());
        
        System.out.println("\nNome de usuário: "+this.usuario+".\nPorta aberta: "+this.portaOrigem+".\nIP Origem: "+InetAddress.getLocalHost()+".");
        
        this.textNome.setText(usuario);
        this.textIPOrigem.setText(""+InetAddress.getLoopbackAddress());
        this.textPortaOrigem.setText(""+portaOrigem);
        
        this.areaChat.append("Seja bem vindo, "+this.usuario+"!\n\n");
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
        labNome = new javax.swing.JLabel();
        labIPOrigem = new javax.swing.JLabel();
        labPorta = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textIPOrigem = new javax.swing.JTextField();
        textPortaOrigem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaChat = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textIPDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPortaDestino = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMensagem = new javax.swing.JTextArea();
        btnReceber = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Você está logado como:"));

        labNome.setText("Nome de usuário:");

        labIPOrigem.setText("IP Origem:");

        labPorta.setText("Porta:");

        textNome.setEditable(false);

        textIPOrigem.setEditable(false);

        textPortaOrigem.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNome)
                    .addComponent(labIPOrigem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textIPOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(textNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(labPorta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPortaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIPOrigem)
                    .addComponent(labPorta)
                    .addComponent(textIPOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPortaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        areaChat.setEditable(false);
        areaChat.setColumns(20);
        areaChat.setRows(5);
        jScrollPane1.setViewportView(areaChat);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel4.setText("IP Destino:");

        textIPDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIPDestinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Porta Destino:");

        areaMensagem.setColumns(20);
        areaMensagem.setRows(5);
        jScrollPane2.setViewportView(areaMensagem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIPDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPortaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(jLabel4)
                    .addComponent(textIPDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textPortaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnReceber.setText("Receber");
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnReceber.getAccessibleContext().setAccessibleName("Receber");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
        if(this.btnReceber.isEnabled()){
            new Thread(new OuvindoPorta(this.socketAberto, this.portaOrigem, this)).start();
        }
    }//GEN-LAST:event_btnReceberActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            InetAddress ipDestino = InetAddress.getByName(this.textIPDestino.getText());
            int portaDestino = Integer.parseInt(this.textPortaDestino.getText());
            
            String string = areaMensagem.getText().trim();
            byte[] mensagem = string.getBytes();
            
            DatagramPacket pacote = new DatagramPacket(mensagem, mensagem.length, ipDestino, portaDestino);
            
            try (DatagramSocket appSocket = new DatagramSocket()) {
                appSocket.send(pacote);
                System.out.println("Sua mensagem foi enviada!");
            }
            //appSocket.close();
            
            //this.areaChat.append("Você -> "+ipDestino+": "+Arrays.toString(mensagem)+"\n");
            this.areaChat.append("Você --> "+ipDestino+": "+string+"\n");
            this.areaMensagem.setText("");
        } catch (UnknownHostException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        } catch (SocketException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void textIPDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIPDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIPDestinoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaChat;
    private javax.swing.JTextArea areaMensagem;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JToggleButton btnReceber;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labIPOrigem;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labPorta;
    private javax.swing.JTextField textIPDestino;
    private javax.swing.JTextField textIPOrigem;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPortaDestino;
    private javax.swing.JTextField textPortaOrigem;
    // End of variables declaration//GEN-END:variables

    private static class OuvindoPorta implements Runnable {

        private final int portaOrigem;
        private DatagramSocket socketAberto;
        private final UserHome frame;
        private String string;

        public OuvindoPorta(DatagramSocket socketAberto, int porta, UserHome frame) {
            this.socketAberto = socketAberto;
            this.portaOrigem = porta;
            this.frame = frame;
        }

        @Override
        public void run() {
            try {
                boolean bool = true;
                
                System.out.println("\nEstou ouvindo na porta "+this.portaOrigem+"!");
                while(bool){
                    socketAberto = new DatagramSocket(this.portaOrigem);
                
                    byte[] mensagem = new byte[256];
                    DatagramPacket pacoteRecebido = new DatagramPacket(mensagem, mensagem.length);
                
                    socketAberto.receive(pacoteRecebido);
                
                    string = new String(pacoteRecebido.getData()).trim();
                    //JOptionPane.showMessageDialog(null, string, "Mensagem recebida na porta "+this.portaOrigem, WIDTH);
                    this.frame.areaChat.append("Para você: "+string+"\n");
                    if(string.equals("bool = false")) bool = false;
          
                    socketAberto.close();
                }
                
                System.exit(0);
            } catch (IOException ex) {
                System.out.println("ERRO: "+ex.getMessage());
            }
        }
    }
}
