package dya07;

import java.io.*;

//FileReader, FileWriter, BufferedReader, BufferedWriter
public class FileCopyAndConsoleOut {

	public static void main(String[] args) {

		String fileName = "cpy.txt";

		try {
			FileReader fr = new FileReader("FileOut.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);

			int n = 0;

			while ((n = br.read()) != -1) {

				bw.write(n);
				bw.flush();
				osw.write(n);
				osw.flush();

			}
			osw.close();
			br.close();
			bw.close();

		} catch (Exception e) {

		}
	}
}
