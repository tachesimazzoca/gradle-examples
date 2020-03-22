package com.github.tachesimazzoca.gradle.examples.domain;

import org.apache.commons.lang3.StringUtils;

public class PersonName {
    private final String lastName;
    private final String firstName;

    private PersonName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static PersonName create(String lastName, String firstName) {
        if (lastName == null) {
            throw new NullPointerException();
        }
        if (firstName == null) {
            throw new NullPointerException();
        }
        return new PersonName(StringUtils.trim(lastName), StringUtils.trim(firstName));
    }
}
