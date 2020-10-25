package com.dataformat.reader;

import com.dataformat.object.XMLRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class XMLReader {

    public static XMLRoot read(String xmlFilePath) throws IOException, URISyntaxException, JAXBException {
        URL resource = XMLReader.class.getClassLoader().getResource("patient.xml");
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        } else {

            File xml = new File(resource.toURI());
            JAXBContext context = JAXBContext.newInstance(XMLRoot.class);
            return  (XMLRoot) context.createUnmarshaller()
                    .unmarshal(new FileReader(xml));


        }
    }
}
