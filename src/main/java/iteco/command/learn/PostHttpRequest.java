package iteco.command.learn;

public class PostHttpRequest implements HttpRequest {

    private String path;
    private byte[] body;

    public PostHttpRequest(String path, byte[] body) {
        this.path = path;
        this.body = body;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public byte[] getBode() {
        return body;
    }
}
