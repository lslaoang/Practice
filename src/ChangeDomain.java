public class ChangeDomain {

    public static String changeDomain(String email){
        return email.substring(0,email.indexOf("@")) + "@ubs.com";
    }

    public static void main (String[] args){
        System.out.println(changeDomain("laurel.laoang@email.com"));
        System.out.println(changeDomain("laurfsael.laoang@s.com"));
        System.out.println(changeDomain("laurrel.laoang@fsf.com"));
        System.out.println(changeDomain("lauressl.laoang@ss.com"));

    }
}
