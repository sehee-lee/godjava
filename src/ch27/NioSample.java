package ch27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String args[]) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }
    public void basicWriteAndRead() {
        String filename = "/Users/chad/kakao_dev/study/java/godjava/files/nio.txt";
        try {
            writeFile(filename, "My first NIO sample.");
            readFile(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(String filename, String data) throws Exception {
        FileChannel channel = new FileOutputStream(filename).getChannel();
        byte[] bytedata = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(bytedata);
        channel.write(buffer);
        channel.close();;
    }
    public void readFile(String filename) throws Exception {
        FileChannel channel = new FileInputStream(filename).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char)buffer.get());
        }

        channel.close();
    }
}
