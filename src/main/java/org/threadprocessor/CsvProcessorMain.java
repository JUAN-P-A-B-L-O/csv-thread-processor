package org.threadprocessor;

import org.threadprocessor.io.OrderDto;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CsvProcessorMain {
    public static void main(String[] args) throws IOException {
        Path amazonCsvFilePath = Path.of("src/main/resources/data/Amazon.csv");

        List<OrderDto> ordersDto = new ArrayList<>();
        int count  = 0;

        try(Scanner amazonCsvScanner = new Scanner(amazonCsvFilePath)){

            for(int i = 0; i < 3 && amazonCsvScanner.hasNextLine(); i++){

                String line = amazonCsvScanner.nextLine();
                if(i==0) continue;

                String[] splitValues = line.split(",");

                if(splitValues.length> 0) {
                    String orderID = splitValues[0];
                    LocalDate orderDate = LocalDate.parse(splitValues[1]);
                    String customerID = splitValues[2];

                    OrderDto orderDto = new OrderDto(orderID, orderDate, customerID );

                    ordersDto.add(orderDto);
                }

                count++;
            }

            System.out.println(count);
            System.out.println(ordersDto);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}