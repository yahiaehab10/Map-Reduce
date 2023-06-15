import java.io.IOException;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class SalariesMapper extends Mapper<LongWritable, Text, Text, FloatWritable> {

    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] words = line.split(",");
        Text jobText = new Text(words[1]); // task 2 bdal 3 hatkteb 1
        FloatWritable one = new FloatWritable(Float.parseFloat(words[2]));

        context.write(jobText, one);
    }
}
