package ch26;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String args[]) {
        FileManageClass manager = new FileManageClass();
        String pathName = "/Users/chad/kakao_dev/study/java/godjava/files";
        String fileName = "test.txt";

        manager.checkFile(pathName, fileName);
    }
    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getFileInfo(File file) throws IOException {
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Absolute file = " + file.getAbsoluteFile());
        System.out.println("Canonical path = " + file.getCanonicalPath());
        System.out.println("Canonical file = " + file.getCanonicalFile());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
    }
}
