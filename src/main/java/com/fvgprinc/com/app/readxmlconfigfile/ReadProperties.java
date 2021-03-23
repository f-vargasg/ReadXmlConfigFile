/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.com.app.readxmlconfigfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author garfi
 */
public class ReadProperties {
    private Properties props;

    public Properties getProps() {
        return props;
    }

    public ReadProperties() throws IOException {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();           
        String propFname = "config.properties.xml";
        InputStream inputStream = loader.getResourceAsStream(propFname);

        if (inputStream != null) {
            props = new Properties();
            props.loadFromXML(inputStream);
        }
        else {
            throw new FileNotFoundException("Property file: " + propFname +
                       " not found in classpath");
        }
    }    
}
