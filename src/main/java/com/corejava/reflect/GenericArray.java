package com.corejava.reflect;

import java.lang.reflect.Array;

/**
 * Created by xhuanlee on 2017/10/18.
 */
public class GenericArray {

    public static void main(String[] args) {
        int[] a = {23, 3, 11, 45};
        System.out.println(copyArray(a, 2).toString());
    }

    public static Object copyArray(Object object, int newLength) {
        Class clazz = object.getClass();
        if (!clazz.isArray()) {
            return null;
        }

        Class componentType = clazz.getComponentType();
        int length = Array.getLength(object);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(object, 0, newArray, 0, Math.min(length, newLength));

        return newArray;
    }

}
