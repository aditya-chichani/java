package com.java.fundamentals.block.execution;

public enum OS {
    ANDROID,
    iOS;

    static {
        System.out.println("Static block within enum");
    }

    public static void main(String[] args) {
        System.out.println("Main within Enum class");
    }
}
