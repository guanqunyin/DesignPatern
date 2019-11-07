package com.yin.pattern.prototype.v1;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person clone = (Person)person.clone();

        System.out.println("age:" + clone.age +" score:"+ clone.score);
        System.out.println(clone.location);
        System.out.println(person.location==clone.location);
        clone.location.roomStreet="test";
        System.out.println(person.location);
    }
}

class Person implements Cloneable {

    int age = 8;
    int score = 100;

    Location location = new Location("bj", 22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location{

    String roomStreet;
    int number;

    public Location(String roomStreet, int number) {
        this.roomStreet = roomStreet;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Location{" +
                "roomStreet='" + roomStreet + '\'' +
                ", number=" + number +
                '}';
    }
}
