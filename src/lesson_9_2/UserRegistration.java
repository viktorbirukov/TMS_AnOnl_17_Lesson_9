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



//В этом коде registerUser метод принимает логин, пароль и подтверждение пароля,
// выполняет проверки с помощью validateLogin и validatePassword,
// и перехватывает исключения WrongLoginException

public class UserRegistration {
    public static boolean registerUser(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелы");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, не должен содержать пробелы и должен содержать хотя бы одну цифру");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и Confirm Password не совпадают");
        }
    }

    public static void main(String[] args) {
        String login = "validLogin";
        String password = "ValidPassword_1";
        String confirmPassword = "ValidP_ssword_1";

        if (registerUser(login, password, confirmPassword)) {
            System.out.println("Регистрация прошла успешно.");
        } else {
            System.out.println("Регистрация не удалась.");
        }
    }
}