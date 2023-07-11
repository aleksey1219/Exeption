public class Validator {
    public static void valid(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException("Некорректный логин");
            }
            if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Некоректный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}

