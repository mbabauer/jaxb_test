package com.codechimp.test.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootElementStrings {

    @XmlElement(name = "valueOne")
    private StringElementWithStringLabel valueOne;
    @XmlElement(name = "valueTwo")
    private StringElementWithStringLabel valueTwo;

    public RootElementStrings() { }

    public RootElementStrings(StringElementWithStringLabel valOne, StringElementWithStringLabel valTwo) {
        valueOne = valOne;
        valTwo = valTwo;
    }

    public StringElementWithStringLabel getValueOne() {
        return valueOne;
    }

    public void setValueOne(StringElementWithStringLabel valueOne) {
        this.valueOne = valueOne;
    }

    public StringElementWithStringLabel getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(StringElementWithStringLabel valueTwo) {
        this.valueTwo = valueTwo;
    }
}
