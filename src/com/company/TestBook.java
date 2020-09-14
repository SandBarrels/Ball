package com.company;

public class TestBook {
    public static void main(String[] args) {
        Book book1= new Book(456, "Java");
        Book book2 = new Book(254, "Python");
        System.out.println(book1.getTitle());
        System.out.println(book2.toString());
    }
}
