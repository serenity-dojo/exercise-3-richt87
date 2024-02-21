package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog(){
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido", "Bone", 5);

        fido.setName("Fido");
        fido.setFavoriteToy("Bone");
        fido.setAge(5);


        //Print outs
        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());


        //Asserts
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }

    @Test
    public void dog_makes_a_noise(){
        Dog Fido = new Dog("Fido", "Bone", 5);

        Fido.makeNoise();
        Fido.feed();
    }
}
