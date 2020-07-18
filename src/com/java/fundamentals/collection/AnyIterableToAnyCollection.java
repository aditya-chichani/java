package com.java.fundamentals.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AnyIterableToAnyCollection {

    public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr) {
        Collection<T> collection = new ArrayList<>();
        for (T t : itr) {
            collection.add(t);
        }
        return collection;
    }
}
