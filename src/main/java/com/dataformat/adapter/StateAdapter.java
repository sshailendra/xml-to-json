package com.dataformat.adapter;

import com.dataformat.object.State;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StateAdapter extends XmlAdapter<String, String>
{
    @Override
    public String unmarshal(String state) throws Exception {
        return State.valueOfName(state).getAbbreviation();
    }

    @Override
    public String marshal(String state) throws Exception {
        return null;
    }
}
