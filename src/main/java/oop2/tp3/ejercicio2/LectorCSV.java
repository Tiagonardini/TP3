package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    private String csvPath;

    public LectorCSV (String csvPath){
        this.csvPath = csvPath;
    }
    public List<String[]> createList() throws IOException {
        List<String[]> data = new ArrayList<String[]>();
        CSVReader reader = new CSVReader(new FileReader(csvPath));
        String[] row = null;

        while ((row = reader.readNext()) != null) {
            data.add(row);
        }

        reader.close();
        data.remove(0);
        return data;
    }
}
