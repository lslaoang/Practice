public class ChangeDomain {
    static final String UBSDEV = "ubsdev.com";
    static final String UBSTEST = "ubstest.com";
    static final String UBSPROD = "@ubs.com";

    static final String UBS_DEV_TEST_REGEX = "ubs(dev|test)\\.com$";
    static final String UBS_PROD = "ubs.com";


    public static String changeDomainToDefault(String email) {


//        return email.substring(0,email.indexOf("@")) + "@ubs.com";
        String emailDomain = email.substring(email.indexOf("@") + 1);
        String idArea = email.substring(0, email.indexOf("@"));
        if (emailDomain.equals(UBSDEV) || emailDomain.equals(UBSTEST)) {
            System.out.println("The domain is: " + emailDomain);
            return idArea + UBSPROD;
        }
        return email;
        // return email.substring(email.indexOf("@")) + "@ubs.com";
    }

    public static String changeDomainToDefaultRegex(String email) {

        email = email.replaceAll(UBS_DEV_TEST_REGEX, UBS_PROD);
        return email;
    }

    public static void main(String[] args) {
        System.out.println(changeDomainToDefault("laurel.laoang@ubstest.com"));
        System.out.println(changeDomainToDefault("laurrel.laoang@ubsdev.com"));


        System.out.println(changeDomainToDefault("laurel.laoang@ubstests.com"));

        System.out.println(changeDomainToDefaultRegex("laurel.laoang@ubstest.com"));
        System.out.println(changeDomainToDefaultRegex("laurel.laoang@ubsdev.com"));

    }
}
