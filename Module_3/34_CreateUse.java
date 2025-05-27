// com.utils.StringUtils.java
package com.utils;
public class StringUtils {
    public static String toUpper(String str) {
        return str.toUpperCase();
    }
}

// module-info.java in com.utils
module com.utils {
    exports com.utils;
}

// com.greetings.Main.java
package com.greetings;
import com.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.toUpper("hello"));
    }
}

// module-info.java in com.greetings
module com.greetings {
    requires com.utils;
}
