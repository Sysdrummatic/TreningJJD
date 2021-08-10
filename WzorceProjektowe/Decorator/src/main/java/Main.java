public class Main {

    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encode = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));

        encode.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded ----------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ----------------");
        System.out.println(encode.readData());
    }

}
