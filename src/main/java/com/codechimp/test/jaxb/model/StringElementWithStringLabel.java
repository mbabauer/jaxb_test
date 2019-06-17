package com.codechimp.test.jaxb.model;

public class StringElementWithStringLabel<T> extends ElementWithStringLabel<String> {
    public StringElementWithStringLabel() {
        super();
    }

    public StringElementWithStringLabel(String value) {
        super(value);
    }

    public StringElementWithStringLabel(String value, String label) {
        super(value, label);
    }
}
