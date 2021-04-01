package org.designpatterns;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;

public class ImplementadorArquivoCsv implements Implementador{
	
	private static final String path ="/home/victor-gabriel/eclipse-workspace/list-apsii/src/org/designpatterns/arquivoCSVGerado.csv";
	
	public void gerarArquivo(){
		
        try {
        	System.out.println("Iniciando geração do CSV");
            
            FileWriter fw = new FileWriter(new File(path));
            CSVWriter cw = new CSVWriter(fw);
             
            String[] headers = {"nome" , "email", "telefone"};
             
            List<String[]> data = new ArrayList<String[]>();
            String[] item1 = {"Everton" , "contato@vidadedev.com" , "1234-5678"};
            String[] item2 = {"João" , "joao@vidadedev.com" , "8765-4321"};
            String[] item3 = {"Maria" , "mari@vidadedev.com" , "7856-3412"};
 
            data.add(headers);
            data.add(item1);
            data.add(item2);
            data.add(item3);
             
            cw.writeAll(data);
             
            cw.close();
            fw.close();
             
            System.out.println("Escrita de arquivo finalizado");
             
        }catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}	
