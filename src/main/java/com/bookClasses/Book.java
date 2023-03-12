package com.bookClasses;

public class Book {
    String title;
    String author;
    String price;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
