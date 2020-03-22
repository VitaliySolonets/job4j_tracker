package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("The user is not found");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("The user is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Vitaly Solonets", true)
            };
            User user = findUser(users, "Vitaly Solonets");
            if (validate(user)) {
                System.out.println("This user has an access.");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
