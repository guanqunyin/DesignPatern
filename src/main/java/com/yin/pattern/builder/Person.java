package com.yin.pattern.builder;


public class Person {


    int id;
    String name;
    int age;
    double weight;
    int score;
    Location location;

    private Person(){}

    public static class PersonBuilder{

        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(int weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;

        }


        public PersonBuilder loc(String street, String roomNo) {
            person.location = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return person;
        }
    }

    static class Location{

        private String street;
        private String roomNo;

        public Location(String street, String roomNo) {
            this.roomNo =roomNo;
            this.street =street;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "street='" + street + '\'' +
                    ", roomNo='" + roomNo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", location=" + location +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person.PersonBuilder().basicInfo(1, "zhangsan", 18)
                .score(20).weight(200).loc("changsha", "111").build();
        System.out.println(p);
    }


}
