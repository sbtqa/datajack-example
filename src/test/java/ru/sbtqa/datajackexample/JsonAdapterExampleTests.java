package ru.sbtqa.datajackexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.sbtqa.tag.datajack.TestDataObject;
import ru.sbtqa.tag.datajack.adaptors.JsonDataObjectAdaptor;
import ru.sbtqa.tag.datajack.exceptions.DataException;
import ru.sbtqa.tag.qautils.properties.Props;

public class JsonAdapterExampleTests {

    private String name;
    private TestDataObject data;

    @Before
    public void setUp() throws DataException {
        data = new JsonDataObjectAdaptor(Props.get("test.data.path"),"testexampledata");
    }

    @Test
    public void jsonParseTest1() throws DataException {
        name = "Oleg";

        String result = data.get("test1.name").getValue();

        Assert.assertEquals("Incorrect value", result, name);
    }

    @Test
    public void jsonParseTest2() throws DataException {
        name = "Ivan";

        String result = data.get("test2").get("name").getValue();

        Assert.assertEquals("Incorrect value", result, name);
    }
}