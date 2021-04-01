package org.designpatterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImplementadorArquivoTxt implements Implementador {
	private static final String textoEscrito = "Texto que sera escrito.";
	
	public void gerarArquivo() {
		try {
			FileWriter arquivo = new FileWriter(new File("/home/victor-gabriel/eclipse-workspace/list-apsii/src/org/designpatterns/ArquivoTexto.txt"));
			arquivo.write(textoEscrito);
			arquivo.close();
			System.out.println("Escrita de arquivo finalizado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
