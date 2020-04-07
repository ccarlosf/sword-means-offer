package com.ccarlos.swordmeansoffer.reflect.two;

import com.ccarlos.swordmeansoffer.reflect.one.Robot;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = Robot.class.getClassLoader();
        Class r = Class.forName("com.ccarlos.swordmeansoffer.reflect.one.Robot");
        Class.forName("com.mysql.jdbc.Driver");
    }
}
