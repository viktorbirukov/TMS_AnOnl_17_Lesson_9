//Домашнее задание 9_1
//Бирюков Виктор
//Создать свои классы
//исключений на каждую ситуацию:
//- Проверить содержит ли номер документа последовательность abc.
//- Проверить начинается ли номер документа с последовательности 555.
//- Проверить заканчивается ли номер документа на последовательность
//1a2b.
//Если номер документа не удовлетворяет условию - то "бросить"
//исключение.
//В методе класса, в котором будут вызываться эти методы для
//демонстрации работы, перехватить исключение конструкцией try-catch и в
//блоке catch вывести сообщение для пользователя (сообщение на
//консоль).

package lesson_9_1;

//Создание класса, в котором будут методы для проверки номера документа и перехвата исключений
public class Doc_Proverka_1 {
    private String docNumber;

    public Doc_Proverka_1(String docNumber) {
        this.docNumber = docNumber;
    }

    public void startsWith555() throws StartsWith555Exception {
        if (!docNumber.startsWith("555")) {
            throw new StartsWith555Exception(docNumber);
        }
    }


    public void Doc_Proverka_1() {
        try {
            startsWith555();
            System.out.println("Номер документа '" + docNumber + "' удовлетворяет всем условиям");
        } catch (StartsWith555Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String docNumber = "555";
        Doc_Proverka_1 validator = new Doc_Proverka_1(docNumber);
        validator.Doc_Proverka_1();
    }
}
