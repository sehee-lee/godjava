package ch28;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramClientSample {
    public static void main (String args[]) {
        DatagramClientSample sample = new DatagramClientSample();

        sample.sendDatagramSample();
    }
    public void sendDatagramSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendDatagramData("I Like UDP " + new Date());
        }
        sendDatagramData("EXIT");
    }
    public void sendDatagramData(String data) {
        try {
            //server로 connection을 맺기 위한 client object를 생성
            DatagramSocket client = new DatagramSocket();
            //InetAddress get! 여기에는 데이터를 받아 줄 server의 ip를 쓰면 된다.
            InetAddress address = InetAddress.getByName("127.0.0.1");
            byte[] buffer = data.getBytes();
            //데이터를 전송하기 위한 packet을 생성한다. address와 port를 넘겨준다.
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, address, 9999);

            System.out.println("Client:Sent data");
            //데이터를 server로 전송
            client.send(packet);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
