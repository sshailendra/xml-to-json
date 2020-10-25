package com.dataformat.app;

import com.dataformat.object.XMLRoot;
import com.dataformat.reader.XMLReader;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URISyntaxException;

public class XMLToJSONConverter
{
    public static String convert(String xmlFilePath) throws IOException, JAXBException, URISyntaxException
    {
        XMLRoot root = XMLReader.read(xmlFilePath);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString =  mapper.writeValueAsString(root.getPatientArray());

        return jsonString;
    }
}
