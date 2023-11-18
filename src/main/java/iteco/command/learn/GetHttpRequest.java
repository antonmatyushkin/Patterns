package iteco.command.learn;

public class GetHttpRequest implements HttpRequest {

    private String path;

    public GetHttpRequest(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public byte[] getBode() {
        return new byte[0];
    }
}
