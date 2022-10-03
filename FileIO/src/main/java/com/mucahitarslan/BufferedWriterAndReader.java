package com.mucahitarslan;

import java.io.*;

public class BufferedWriterAndReader {

    public static void bufferedWriterAndReader()
    {
        File mySecondFile = new File("buffer.txt");
        try {
            //FileWriter buffer = new FileWriter(mySecondFile);
            //BufferedWriter bufferedWriter = new BufferedWriter(buffer);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mySecondFile));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(mySecondFile));
            //FileReader reader = new FileReader(mySecondFile);
            //BufferedReader bufferedReader = new BufferedReader(reader);

            bufferedWriter.write("Buffered Writer And Reader Example");
            bufferedWriter.newLine();
            bufferedWriter.append("------");
            bufferedWriter.flush();

            for (int i = 0 ; i < 5; i++)
                System.out.println((char) bufferedReader.read());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            bufferedWriter.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
