package ch23;

import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.loadAndSavePropertiesXML();
    }
    public void checkProperties() {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject:keySet) {
            System.out.println(tempObject + "=" + prop.get(tempObject));
        }
    }
    public void loadAndSavePropertiesXML() {
        try {
            String filename = "test.xml";
            File propertiesFile = new File(filename);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "Chad Lee");
            prop.storeToXML(fos, "Basic XML Property file");
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}