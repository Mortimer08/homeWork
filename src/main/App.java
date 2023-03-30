

import java.io.IOException;

import mvp.Model;
import mvp.Presenter;
import mvp.View;
import com.google.code.gson;

public class App {
    public static void main(String[] args) throws IOException {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(view, model);
        view.start();
    }
}
