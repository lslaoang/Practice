public class RegexImplementation {
    static final String UBSDEV = "ubsdev.com";
    static final String UBSTEST = "ubstest.com";
    static final String UBSPROD = "@ubs.com";

    static final String UBS_DEV_TEST_REGEX = "ubs(dev|test)\\.com$";
    static final String UBS_PROD = "ubs.com";


    public static String changeDomainToDefault(String email) {

        String emailDomain = email.substring(email.indexOf("@") + 1);
        String idArea = email.substring(0, email.indexOf("@"));
        if (emailDomain.equals(UBSDEV) || emailDomain.equals(UBSTEST)) {
            System.out.println("The domain is: " + emailDomain);
            return idArea + UBSPROD;
        }
        return email;
    }

    public static String changeDomainToDefaultRegex(String email) {

        email = email.replaceAll(UBS_DEV_TEST_REGEX, UBS_PROD);
        return email;
    }

    public static String removePunctuationSpace(String word) {
        return word.replaceAll("\\p{Punct}|\\s", "");
    }

    public static String getPropertyValue(String property) {
        return property.substring(property.indexOf(":") + 1, property.indexOf("}"));
    }

    private static void validateVersionFormat(String version) {
        final String VALID_VERSION_REGEX = "^[1-9]\\d*(\\.[0-9]\\d*){0,2}$";
        if (!version.matches(VALID_VERSION_REGEX)) {
//            throw new RuntimeException("Version format is not valid.");
            System.out.println("Not valid");
        } else {
            System.out.println("Valid format");
        }

    }

    public static void main(String[] args) {
//        System.out.println(changeDomainToDefault("laurel.laoang@ubstest.com"));
//        System.out.println(changeDomainToDefault("laurrel.laoang@ubsdev.com"));
//        System.out.println(changeDomainToDefault("laurel.laoang@ubstests.com"));
//
//        System.out.println(changeDomainToDefaultRegex("laurel.laoang@ubstest.com"));
//        System.out.println(changeDomainToDefaultRegex("laurel.laoang@ubsdev.com"));
//        System.out.println(removePunctuationSpace("{\"letterId\":\"somethingHere\"}"));
//        System.out.println(getPropertyValue("{\"letterId\":\"somethingHere-sS\"}"));

        validateVersionFormat("99.99.0999");
    }
}
