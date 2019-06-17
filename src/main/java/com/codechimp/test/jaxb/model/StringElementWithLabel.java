package com.codechimp.test.jaxb.model;

public class StringElementWithLabel extends ElementWithLabel<String> {
    public StringElementWithLabel() {
        super();
    }

    public StringElementWithLabel(String value) {
        super(value);
    }

    public StringElementWithLabel(String value, Label label) {
        super(value, label);
    }

    @Override
    public String getValueAsString() {
        return this.value;
    }
}
