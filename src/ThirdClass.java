import java.util.Date;

public class ThirdClass {
    // переменная в которой хранится дата последнего создания
    // объекта класса
    public static Date lastCreated;

    // конструктор пишет дату последнего создания объекта класса
    public ThirdClass() {
        lastCreated = new Date();
    }
}
