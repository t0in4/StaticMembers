package staticmember;
import java.util.Date;

public class OtherClass {
    // переменная в которой хранится дата последнего создания
    // объекта класса
    public static Date lastCreated;

    // конструктор пишет дату последнего создания объекта класса
    public OtherClass() {
        lastCreated = new Date();
    }
    public static void main(String[] args) {

    }
}
