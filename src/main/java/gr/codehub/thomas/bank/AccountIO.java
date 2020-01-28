package gr.codehub.thomas.bank;

import org.json.JSONObject;
import java.util.List;

public class AccountIO {
    public static void saveAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            JSONObject object = new JSONObject(account);
        }
    }
}
