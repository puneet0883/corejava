package com.ttn;
import org.apache.commons.lang3.StringUtils;

    public class StringutilsExample {
        public static void main(String[] args) {
            System.out.println("Join Strings using separator >>>" +
                    StringUtils.join(new String[] { "RO", "TG", "DR" }, "YES"));

    }
}
