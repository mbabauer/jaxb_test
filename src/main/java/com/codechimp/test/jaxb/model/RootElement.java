package com.codechimp.test.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootElement {

    @XmlElement(name = "valueOne")
    private StringElementWithLabel valueOne;
    @XmlElement(name = "valueTwo")
    private StringElementWithLabel valueTwo;

    public RootElement() { }

    public RootElement(StringElementWithLabel valOne, StringElementWithLabel valTwo) {
        valueOne = valOne;
        valTwo = valTwo;
    }

    public StringElementWithLabel getValueOne() {
        return valueOne;
    }

    public void setValueOne(StringElementWithLabel valueOne) {
        this.valueOne = valueOne;
    }

    public StringElementWithLabel getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(StringElementWithLabel valueTwo) {
        this.valueTwo = valueTwo;
    }
}
