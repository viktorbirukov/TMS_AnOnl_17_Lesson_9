//Домашнее задание 9_2
//Бирюков Виктор
//Этот метод принимает на вход три параметра:
//Login,
//Password,
//confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать
//пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить
//WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен
//содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо
//выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские
//классы исключения с двумя конструкторами – один по умолчанию,
//второй принимает сообщение исключения и передает его в конструктор
//класса Exception.
//Метод возвращает true, если значения верны или false в другом случае

package lesson_9_2;

//Объявление метода исключений

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Ошибка в поле Login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Ошибка в поле Password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
