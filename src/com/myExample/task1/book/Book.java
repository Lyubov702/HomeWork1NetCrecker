package com.myExample.task1.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        String authorsName = "";
        for (Author aut : authors) {
            authorsName += aut.getName() + " ";
        }
        return authorsName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if(obj.getClass()!=this.getClass()) return false;

        Book book = (Book) obj;
        return book.name.equals(name)
                && book.price==price
                && book.qty == qty
                && Arrays.equals(book.getAuthors(),getAuthors());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = (int) ((31 * result + Double.doubleToLongBits(price))^(Double.doubleToLongBits(price)>>> 32));
        result = 31 * result + qty;
        result = 31 * result + Arrays.hashCode(getAuthors());

        return result;
    }
}
