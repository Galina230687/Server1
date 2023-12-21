import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public interface Handler {

    static void handle(Request request, BufferedOutputStream responseStream) throws IOException {

    }
        //Handler — функциональный интерфейс всего с одним методом. Он может быть заменён на lambda
}
