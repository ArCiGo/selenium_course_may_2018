package com.qalabs.seleniumbasics.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public String getProperty(String fileName, String name) {
        Properties properties = new Properties();
        InputStream input = null;
        String propertyValue = null;

        try {
            input = this.getClass().getClassLoader().getResourceAsStream(fileName);
                    //new FileInputStream("/" + fileName);
            properties.load(input);
            propertyValue = properties.getProperty(name);
        } catch(FileNotFoundException exception) {
            exception.printStackTrace();
        } finally {
            closeInput(input);
            return propertyValue;
        }
    }

    private static void closeInput(InputStream input) {
        try {
            input.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}