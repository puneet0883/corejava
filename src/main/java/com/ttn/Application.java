package com.ttn;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Puneet");
       // System.out.println(Application2.print());
        System.out.println("7) Join Strings using separator >>>" +
                StringUtils.join(new String[]{"RO", "TG", "DR"}, "YES"));
    }
}

