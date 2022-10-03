package com.mucahitarslan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterAndReader {

    public static void fileWriterAndReader()
    {
        File myFile = new File("file.txt");
        try {
            myFile.createNewFile();

            Scanner fileReader = new Scanner(myFile);
            FileWriter fileWriter = new FileWriter(myFile);

            fileWriter.write("File Writer Example");
            fileWriter.write("\n--------");
            fileWriter.flush();

            while (fileReader.hasNext())
                System.out.println(fileReader.next());

            fileReader.close();
            fileWriter.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
