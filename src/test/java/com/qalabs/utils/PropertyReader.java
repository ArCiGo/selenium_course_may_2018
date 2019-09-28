package com.qalabs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    public String getProperty (String fileName, String name) {
        Properties properties = new Properties();
        InputStream input = null;
        String propertyValue = null;
        try {
            input = this.getClass().getClassLoader().getResourceAsStream("Credentials.properties");
            properties.load(input);
            propertyValue = properties.getProperty(name);
        } catch (IOException exception) {
            //logger.debug(exception.toString());
        } finally {
            closeInput(input);
            return propertyValue;
        }
    }

    private void closeInput(InputStream input) {
        try {
            input.close();
        } catch(IOException ex) {
            System.err.println(ex);
        }
    }
}
