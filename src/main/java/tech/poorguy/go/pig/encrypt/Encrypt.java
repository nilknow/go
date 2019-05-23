package tech.poorguy.go.pig.encrypt;

import com.google.common.hash.Hashing;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/5/22 11:46
 * @description
 */
public class Encrypt {
    public static String getMd5(String notEncrypted) {
        /**
         * md5 is not recommended for encrypting by google, maybe you should use sha256, it's better for security
         */
        return Hashing.md5().hashBytes(notEncrypted.getBytes()).toString();
    }
}
