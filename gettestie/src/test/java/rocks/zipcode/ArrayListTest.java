package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;

public class ArrayListTest{
    ArrayList<Object> genericList = new ArrayList<>();

    @Test
    public void arrayListTest1() {
        String bloop = "Bloop";
        GregorianCalendar jeff = new GregorianCalendar();
        genericList.add(bloop);
        Integer blop = 11;
        genericList.add(blop);
        genericList.add(jeff);
        Assert.assertTrue(genericList.get(0)instanceof String);
        Assert.assertTrue(genericList.get(1) instanceof Integer);
        Assert.assertTrue(genericList.get(2) instanceof GregorianCalendar);
    }

    @Test
    public void arrayListTest2(){
        String d = "d";
        String b = "b";
        String x = "3";
        String[] bob = new String[]{b, d,x};
        genericList.addAll(Arrays.asList(bob));

        Integer expected = 3;
        Integer actual = genericList.size();

        Assert.assertEquals(expected,actual);

    }
}
