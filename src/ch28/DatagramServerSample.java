package ch28;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerSample {
    public static void main (String args[]) {
        DatagramServerSample sample = new DatagramServerSample();
        sample.startServer();
    }
    public void startServer() {
            DatagramSocket server = null;
            try {
                //DatagramSocket을 할당한다. localhost의 9999 port로 listen 시작
                server = new DatagramSocket(9999);
                int bufferLength = 256;
                byte[] buffer = new byte[bufferLength];

                //bufferLength만큼 packet을 받아서 buffer에 넣어줌
                DatagramPacket packet = new DatagramPacket(buffer, bufferLength);

                //계속 돌면서 connection을 받아준다.
                while(true) {
                    System.out.println("Server: Waiting for request.");
                    //request가 오면 여기서 깨어난다.
                    server.receive(packet);

                    int dataLength = packet.getLength();
                    System.out.println("Server: received. Data length = " + dataLength);

                    //packet으로 들오온 길이만큼 data를 읽어서 string type으로 변경
                    String data = new String(packet.getData(), 0, dataLength);
                    System.out.println("Received data: " + data);

                    if (data.equals("EXIT")) {
                        System.out.println("Stop DatagramServer");
                        break;
                    }
                    System.out.println("----------");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
