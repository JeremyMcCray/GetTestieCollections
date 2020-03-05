package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    HashSet<Object> test = new HashSet<>();
    Person testPerson = new Person("alan",100);

    @Test
    public void HashSetTest1(){
        test.add(testPerson);
       Boolean actual =  test.isEmpty();

        Assert.assertFalse(actual);
    }

    @Test
    public void HashSetTest2(){
        test.add(testPerson);
        test.add(testPerson);
        test.add(testPerson);
        Integer expected = 1;
        Integer actual =  test.size();
        //should only add him one time//
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void HashSetTest3(){
        test.add(testPerson);
        test.clear();
        Integer expected = 0;
        Integer actual =  test.size();
        
        Assert.assertEquals(actual,expected);
    }


}
