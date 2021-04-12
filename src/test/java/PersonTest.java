import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person = new Person("Felix", 25);

    private String expectedResultName = "";
    private String actualResultName = "";
    private int expectedResultAge = 0;
    private int actualResultAge = 0;


    @org.junit.jupiter.api.Test
    void setName() {
        expectedResultName = "Erkan";
        person.setName("Erkan");
        actualResultName = person.getName();
        Assertions.assertEquals(expectedResultName, actualResultName);
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        expectedResultAge = 18;
        person.setAge(18);
        actualResultAge = person.getAge();
        Assertions.assertEquals(expectedResultAge, actualResultAge);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        expectedResultName="Felix";
        actualResultName=person.getName();
        Assertions.assertEquals(expectedResultName, actualResultName);
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        expectedResultAge=25;
        actualResultAge=person.getAge();
        Assertions.assertEquals(expectedResultAge, actualResultAge);
    }

    @org.junit.jupiter.api.Test
    void reverseName() {
        expectedResultName="xileF";
        actualResultName= person.reverseName("Felix");
        Assertions.assertEquals(expectedResultName, actualResultName);
    }
}