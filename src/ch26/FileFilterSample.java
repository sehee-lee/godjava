package ch26;

import java.io.File;

public class FileFilterSample {
    public static void main(String args[]) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = "/Users/chad/kakao_dev/study/java/godjava/files";
        sample.checkList(pathName);
    }
    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
            File []mainFileList = file.listFiles(new JPGFileFilter());
            for (File tempFile : mainFileList) {
                System.out.println(tempFile.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}