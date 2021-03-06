package ang.generator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import de.uni_koeln.spinfo.ang.utils.FileUtils;

public class ToText {

	private List<String> text;

	@SuppressWarnings("unchecked")
	public void writeToText(String input) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(FileUtils.outputPath
				+ input);
		ObjectInputStream ois = new ObjectInputStream(fis);
		text = (List<String>) ois.readObject();
		ois.close();

		StringBuilder sb = new StringBuilder();
		sb.append(" \n ");
		for (String string : text) {
			sb.append(string);
			sb.append("\n");
		}

		ObjectOutputStream outputStream = new ObjectOutputStream(
				new FileOutputStream(FileUtils.outputPath
						+ "/generator/" + input + ".txt"));
		outputStream.writeObject(sb.toString());
		outputStream.close();

	}

}
