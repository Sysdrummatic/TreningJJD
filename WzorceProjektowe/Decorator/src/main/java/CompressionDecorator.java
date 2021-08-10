public class CompressionDecorator extends DataSourceDecorator{
    private int compressionLevel = 6;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }


    public void setCompressionLevel(int value) {
        this.compressionLevel = value;
    }

    @Override
    public void writeData(String data){
        super.writeData(compress(data));
    }

    @Override
    public String readData(String data){
        return decompress(super.readData());
    }


}
