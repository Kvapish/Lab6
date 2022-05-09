package com.company;

/**
 * Вариант 8. Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
 * вывода сведений о фигуре – площади, длины окружности. Создать производный класс – конус с высотой
 * h, добавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода
 * сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано N окружностей и M
 * конусов, найти количество окружностей, у которых площадь меньше средней площади всех окружностей,
 * и наибольший по объему конус.
 */
public class Main {

    public static void main(String[] args) {
        double side = -1;
        double height = -1;
        int M = 10;
        /*Circle circle;
        double side = -1;
        Circles circles = new Circles();
        for (int i = 0; i < 10; i++) {
            while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            }
            circle = new Circle(side);
            circles.add(circle);
        }
        System.out.println(circles);


        System.out.println("\nAverage square of circles : " + circles.getAverageSquare());
        System.out.println(circles.findAverageReturn());
        Cone cone;
        double height = -1;
        Cones cones = new Cones();
        for (int i = 0; i < 10; i++) {
            while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {

            }
            cone = new Cone(side, height);
            cones.list.add(cone);
        }
        for (int i = 0; i < cones.list.size(); i++) {
            System.out.println(cones.list.get(i));
        }
        System.out.println("\nThe largest volume of the cone : " + cones.getLargestVolume());
        System.out.println(cones.getLargestVolumeAsString());
        */


        CirclesList circle = new CirclesList();
        for (int i = 0; i < M; i++) {
            while (Circle.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            }
            //circle = new Circle(side);
            circle.add(new Circle(side));
        }
        System.out.println(circle);
        System.out.println("\nAverage square of circles : " + circle.getAverageSquare());
        System.out.println(circle.findAverageReturn()+System.lineSeparator());

        ConesList cone = new ConesList();
        for (int i = 0; i < M; i++) {
            while (Cone.CorrectRadius("" + (side = Math.random() * 11 - 5)) < 0 || Cone.CorrectHeight("" + (height = Math.random() * 11 - 5)) < 0) {

            }
            //cone = new Cone(side, height);
            cone.list.add(new Cone(side,height));
        }
        for (int i = 0; i < cone.list.size(); i++) {
            System.out.println(cone.list.get(i));
        }
        System.out.println("\nThe largest volume of the cone : " + cone.getLargestVolume());
        System.out.println(cone.getLargestVolumeAsString());
    }
}