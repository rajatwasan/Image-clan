package uniqueimages;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text, Text, Text, Text> {

	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

		String imageFilePath = "";

		for (Text filePath : values) {

			imageFilePath = imageFilePath + "||" + filePath.toString();
		}
		context.write(new Text(imageFilePath), key);
	}
}