package com.codechimp.test.jaxb;

import com.codechimp.test.jaxb.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main {
    public static void main(String args[]) {
        RootElement test = new RootElement(new StringElementWithLabel("test1", Label.OLD), new StringElementWithLabel("test2", Label.NEW));

        try {
            System.out.println("Trying RootElement");
            JAXBContext context = JAXBContext.newInstance(RootElement.class);
            StringWriter writer = new StringWriter();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(test, writer);

            System.out.println(writer.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }

        RootElementStrings test2 = new RootElementStrings(new StringElementWithStringLabel("test1", "OLD"), new StringElementWithStringLabel("test2", "NEW"));

        try {
            System.out.println("Trying RootElementStrings");
            JAXBContext context = JAXBContext.newInstance(RootElementStrings.class);
            StringWriter writer = new StringWriter();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(test2, writer);

            System.out.println(writer.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
