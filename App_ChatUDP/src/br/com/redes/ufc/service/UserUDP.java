package br.com.redes.ufc.service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UserUDP {
    //variaveis de identificação
    private int portaOrigem;   //porta da comunicação
    private InetAddress ipOrigem;
    private DatagramSocket appSocket;
    
    //construtor
    public UserUDP(int portaOrigem){
        this.portaOrigem = portaOrigem;
    };
    
    public void enviar(InetAddress destino, int portaDestino) throws IOException{
        Scanner teclado = new Scanner(System.in);
        String string = teclado.toString();
        
        destino = InetAddress.getByName("127.0.0.1");                           //endereço de destino
        byte[] mensagem = string.getBytes();                                           //mensagem em um array de bytes  
            
        DatagramPacket pacote = new DatagramPacket(mensagem, mensagem.length, destino, portaDestino); //pacote que será enviado
        
        this.appSocket = new DatagramSocket(portaDestino);                      //socket de envio e recebimento das mensagens (pacotes)
            
        //enviando um pacote
        this.appSocket.send(pacote);
        System.out.println("Sua mensagem foi enviada para o usuário "+destino.getHostAddress()+"\n.");
            
        this.appSocket.close();                                                 //fechando o socket
    }
    
    public void receber(){
    
    }
}
