/**
 * @author - Trent Varnes, Michael Blanco
 * @version - 10/27/2022
 * UserAccount contains the class for a login attempt
 */

public class UserAccount {
    private final String username;
    private final String password;

    // Currently acts as a database that stores username and password
    private final String[][] accounts = {{"TV", "1234"},{"U", "567"}};

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword() {

        return (username.equals(accounts[0][0])) && (password.equals(accounts[0][1]));
    }

}