package com.annotation;
class OldVersion {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}

public class Deprcated {
    public static void main(String[] args) {
        OldVersion obj = new OldVersion();
        obj.oldMethod();  // Warning: This method is deprecated
    }
}

