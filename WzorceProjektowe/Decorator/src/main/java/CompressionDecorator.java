public class CompressionDecorator extends DataSourceDecorator{
    private int complevel = 6;

    public CompressionDecorator(DataSource source) {
        super(source);
    }
}
