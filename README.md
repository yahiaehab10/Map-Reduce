# Salaries MapReduce

This is a MapReduce program written in Java for calculating average salaries using Hadoop. The program takes input data, processes it using the MapReduce framework, and produces the average salary for each job category.

## Prerequisites

To run this program, you need to have the following:

- Hadoop installed and configured
- Java Development Kit (JDK) installed
- Apache Maven installed (for building the project)

## Usage

Follow the steps below to run the Salaries MapReduce program:

1. Clone the repository or download the source code.

2. Build the project using Maven. LauchJSON is used to run the program

3. Upload your input data to Hadoop's HDFS (Hadoop Distributed File System).

4. Run the program using the `hadoop jar` command. Replace `<input-path>` and `<output-path>` with the appropriate paths in HDFS.

   ```
   hadoop jar target/salaries-mapreduce.jar Salaries <input-path> […] <output-path>
   ```

   Note: If you are running Hadoop in a pseudo-distributed mode or on a single-node cluster, you can use the local file system path instead of HDFS paths.

5. After the job completes, you can view the output in the specified output directory.

## Program Structure

The Salaries MapReduce program consists of the following Java classes:

- `Salaries`: This class contains the main method and sets up the MapReduce job configuration.
- `SalariesMapper`: This class is the mapper implementation, which processes each input record and emits a job category and salary pair.
- `SalariesReducer`: This class is the reducer implementation, which calculates the average salary for each job category.

## Contributing

Contributions to this project are welcome. If you find any issues or want to add new features, please create an issue or submit a pull request.
