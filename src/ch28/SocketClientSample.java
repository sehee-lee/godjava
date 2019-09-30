package ch28;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    static public void main(String args[]) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }
    public void sendSocketSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendSocketData("I liked java at " + new Date());
        }
        sendSocketData("EXIT");
    }
    public void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client : Connecting");
            //이 new를 통해서 server에 connection을 한다. 이렇게하면 연결 후 그 연결에 대한 socket이 return된다.
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("Client : Connect status = " + socket.isConnected());

            Thread.sleep(1000);
            //연결된 socket을 부터 stream을 get!!! 여기다 쓰고 보내면 연결된 server로 데이터가 전달된다.
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);

            byte[] bytes = data.getBytes();
            //byte data write. 이러면 msg 전송!!
            out.write(bytes);
            System.out.println("Client : Sent data");

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
