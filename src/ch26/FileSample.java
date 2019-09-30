package ch26;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String atgs[]) {
        FileSample sample = new FileSample();
        String dirPath = "/Users/chad/kakao_dev/study/java/godjava/files";
        String fileName = "ch26_text";
        boolean exists = false;
        boolean result = false;

        exists = sample.checkPath(dirPath);

        if (!exists) {
            sample.makeDir(dirPath);
        }
        exists = sample.checkPath(dirPath + File.separator + fileName);
    }
    public boolean checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? " + file.exists());

        if (file.exists()) {
            checkStatus(pathName);
        }

        return file.exists();
    }
    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is created? " + file.mkdir());
    }
    public void checkStatus(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? " + file.isDirectory());
        System.out.println(pathName + " is file? " + file.isFile());
        System.out.println(pathName + " is hidden? " + file.isHidden());
        lastModified(pathName);
    }
    public void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " was modified at " + new Date(file.lastModified()));
    }
}