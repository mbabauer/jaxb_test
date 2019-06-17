package com.codechimp.test.jaxb.model;

import javax.xml.bind.annotation.*;

@XmlSeeAlso({StringElementWithLabel.class})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ElementWithStringLabel<T> {

    @XmlAttribute(name="label")
    private String label;
    @XmlValue
    private T value;

    public ElementWithStringLabel() {
        this(null);
    }

    public ElementWithStringLabel(T value) {
        this(null, "NEW");
    }

    public ElementWithStringLabel(T value, String label) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
