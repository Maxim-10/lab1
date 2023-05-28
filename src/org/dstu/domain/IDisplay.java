package org.dstu.domain;

import java.io.Serializable;

public interface IDisplay extends Serializable {
    default void print() {
        System.out.println(toString());
    }
}
