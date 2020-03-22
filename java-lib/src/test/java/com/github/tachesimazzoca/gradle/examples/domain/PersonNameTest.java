package com.github.tachesimazzoca.gradle.examples.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonNameTest {
    @Test
    public void testCreate() {
        PersonName a = PersonName.create("Anderson", "Becky");
        assertEquals("Becky Anderson", a.toString());

        PersonName b = PersonName.create("  Cook", " David ");
        assertEquals("David Cook", b.toString());
    }
}
