package inf;

public interface Create {
    String buttonNull = "버튼이 Null 입니다.";
    String checkBoxNull = "체크박스가 Null 입니다.";
    String frameNull = "프레임이 Null 입니다.";
    String labelNull = "라벨이 Null 입니다.";
    String textFieldNull = "텍스트필드가 Null 입니다.";
    String passwordFieldNull = "페스워드필드가 Null 입니다.";

    void setText(String text);
    void create(String text);
    void create();
    boolean check(String line);
}
