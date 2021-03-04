package CalculateMark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {

    public static List<Student> students;

    static {

        students = new ArrayList(10);

        students.add(new ItStudent(120190762, "Amjad", "IT", 29f, 27f, 40f));
        students.add(new ItStudent(120201337, "Anas", "IT", 29f, 30f, 39f));
        students.add(new ItStudent(120203469, "Marwan", "IT", 25f, 22f, 37f));
        students.add(new ItStudent(120183339, "Yosra", "IT", 27f, 27f, 34f));
        students.add(new ItStudent(120197661, "Bushra", "IT", 28f, 25f, 37f));

        students.add(new ArtStudent(120170440, "Mohammed", "Art & Crafts", 25f, 25f, 33f));
        students.add(new ArtStudent(120171227, "Adham", "Art & Crafts", 29f, 30f, 39f));
        students.add(new ArtStudent(120177889, "Yosef", "Art & Crafts", 25f, 22f, 37f));
        students.add(new ArtStudent(120181029, "Alaa", "Art & Crafts", 29f, 27f, 40f));
        students.add(new ArtStudent(120190031, "Sara", "Art & Crafts", 28f, 25f, 37f));

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("\n   WELCOME TO OUR SERVISES   \n");

        System.out.println("=============================");
        System.out.println("          Main Menu          ");
        System.out.println("=============================\n");

        System.out.println(" 1) Add a new student.");
        System.out.println(" 2) Sort student.");
        System.out.println(" 3) Save students data.");
        System.out.println(" 0) Exit.");

        System.out.print("\nEnter operation number: ");
        int choice = input.nextInt();

        boolean flag = true;

        while (flag) {
            switch (choice) {
                case 1:

                    System.out.println("\n==============================");
                    System.out.println("          Major Menu          ");
                    System.out.println("==============================\n");

                    System.out.println("  1) Information Technology.");
                    System.out.println("  2) Art & Crafts.");
                    System.out.println("  0) Exit.");

                    System.out.print("\nEnter major number: ");
                    int choice_2 = input.nextInt();

                    int id;
                    double midMark,
                     projectMark,
                     finalMark;
                    String name;

                    switch (choice_2) {
                        case 1:

                            System.out.println("\n---------------------------------");

                            ItStudent itStudent = new ItStudent();
                            itStudent.setMajor("IT");

                            System.out.print("\nEnter Student ID: ");
                            id = input.nextInt();
                            itStudent.setId(id);

                            System.out.print("\nEnter Student Name: ");
                            name = input.next();
                            itStudent.setName(name);

                            System.out.print("\nEnter " + name + " mid mark: ");
                            midMark = input.nextDouble();
                            itStudent.setMidMark(midMark);

                            System.out.print("\nEnter " + name + " project mark: ");
                            projectMark = input.nextDouble();
                            itStudent.setProjectMark(projectMark);

                            System.out.print("\nEnter " + name + " final mark: ");
                            finalMark = input.nextDouble();
                            itStudent.setFinalMark(finalMark);

                            students.add(itStudent);

                            break;
                        case 2:

                            System.out.println("\n---------------------------------");

                            ArtStudent ArtStudent = new ArtStudent();
                            ArtStudent.setMajor("Art & Crafts");

                            System.out.print("\nEnter Student ID: ");
                            id = input.nextInt();
                            ArtStudent.setId(id);

                            System.out.print("\nEnter Student Name: ");
                            name = input.next();
                            ArtStudent.setName(name);

                            System.out.print("\nEnter " + name + " mid mark: ");
                            midMark = input.nextDouble();
                            ArtStudent.setMidMark(midMark);

                            System.out.print("\nEnter " + name + " project mark: ");
                            projectMark = input.nextDouble();
                            ArtStudent.setProjectMark(projectMark);

                            System.out.print("\nEnter " + name + " final mark: ");
                            finalMark = input.nextDouble();
                            ArtStudent.setFinalMark(finalMark);

                            students.add(ArtStudent);

                            break;
                        case 0:

                            System.out.println("\n=============================");
                            System.out.println("          Main Menu          ");
                            System.out.println("=============================\n");

                            System.out.println(" 1) Add a new student.");
                            System.out.println(" 2) Sort student.");
                            System.out.println(" 3) Save students data.");
                            System.out.println(" 0) Exit.");

                            System.out.print("\nEnter operation number: ");
                            choice = input.nextInt();
                    }

                    break;
                case 2:

                    System.out.println("\n=============================");
                    System.out.println("          Sort Menu          ");
                    System.out.println("=============================\n");

                    System.out.println(" 1) Sorting by name.");
                    System.out.println(" 2) Sorting by grade.");
                    System.out.println(" 0) Exit.");

                    System.out.print("\nEnter operation number: ");
                    int choice_3 = input.nextInt();

                    String[] arrayOfNames = new String[students.size()];

                    for (int i = 0; i < students.size(); i++) {
                        arrayOfNames[i] = students.get(i).getName();
                    }

                    double[] arrayOfGrade;

                    switch (choice_3) {
                        case 1:

                            for (int i = 0; i < arrayOfNames.length; i++) {
                                for (int j = i + 1; j < arrayOfNames.length; j++) {
                                    if (arrayOfNames[i].compareTo(arrayOfNames[j]) < 0) {

                                        String temp = arrayOfNames[i];
                                        arrayOfNames[i] = arrayOfNames[j];
                                        arrayOfNames[j] = temp;

                                    }
                                }
                            }

                            System.out.println("\n---------------------------------");
                            System.out.println("\nSorting students' names in descending order.");

                            for (String studentName : arrayOfNames) {
                                System.out.println("\n  • " + studentName);
                            }
                            System.out.println();

                            break;
                        case 2:

                            arrayOfGrade = new double[students.size()];

                            for (int i = 0; i < students.size(); i++) {
                                if (students.get(i) instanceof ItStudent) {

                                    ItStudent itStudent = (ItStudent) students.get(i);
                                    arrayOfGrade[i] = itStudent.getGrade();

                                } else if (students.get(i) instanceof ArtStudent) {

                                    ArtStudent artStudent = (ArtStudent) students.get(i);
                                    arrayOfGrade[i] = artStudent.getGrade();

                                }
                            }

                            for (int i = 0; i < arrayOfGrade.length; i++) {
                                for (int j = i + 1; j < arrayOfGrade.length; j++) {
                                    if (arrayOfGrade[i] > arrayOfGrade[j]) {

                                        double temp = arrayOfGrade[i];
                                        arrayOfGrade[i] = arrayOfGrade[j];
                                        arrayOfGrade[j] = temp;

                                    }
                                }
                            }

                            System.out.println("\n---------------------------------");
                            System.out.println("\nSorting students' grade in ascending order.");

                            for (int i = 0; i < students.size(); i++) {

                                System.out.println("\n  • " + arrayOfNames[i] + " : " + arrayOfGrade[i]);
                            }
                            System.out.println();

                            break;
                        case 0:

                            System.out.println("\n=============================");
                            System.out.println("          Main Menu          ");
                            System.out.println("=============================\n");

                            System.out.println(" 1) Add a new student.");
                            System.out.println(" 2) Sort student.");
                            System.out.println(" 3) Save students data.");
                            System.out.println(" 0) Exit.");

                            System.out.print("\nEnter operation number: ");
                            choice = input.nextInt();
                    }

                    break;
                case 3:

                    File file = new File("studentsObjects.txt");
                    FileWriter inputStream = new FileWriter(file);

                    for (Student s : students) {
                        inputStream.write(s.toString());
                        inputStream.write(",");
                    }

                    inputStream.flush();
                    inputStream.close();

                    System.out.println("\n---------------------------------");
                    System.out.println("\nOperation Accomplished Successfully ☺");

                    System.out.println("\n=============================");
                    System.out.println("          Main Menu          ");
                    System.out.println("=============================\n");

                    System.out.println(" 1) Add a new student.");
                    System.out.println(" 2) Sort student.");
                    System.out.println(" 3) Save students data.");
                    System.out.println(" 0) Exit.");

                    System.out.print("\nEnter operation number: ");
                    choice = input.nextInt();

                    break;
                case 0:

                    System.out.println("\n---------------------------------\n");
                    System.out.println("Thanks you for using our servises\n");
                    flag = false;

                    break;
            }
        }

    }

}
