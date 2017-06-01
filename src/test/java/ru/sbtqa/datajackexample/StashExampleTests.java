package ru.sbtqa.datajackexample;

import org.junit.Assert;
import org.junit.Test;
import ru.sbtqa.tag.datajack.Stash;

public class StashExampleTests {

    @Test
    public void PutAndGetStringTest(){
        String value = "tests";
        String key = "text";
        Stash.put(key, value);
        String result = Stash.getValue(key);

        Assert.assertEquals("Incorrect value", value, result);
    }

    @Test
    public void PutAndGetIntegerTest(){
        int value = 2;
        String key = "text";
        Stash.put(key, value);
        int result = Stash.getValue(key);

        Assert.assertEquals("Incorrect value", value, result);
    }
}