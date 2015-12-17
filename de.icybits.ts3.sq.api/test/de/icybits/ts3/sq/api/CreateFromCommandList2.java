package de.icybits.ts3.sq.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Iceac
 *
 */
public class CreateFromCommandList2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File javaFile = new File("ITS3CommandNames");
		File permFile = new File("commandlist");
		FileWriter writer = new FileWriter(javaFile);
		FileReader reader = new FileReader(permFile);
		BufferedWriter buffWriter = new BufferedWriter(writer);
		BufferedReader buffReader = new BufferedReader(reader);
		buffReader.lines().forEachOrdered(line -> {
			String[] split = line.split("\\|");
			String comname = split[0].trim();
			try {
				buffWriter.write("public static final String COMMAND_" + comname.toUpperCase() + " = \"" + comname.toLowerCase() + "\";\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		buffReader.close();
		buffWriter.close();
	}

}
