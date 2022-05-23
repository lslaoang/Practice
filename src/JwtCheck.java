public class JwtCheck {

    public static boolean isJwt(String jwt){
        String jwtRegex = "^[\\w-]+\\.[\\w-]+\\.[\\w-]+$";
        return jwt.matches(jwtRegex);
    }

    public static void main(String[] args){
        System.out.println(isJwt("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9.dyt0CoTl4WoVjAHI9Q_CwSKhl6d_9rhM3NrXuJttkao"));
    }
}
