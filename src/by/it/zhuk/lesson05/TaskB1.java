package by.it.zhuk.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Computer");
        list.add("Science");
        list.add("java");
        int size = list.size();
        System.out.println(size);
        for (int i=0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
