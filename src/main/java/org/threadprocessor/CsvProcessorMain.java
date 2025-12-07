package org.threadprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CsvProcessorMain {
    public static void main(String[] args) throws IOException {
        Path amazonCsvFilePath = Path.of("src/main/resources/data/Amazon.csv");

        try(Scanner amazonCsvScanner = new Scanner(amazonCsvFilePath)){
            for(int i = 0; i < 10 && amazonCsvScanner.hasNextLine(); i++){
                System.out.println(amazonCsvScanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}