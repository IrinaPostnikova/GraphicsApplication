package com.company.figures;

import com.company.factory.FigureCreator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

@JsonAutoDetect

public class Json {


    public static void writeToFileJson(ArrayList<Figure> allFigures, String fileName) throws IOException {


//        StringWriter writer=new StringWriter();
//        ObjectMapper mapper=new ObjectMapper();
//        for (var f:allFigures){
//            mapper.writeValue(writer,f);
//
//        }
//        System.out.println(writer.toString());


        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));
        for (var fig : allFigures) {
            mapper.writeValue(writer, fig);
            writer.write("\n");
        }
        bWriter.write(writer.toString());
        bWriter.close();
        System.out.println("zapisano");
    }
    public static ArrayList<Figure> readFromFileJson (String filename) throws IOException {
        ArrayList<Figure> listFigures = new ArrayList<Figure>();
        BufferedReader bReader =new BufferedReader(new FileReader(filename));
        ObjectMapper oMapper =new ObjectMapper();
        String json;
        while ((json= bReader.readLine() )!=null) {
            listFigures.add(oMapper.readValue(json, Figure.class));
        }
        bReader.close();
        System.out.println("schitano");
        return listFigures;
        }

    }



