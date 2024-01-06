package com.pathz.shallowdeepcopy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
public class TestObject implements Cloneable {
    private String someValue = "hello";
    private Engine engine = new Engine("bmw motor");


    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestObject testObject = new TestObject();
        Engine newEngine = new Engine(getEngine().getMotorName());
        testObject.setEngine(newEngine);
        testObject.setSomeValue(getSomeValue());
        return testObject;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestObject original = new TestObject();
        TestObject clone = (TestObject) original.clone();

        clone.getEngine().setMotorName("mercedes");
        System.out.println(clone.getEngine().getMotorName());
        System.out.println(original.getEngine().getMotorName());
    }
}

@Data
@AllArgsConstructor
class Engine {
    private String motorName;
}
