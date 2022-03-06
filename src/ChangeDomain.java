public class ChangeDomain {

    public static String changeDomainToDefault(String email){
        return email.substring(0,email.indexOf("@")) + "@ubs.com";
    }

    public static void main (String[] args){
        System.out.println(changeDomainToDefault("laurel.laoang@email.com"));
        System.out.println(changeDomainToDefault("laurfsael.laoang@s.com"));
        System.out.println(changeDomainToDefault("laurrel.laoang@fsf.com"));
        System.out.println(changeDomainToDefault("lauressl.laoang@ss.com"));

    }
}
