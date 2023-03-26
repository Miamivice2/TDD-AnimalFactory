package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.rmi.server.ExportException;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Initialize a new Cat
        Cat cat = new Cat("Dre",null, null);
        //This what i expect to get back(sometimes can be any data type)
        String Expected = "Davis";
        //Setting cat name to davis
        cat.setName("Davis");
        //Checking getName Method to see what tit actually returns
        String Actual = cat.getName();
        //Checking that what i expect to get back and what i actually get back is the samething.
        Assert.assertEquals(Expected, Actual);

    }
    @Test
    public void SpeakTest(){
        Cat cat = new Cat(null,null, null);
        String Expected = "meow!";
        String Actual = cat.speak();
        Assert.assertEquals(Expected, Actual);
    }
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null,null, null);
        Date Expected = new Date (11-19-1992);
        cat.setBirthDate(Expected);
        Date Actual = cat.getBirthDate();
        Assert.assertEquals(Actual, Expected);
    }
    @Test
    public void eatTest(){
        Cat cat = new Cat(null,null, null);
        Integer Expected = 1;
        cat.eat(new Food());
        cat.getNumberOfMealsEaten();
        Integer food = 1;
        Integer Actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(Expected,Actual);
    }



}
