package com.dataformat.object;

import com.dataformat.adapter.AgeAdapter;
import com.dataformat.adapter.GenderAdapter;
import com.dataformat.adapter.StateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class Patient
{
    @XmlElement(name = "id")
    private  long patientId;

    @XmlElement(name = "gender")
    @XmlJavaTypeAdapter(GenderAdapter.class)
    private  String sex;

    @XmlElement(name = "state")
    @XmlJavaTypeAdapter(StateAdapter.class)
    private String state;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "dateOfBirth")
    @XmlJavaTypeAdapter(AgeAdapter.class)
    private Integer age;

    public long getPatientId() {
        return patientId;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return getPatientId() == patient.getPatientId() &&
                Objects.equals(getAge(), patient.getAge()) &&
                Objects.equals(getName(), patient.getName()) &&
                Objects.equals(getSex(), patient.getSex()) &&
                Objects.equals(state, patient.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(), getAge(), getName(), getSex(), state);
    }
}
