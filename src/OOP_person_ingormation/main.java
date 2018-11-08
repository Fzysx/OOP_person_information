package OOP_person_ingormation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {


        int i=0;



        User[] objectsArray = new User[1000];
        objectsArray[i] = new User();
        objectsArray[i].num = 0;
        while (objectsArray[i].num < 10) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите номер: ");
            objectsArray[i].num = Integer.parseInt(br.readLine());
            if (objectsArray[i].num < 10) {
                System.out.println("Введите фамилию: ");
                objectsArray[i].surname = br.readLine();
                System.out.println("Введите имя: ");
                objectsArray[i].name = br.readLine();
                System.out.println("Введите отчество: ");
                objectsArray[i].patronymic = br.readLine();
                System.out.println("Введите возраст(лет): ");
                objectsArray[i].age = Integer.parseInt(br.readLine());
                System.out.println("Введите пол(M/Ж): ");
                objectsArray[i].sex = (char) br.read();
                System.out.printf("№: %d, Имя: %s, Фамилия: %s, Отчество: %s, Вохраст(лет): %d, Пол: %c\n", objectsArray[i].num, objectsArray[i].surname, objectsArray[i].name, objectsArray[i].patronymic, objectsArray[i].age, objectsArray[i].sex);
                i = i + 1;
                objectsArray[i] = new User();
                objectsArray[i].num = 0;
            }
            else
                System.out.println("Конец программы");
        }
    }

}
