package com.myExample.task1;

import com.myExample.task1.book.Author;
import com.myExample.task1.book.Book;
import com.myExample.task1.employee.Employee;
import com.myExample.task1.shapes.circle.Circle;
import com.myExample.task1.shapes.triangle.MyPoint;
import com.myExample.task1.shapes.triangle.MyTriangle;
import com.myExample.task1.shapes.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(-3, 0);
        MyPoint point2 = new MyPoint(3, 0);
        MyPoint point3 = new MyPoint(0, 5);

        System.out.println("distance1=" + point1.distance(point2));
        System.out.println("distance2=" + point1.distance(point3));
        System.out.println("distance3=" + point2.distance(point3));

        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println("Perimeter= " + triangle.getPerimeter() + "  Type= " + triangle.getType());
        System.out.println(triangle);

//        Rectangle rectangle = new Rectangle(10, 19);
//        System.out.println(rectangle);
//        System.out.println("Perimeter= " + rectangle.getPerimetr());
//        System.out.println("Area= " + rectangle.getArea());
//
//        Circle circle = new Circle(4, "green");
//        System.out.println(circle);
//        System.out.println("Area= " +circle.getArea());
//
//        Author author1 = new Author("autho1", "num1@gmail.com", 'm');
//        Author author = new Author("autho1", "num1@gmail.com", 'm');
//        Author author2 = new Author("autho2", "num2@gmail.com", 'f');
//        System.out.println(author.equals(author1));
//        System.out.println(author.equals(author2));
//        Author[] authors = new Author[]{author1, author2};
//        Book book = new Book("book", authors, 156);
//        System.out.println(book);
//
//        Employee employee = new Employee(1, "Alex", "Flex", 444);
//        System.out.println(employee);
//        System.out.println("Annual salary=" +employee.AnnualSalary());
//        System.out.println("ID=" +employee.getId());

    }
}
