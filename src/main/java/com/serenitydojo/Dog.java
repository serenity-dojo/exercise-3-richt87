package com.serenitydojo;

public class Dog {
    private static final String DOG_NOISE = "Woof";
    public String name;
    public String favoriteToy;
    public int age;
    private boolean isFed;

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, String favoriteToy, int age){
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void makeNoise(){
        System.out.println(DOG_NOISE);
    }


//Feeding the dog

    //constructor, pet starts off unfed
    public Dog(){
        this.isFed = false;
    }
    //method to feed pet
    public void feed(){
        isFed = true;
        System.out.println("Your pet has been fed");
    }
}
