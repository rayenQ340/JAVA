import java.util.regex.Pattern;

public class IPAddressValidator {
    private static final String IPV4_REGEX =
            "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

    private static final Pattern IPV4_PATTERN = Pattern.compile(IPV4_REGEX);

    public static boolean isValidIP(String ip) {
        return IPV4_PATTERN.matcher(ip).matches();
    }
}
