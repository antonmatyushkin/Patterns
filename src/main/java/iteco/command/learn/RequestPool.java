package iteco.command.learn;

import java.util.ArrayList;

public class RequestPool {

    private ArrayList<HttpRequest> requests;

    public RequestPool(ArrayList<HttpRequest> requests) {
        this.requests = requests;
    }

    public void addRequest(HttpRequest request) {
        requests.add(request);
    }

    public void send() {

        if (requests.size() == 0) {
            return;
        }

        HttpRequest request = requests.remove(requests.size() - 1);
        sendRequest(request);

    }

    private boolean sendRequest(HttpRequest request) {
        // Some logic
        return true;
    }

}
