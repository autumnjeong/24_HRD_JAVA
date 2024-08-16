package dya07;

import java.io.*;

public class FileOut {
//키보드로 입력받고 파일로 출력하기
	// 파일이름: result.txt
	public static void main(String[] args) {
		System.out.println("파일로 저장할 내용을 입력하세요 =>");
		int n = 0;
		try {
			FileOutputStream fos = new FileOutputStream("Test.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileReader fr = new FileReader("Test.txt");
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			while ((n = fr.read()) != -1) {

				osw.write(n);
				osw.flush();
			}
			osw.close();
			fos.close();
			bos.close();
		} catch (FileNotFoundException fd) {

		} catch (IOException e) {
			e.getMessage();
		}

	}

}