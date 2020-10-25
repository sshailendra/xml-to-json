package com.dataformat.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "patients")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLRoot
{
    @XmlElement(name="patient")
    private Patient[] patients;

    public Patient[] getPatientArray()
    {
        return patients;
    }
}
