public class ChangeDomain {

    public static String changeDomain(String email){
        int i = email.indexOf("@");

        return email.substring(0,i) + "@ubs.com";
    }

    public static void main (String[] args){
        System.out.println(changeDomain("laurel.laoang@email.com"));
        System.out.println(changeDomain("laurfsael.laoang@s.com"));
        System.out.println(changeDomain("laurrel.laoang@fsf.com"));
        System.out.println(changeDomain("lauressl.laoang@ss.com"));

    }
}
