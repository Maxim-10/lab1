package org.dstu;

import org.dstu.domain.IDisplay;
import org.dstu.domain.Monitor;
import org.dstu.domain.TV;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IDisplay> displays = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                displays.add(new Monitor(line));
            } else {
                displays.add(new TV(line));
            }
        }

        displays.forEach(System.out::println);

        SerializeUtils.serialize(displays, binFile);
        List<IDisplay> newDisplays = (List<IDisplay>) SerializeUtils.deserialize(binFile);
        System.out.println("Десериализация:");
        newDisplays.forEach(System.out::println);
    }
}
