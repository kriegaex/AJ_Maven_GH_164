package org.example.spoon;


import org.example.spoon.base.LAspect;

public class SpoonApplication {
    @Log
    @LAspect
    public void test(String name) {
        System.out.println(name);
    }


}
