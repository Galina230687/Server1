import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) throws IOException {
        final var server = new Server(port);
        server = new Server(9999);

        // код инициализации сервера (из вашего предыдущего ДЗ)

        // добавление хендлеров (обработчиков)
        server.addHandler("GET", "/messages", new Handler() {
            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });
        server.addHandler("POST", "/messages", new Handler() {
            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });

        server.listen(9999);
    }
}
