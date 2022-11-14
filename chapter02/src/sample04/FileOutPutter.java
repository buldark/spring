package sample04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//결과의 내용을 파일로 출력
public class FileOutPutter implements Outputter {
private String filePath,fileName;


	public void setFilePath(String filePath) {
		System.out.println("setFilePath(String filePath)");
		this.filePath = filePath;
}


public void setFileName(String fileName) {
	System.out.println("setFileName(String fileName)");
	this.fileName = fileName;
}


	@Override
	public void output(String message) {
		System.out.println("output(String message)");
		
		try {
			FileWriter fileWriter = new FileWriter(new File(filePath,fileName));
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
