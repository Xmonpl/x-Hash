package cf.xmon.hasher;

import org.jetbrains.annotations.NotNull;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class xmonHash {
    public static void main(String[] args){
        System.out.println("              #     #                      \n" +
                " #    #       #     #   ##    ####  #    # \n" +
                "  #  #        #     #  #  #  #      #    # \n" +
                "   ##   ##### ####### #    #  ####  ###### \n" +
                "   ##         #     # ######      # #    # \n" +
                "  #  #        #     # #    # #    # #    # \n" +
                " #    #       #     # #    #  ####  #    # \n" +
                "                                           ");
        System.out.println("by Xmon " + ColorAnsi.ANSI_RED + "❤" + ColorAnsi.ANSI_RESET);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }
        if (args[0].equalsIgnoreCase("sha512")){
            System.out.println("Your sha512 hash is: " + ColorAnsi.ANSI_CYAN + sha512(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("sha256")){
            System.out.println("Your sha256 hash is: " + ColorAnsi.ANSI_CYAN + sha256(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("md5")){
            System.out.println("Your md5 hash is: " + ColorAnsi.ANSI_CYAN + md5(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("sha224")){
            System.out.println("Your sha224 hash is: " + ColorAnsi.ANSI_CYAN + sha224(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("sha384")){
            System.out.println("Your sha384 hash is: " + ColorAnsi.ANSI_CYAN + sha384(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("md2")){
            System.out.println("Your md2 hash is: " + ColorAnsi.ANSI_CYAN + md2(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else if (args[0].equalsIgnoreCase("sha1")){
            System.out.println("Your sha1 hash is: " + ColorAnsi.ANSI_CYAN + sha1(sb.toString()) + ColorAnsi.ANSI_RESET);
        }else{
            System.out.println(ColorAnsi.ANSI_RED + "## java -jar x-Hash.jar <sha512||sha256||md5||sha224||sha384||md2||sha1> <string>");
        }
        System.exit(0);
    }
    public static String sha512(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String sha256(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String md5(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String sha224(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-224");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String sha384(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-384");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String md2(@NotNull String input){
        try {
            MessageDigest md = MessageDigest.getInstance("MD2");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String sha1(@NotNull String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    }
