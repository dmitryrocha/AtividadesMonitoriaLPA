package testes;

import javax.xml.bind.DatatypeConverter;
import java.security.*;

public class PasswordMD5 {
    public static void main(String[] args) {
        try {
//            String password = PasswordMD5.toPassword ("NicoleKidman"); // a senha cadastrada
//            System.out.println ("password = " + password);
//            String password2 = PasswordMD5.toPassword ("NicoleKIdman"); // usuário digitou errado
//            System.out.println ("password2 = " + password2);
//            String password3 = PasswordMD5.toPassword ("NicoleKidman"); // usuário digitou certo
//            System.out.println ("password3 = " + password3);
//            if (!password.equals(password2)) {
//                // como a senha não bate...
//                System.out.println ("password2 eh uma senha incorreta");
//            }
//            if (password.equals(password3)) {
//                // como a senha bate...
//                System.out.println ("password3 eh uma senha correta");
//            }
            //dmitry,senha,Dmitry,dmitry@email.com
            String pass = "senha";
            System.out.println("transforma em "+toPassword(pass));
            //usuario,password,Usuário,user@email.com
            pass = "password";
            pass = toPassword(pass);
            System.out.println("transforma em "+pass);
            //profBD,mysql,Carlos Antônio,ca@email.com
            pass = "mysql";
            System.out.println("transforma em "+toPassword(pass));
            //mj,1234,Mario Jorge,mj@email.com
            pass = "1234";
            System.out.println("transforma em "+toPassword(pass));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
//        private static String bytesToHex (byte[] b) {
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < b.length; ++i) {
//            sb.append ((Integer.toHexString((b[i] & 0xFF) | 0x100)).substring(1,3));
//        }
//        return sb.toString();
//    }
//    public static String toPassword (String data) throws NoSuchAlgorithmException {
//        byte[] mybytes = data.getBytes();
//        MessageDigest md5 = MessageDigest.getInstance("MD5");
//        byte[] md5digest = md5.digest (mybytes);
//        return bytesToHex (md5digest);
//    }
    public static String toPassword(String pass) throws NoSuchAlgorithmException {
        //String hash = "35454B055CC325EA1AF2126E27707052";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest);
        return myHash;
    }
}
