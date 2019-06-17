package com.codechimp.test.jaxb.model;

import javax.xml.bind.annotation.*;

@XmlSeeAlso({StringElementWithLabel.class})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ElementWithLabel<T> {

    @XmlAttribute(name="label")
    private Label label;
    @XmlValue
    private T value;

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

    public Label getLabel() {
        return label;
    }

    public String getLabelAsString() {
        return label.name();
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
