package com.abhilash.error;

import java.io.IOException;
import java.sql.SQLException;

public class CheckedUnchecked {
    public static void main(String[] args) {
        print(IOException.class);
        print(NullPointerException.class);
        print(SQLException.class);
        print(IllegalArgumentException.class);
    }

    static void print(Class<?> type) {
        System.out.println(type.getSimpleName() + ": " + family(type));
    }

    static String family(Class<?> type) {

        if (RuntimeException.class.isAssignableFrom(type)
                || Error.class.isAssignableFrom(type)) {

            return "unchecked";
        }

        return "checked";
    }
}