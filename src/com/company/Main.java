package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListObjets listObjets = new ListObjets();
        listObjets.addobject("Misha");
        listObjets.addobject("Albert");
        listObjets.addobject("ivan");
        listObjets.addobject("Anton");
        while (true) {
            System.out.println(
                    """
                            1 - добавить обьект.\s
                            2 - удалить обьетк.\s
                            3 - показать весь список обьектов \s
                            \s""");
            int yourChoice = in.nextInt();
            if (yourChoice == 1) {
                System.out.println(
                        "вы выбрали  \n "
                                + yourChoice +
                                " \n" +
                                " добавить обьект в список.\n  " +
                                "");
                System.out.println(
                        " введите обьект для добавления "
                );
                String objectsadd = in.next();
                listObjets.addobject(objectsadd);
                System.out.println(
                        "вы добавили в список \n " +
                                "обьект \n "
                                + objectsadd
                );
            } else if (yourChoice == 2) {
                System.out.println(
                        "вы выбрали  \n "
                                + yourChoice +
                                " \n" +
                                "удалить обьетк.\n");
                System.out.println(
                        " выберите обьект который хотите удалить "
                );
                int elementRemoved = in.nextInt();
                listObjets.removObjects(elementRemoved);
                System.out.println("элемент  \n "
                        + elementRemoved +
                        " \n " +
                        " удален \n "
                );
            } else if (yourChoice == 3) {
                System.out.println(
                        "вы выбрали  \n "
                                + yourChoice +
                                " \n" +
                                " показать весь список обьектов \n");
                System.out.println(
                        " список обьектов "
                );
                listObjets.getObjects(listObjets.mass1);
                System.out.println(" Количество объектов в списке " +
                        "равно " + listObjets.mass1.length);
            } else {
                System.out.println(
                        """
                                 такой команды нет\s
                                 введите коректную команду\s
                                """);
            }
        }
    }
}


