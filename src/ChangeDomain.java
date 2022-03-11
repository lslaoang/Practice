public class ChangeDomain {

    public static String changeDomainToDefault(String email){

        final String UBSDEV = "ubsdev.com";
        final String UBSTEST = "ubstest.com";
        final String UBSPROD = "@ubs.com";
//        return email.substring(0,email.indexOf("@")) + "@ubs.com";
        String emailDomain = email.substring(email.indexOf("@") + 1);
        String idArea = email.substring(0,email.indexOf("@"));
        if(emailDomain.equals(UBSDEV) || emailDomain.equals(UBSTEST)){
            System.out.println("The domain is: " +  emailDomain);
            return idArea + UBSPROD;
        }
        return email;
       // return email.substring(email.indexOf("@")) + "@ubs.com";
    }

    public static void main (String[] args){
        System.out.println(changeDomainToDefault("laurel.laoang@ubstest.com"));
       // System.out.println(changeDomainToDefault("laurfsael.laoang@s.com"));
        System.out.println(changeDomainToDefault("laurrel.laoang@ubsdev.com"));
        //System.out.println(changeDomainToDefault("lauressl.laoang@ss.com"));

        System.out.println(changeDomainToDefault("laurel.laoang@ubstests.com"));

        System.out.println(Long.toHexString(System.currentTimeMillis()));

    }
}
