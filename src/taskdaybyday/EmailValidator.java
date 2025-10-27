package taskdaybyday;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        // 1. No spaces allowed
        if (email.contains(" ")) return false;

        // 2. Must contain exactly one '@'
        int atIndex = email.indexOf('@');
        if (atIndex == -1) return false; // no '@'
        if (email.indexOf('@', atIndex + 1) != -1) return false; // multiple '@'

        // 3. Local part must not be empty
        String local = email.substring(0, atIndex);
        if (local.length() == 0) return false;

        // 4. Domain part must not be empty and must contain '.'
        String domain = email.substring(atIndex + 1);
        int dotIndex = domain.indexOf('.');
        if (domain.length() == 0 || dotIndex == -1) return false;

        // 5. Domain before and after dot must not be empty
        String domainName = domain.substring(0, dotIndex);
        String domainExt = domain.substring(dotIndex + 1);
        if (domainName.length() == 0 || domainExt.length() == 0) return false;

        return true; // passed all checks
    }

    public static void main(String[] args) {
        String[] emails = {
            "test@example.com",
            "user.name@mail.co",
            "@example.com",
            "user@.com",
            "user@domain",
            "user@@domain.com",
            "user name@example.com"
        };

        for (String email : emails) {
            System.out.println(email + " -> " + isValidEmail(email));
        }
    }
}
