import controller.TeacherController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //не хотел парсить мою дату, пришлось добавить форматтер
//        StudentController contStud = new StudentController();
//        contStud.create("Ar", "Ra", "Sa", LocalDate.parse("25.06.1996"));
        TeacherController contTeach = new TeacherController();
        contTeach.create("Антон", "Антонов", "Антонович", LocalDate.parse("06.12.1976", formatter));
        contTeach.create("Витольд", "Витольдов", "Витольдович", LocalDate.parse("12.06.1996", formatter));
        contTeach.getAllTeachers();
        contTeach.edit(1L, "Пахом", "Пахомов","Пахомович");//не срабатывает, я запутался в логгере((
        contTeach.getAllTeachers();
    }
}