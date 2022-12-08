package account;

import Prhotel.MenuHotel;
import iO.ReadAndWriteAccount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAccount implements Serializable {
    private static final Scanner scanner = new Scanner(System.in);
    public static List<Account> accountList = new ArrayList<>();

    public void disPlay() {
        System.out.println("DisPlay :");
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i).toString());
        }
    }

    public String inputUsername() {
        System.out.println("Input userName :");
        String userName = scanner.nextLine();
        return userName;
    }

    public String inputPassword() {
        System.out.println("Input passWord :");
        String passWord = scanner.nextLine();
        return passWord;
    }

    public boolean checkByAccount(String userName, String passWord) {
        boolean check = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (userName.equals(accountList.get(i).getUsername()) && passWord.equals(accountList.get(i).getPassword())) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void loginAccount() {
        System.err.println("Longin :");
        String user = inputUsername();
        String pass = inputPassword();
        if (checkByAccount(user, pass)) {
            System.err.println("Logged in successfully.");
            int index = indexAccount(user);
            if (accountList.get(index).isAdmin()) {
                MenuHotel admin = new MenuHotel();
                admin.Menu();
                ReadAndWriteAccount.writeFiles();
            } else {
                MenuUser.userName = user;
                MenuUser menuUser = new MenuUser();
                menuUser.menuUser();
            }

        } else {
            System.out.println("Wrong account or password :");
            System.out.println("Please enter.");
        }
    }

    public int indexAccount(String userName) {
        int index;
        index = -1;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUsername().equals(userName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void registerAccount() {
        System.err.println("Register :");
        String username = inputUsername();
        String password = inputPassword();
        if (indexAccount(username) == -1) {
            Account newAcc = new Account(username, password);
            System.err.println("CreatAdmin :");
            if (scanner.nextLine().equals("bonbon")) {
                newAcc.setAdmin(true);
            }
            accountList.add(newAcc);
            ReadAndWriteAccount.writeFiles();
            System.err.println("Register successful :");
        } else {
            System.err.println("Account already exists :");
        }

    }

    public void changePassword(String userName) {

        boolean isExitPassWord = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUsername().equals(userName)) {
                isExitPassWord = true;
                System.out.println("Enter your new password :");
                String pass = scanner.nextLine();
                accountList.get(i).setPassword(pass);
                ReadAndWriteAccount.writeFiles();
                break;
            }
        }
        if (!isExitPassWord) {
            System.out.println("Account or PassWord do not exit :");
        }

    }


}

