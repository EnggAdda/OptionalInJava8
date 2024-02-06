package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Optional<String> optionalWithValue = Optional.of("EnggAdda")    ;
        System.out.println(optionalWithValue.get());

        Optional<String> optionalOfNullable = Optional.ofNullable( "EnggAdda1") ;    ;
        System.out.println(optionalOfNullable.get());

        Optional<String> optionalOfEmpty = Optional.empty(  )    ;
       // System.out.println(optionalOfEmpty.get());

        System.out.println( optionalOfEmpty.orElseGet(()->"orElseGet") );
       // System.out.println();

        //optionalOfEmpty.orElseThrow(()->new RuntimeException("orElseThrowDemo")) ;

        System.out.println(optionalOfEmpty.isPresent());
        optionalOfEmpty.stream().forEach(System.out::println);
    }
}