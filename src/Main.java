import java.io.File;
import java.util.Locale;

public class Main {

    private Main(String[] args) throws Exception {
        if (args.length < 1) throw new Exception("파일이 존재하지 않습니다.");

        String path = args[0];
        if (new File(path).canRead()) throw new Exception("파일을 읽을 수 없습니다.");
        boolean bool = path.toLowerCase(Locale.ROOT).endsWith(".otl");
        bool = bool || path.toLowerCase(Locale.ROOT).endsWith(".otlg");
        if (!bool) throw new Exception("읽을 수 없는 확장자 입니다");
    }

    public static void main(String[] args) {
        try {
            new Main(args);
        } catch (Exception e) {
            String error = e.getMessage();

        }
    }
}
