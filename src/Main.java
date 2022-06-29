import item.Setting;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main extends Setting {

    public static void main(String[] args) throws Exception {
        new Main(args);
    }

    private Main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : showGUI();
        if (path == null || path.isBlank()) throw new Exception("파일이 존재하지 않습니다.");
        if (new File(path).canRead()) throw new Exception("파일을 읽을 수 없습니다.");
        boolean bool = path.toLowerCase(Locale.ROOT).endsWith(".otl");
        bool = bool || path.toLowerCase(Locale.ROOT).endsWith(".otlg");
        if (!bool) throw new Exception("읽을 수 없는 확장자 입니다");

        try(BufferedReader reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                start(line);
            }
        } catch (Exception ignored) {}
    }

    private String showGUI() throws Exception {
        final JFrame frame = new JFrame();
        final String[] extensions = {"otl", "otlg"};
        final JFileChooser chooser = new JFileChooser();
        final FileNameExtensionFilter filter = new FileNameExtensionFilter(".otl .otlg", extensions);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chooser.setFileFilter(filter);
        int open = chooser.showOpenDialog(frame.getParent());
        if (open == JFileChooser.OPEN_DIALOG)
            return chooser.getSelectedFile().getPath();
        else throw new Exception("파일이 존재하지 않습니다.");
    }
}
