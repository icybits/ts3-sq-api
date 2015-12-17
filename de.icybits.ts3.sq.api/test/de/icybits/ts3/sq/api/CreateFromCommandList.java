package de.icybits.ts3.sq.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import de.icybits.ts3.sq.api.basic.Command;

/**
 * @author Iceac
 *
 */
public class CreateFromCommandList {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File permFile = new File("commandlist");
		FileReader reader = new FileReader(permFile);
		BufferedReader buffReader = new BufferedReader(reader);
		buffReader.lines().forEachOrdered(line -> {
			String[] split = line.split("\\|");
			String comname = split[0].trim();
			String comdesc = split[1].trim();
			char[] comarray = comname.toCharArray();
			if(comarray.length > 0)
			comarray[0] = Character.toUpperCase(comarray[0]);
			String comnameUpper = new String(comarray);
			File javaFile = new File(comnameUpper + "Command.java");
			try {
				FileWriter writer = new FileWriter(javaFile);
			try (BufferedWriter buffWriter = new BufferedWriter(writer);) {
			buffWriter.write("package de.icybits.ts3.sq.api.commands;\nimport de.icybits.ts3.sq.api.basic.Command;\nimport de.icybits.ts3.sq.api.interfaces.ITS3CommandNames;\n/**\n* " + comdesc + "\n@author Iceac\n*/\npublic class " + comnameUpper + "Command extends Command implements ITS3CommandNames {\n");
			buffWriter.write("public " + comnameUpper + "Command() {\nsuper(COMMAND_" + comname.toUpperCase() + ");\n}\n}");
			} catch (Exception e) {
				e.printStackTrace();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		});
		buffReader.close();
	}

}
