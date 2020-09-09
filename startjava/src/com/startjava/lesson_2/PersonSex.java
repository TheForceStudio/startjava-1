package com.startjava.lesson_2;

public enum PersonSex {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        switch(this) {
            case MALE: return "male";
            case FEMALE: return "female";
            default: throw new IllegalArgumentException();
        }
    }
}
