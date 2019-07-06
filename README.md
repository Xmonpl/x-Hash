# x-Hash
Hashing library written in Java.

>xmonHash.sha512(String to hash);

>xmonHash.sha256(String to hash);

>xmonHash.md5(String to hash);

>xmonHash.sha224(String to hash);

>xmonHash.sha384(String to hash);

>xmonHash.md2(String to hash);

>xmonHash.sha1(String to hash);

# Usage 1:
```

package cf.xmon.test;

import cf.xmon.hasher.xmonHash;

public class SimpleHash {
    public static void main(String[] args){
        String tohash = "npwnPRO4H2J-9H2PMHJH240JHKNPOTK02MGHJW0-HOKMW WG-0JWG23J0G M-M 3K2J023 GMPO2";
        System.out.println(xmonHash.sha224(tohash));
    }
}

```

# Usage 2:

>java -jar x-Hash.jar sha512|sha256|md5|sha224|sha384|md2|sha1 string

https://i.imgur.com/gBn88AY.png
