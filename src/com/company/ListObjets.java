package com.company;

public class ListObjets {
    int count;
    String[] mass1 = new String[5];

    public void addobject(String objectsadd) {
        if (count == mass1.length) {                             // создание резинового массива
            String[] mass2 = new String[mass1.length + 1];       // метод добавления в массив
            for (int j = 0; j < mass1.length; j++) {
                mass2[j] = mass1[j];
            }
            mass1 = mass2;
        }
        mass1[count] = objectsadd;
        count++;
    }

    public void getObjects(String[] mass1) {                     // метод вывода на экран
        for (int i = 0; i < mass1.length; i++) {
            System.out.println(" " + (i + 1) + ". - " + mass1[i]);
        }
    }


    public void removObjects(int elementRemoved) {               // метод удаления обьекта из массива по индексу
        this.mass1[elementRemoved - 1] = null;
        for (int j = elementRemoved - 1; j < this.mass1.length - 1; j++) {
            mass1[j] = mass1[j + 1];
            mass1[j + 1] = null;
        }
        count -= 1;
    }
}



