package ut.jp.junoe.confluence.plugins;

import org.junit.Test;
import jp.junoe.confluence.plugins.MyPluginComponent;
import jp.junoe.confluence.plugins.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}