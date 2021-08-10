public class EncryptionDecorator extends DataSourceDecorator{

    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data){
        super.writeData(encode(data));
    }


}
