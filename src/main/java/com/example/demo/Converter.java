package com.example.demo;

import org.jodconverter.OfficeDocumentConverter;
import org.jodconverter.office.OfficeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by lhq-mint on 17-5-27.
 */
@Component
public class Converter {
    @Autowired
    private OfficeDocumentConverter converter;

    public void test(){
        final File inputFile = new File("/home/lhq-mint/JavaProjects/test.xlsx");
        final File outputFile = new File("/home/lhq-mint/JavaProjects/test.csv");

        try{converter.convert(inputFile, outputFile);
    }catch (OfficeException e){
            System.out.print(e);
        }
    }
}
