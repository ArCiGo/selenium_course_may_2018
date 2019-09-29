package com.qalabs.javabasics.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public  String PropertyReader(String name,String key) {
        Properties properties = new Properties();
        InputStream input = null;
        String propertyValue = null;

        try {
            input = this.getClass().getClassLoader().getResourceAsStream(name);
            properties.load(input);
            propertyValue = properties.getProperty(key);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            return propertyValue;
        }
    }
    private void closeInput(InputStream inputStream){
        try {
            inputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
