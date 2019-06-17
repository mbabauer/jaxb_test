package com.codechimp.test.jaxb.model;

import javax.xml.bind.annotation.*;

@XmlSeeAlso({StringElementWithLabel.class})
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ElementWithLabel<T> {

    @XmlAttribute(name="label")
    protected Label label;
    @XmlTransient
    protected T value;

    public ElementWithLabel() {
        this(null);
    }

    public ElementWithLabel(T value) {
        this(null, Label.NEW);
    }

    public ElementWithLabel(T value, Label label) {
        this.label = label;
        this.value = value;
    }

    @XmlValue
    public abstract String getValueAsString();

    public String getLabelAsString() {
        return label.name();
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
