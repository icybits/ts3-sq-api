package de.icybits.ts3.sq.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import de.icybits.ts3.sq.api.util.Util;

/**
 * @author Iceac
 *
 */
public class CreateEnumFromPermList {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File javaFile = new File("Permissions.java");
		File permFile = new File("permissionlist");
		FileReader reader = new FileReader(permFile);
		FileWriter writer = new FileWriter(javaFile);
		BufferedReader buffReader = new BufferedReader(reader);
		BufferedWriter buffWriter = new BufferedWriter(writer);
		buffWriter.write("package de.icybits.ts3.sq.api.enums;\npublic enum Permissions {\n");
		buffReader.lines().forEachOrdered(line -> {
			String[] split = line.split(" ");
			String permid = split[0].substring(split[0].indexOf("=") + 1);
			String permname = split[1].substring(split[1].indexOf("=") + 1);
			String permdesc = split[2].indexOf("=") > -1 ? split[2].substring(split[2].indexOf("=") + 1) : "";
			try {
				buffWriter.write(permname.toUpperCase() + "(" + permid + ", \"" + Util.fromTS3String(permdesc) + "\"),\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		buffWriter.write("}");
		buffReader.close();
		buffWriter.close();
	}

}
