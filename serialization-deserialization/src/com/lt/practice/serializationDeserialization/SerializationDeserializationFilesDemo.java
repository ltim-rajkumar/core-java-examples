package com.lt.practice.serializationDeserialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SerializationDeserializationFilesDemo {

    private static final String FILE_PATH = "E:\\learnings\\java\\temp-folder\\";
    private static final String FILE_NAME = "serialization-deserialization-demo-file.txt";
    private static final Path path = Path.of(FILE_PATH + FILE_NAME);

    public static void main(String[] args) {
        try {
            SerializationDeserializationFilesDemo serializationDeserializationFilesDemo = new SerializationDeserializationFilesDemo();

            Student studentMads = new Student(1, "Mads", new Student.Address("Dubai"));
            Student studentJemms = new Student(2, "Jemms", new Student.Address("Singapore"));

            System.out.println("studentMads = " + studentMads);
            System.out.println("studentJemms = " + studentJemms);

            serializationDeserializationFilesDemo.serialize(List.of(studentMads, studentJemms));

            List<Student> studentList = serializationDeserializationFilesDemo.deserialization();

            System.out.println("Data received from file as: ");

            studentList.forEach(System.out::println);

            System.out.println("--------------------------");

        } catch (IOException ioex) {
            System.out.println("IOException occurred: " + ioex.getMessage());
        }

    }

    private void serialize(List<Student> studentList) throws IOException {
        try {

            System.out.println("-------------------------------");
            System.out.println("Serialization stating...");

            if(!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("File created at location: " + path);
            }

            System.out.println("Saving object into file...");
            FileOutputStream file = new FileOutputStream(String.valueOf(path));
            ObjectOutputStream stream = new ObjectOutputStream(file);

            stream.writeObject(studentList);

            stream.close();
            file.close();

            System.out.println("Serialization process completed....");
        } catch (IOException ioex) {
            System.out.println("Exception occurred while serialization: " + ioex.getMessage());
        }

    }

    private List<Student> deserialization() {
        List<Student> studentList = null;

        try {
            System.out.println("------------------------");
            System.out.println("Deserialization starting...");
            FileInputStream file = new FileInputStream(String.valueOf(path));
            ObjectInputStream stream = new ObjectInputStream(file);

            studentList = (List<Student>) stream.readObject();

            stream.close();
            file.close();

            System.out.println("Deserialization completed !");
            System.out.println("------------------------");

        } catch (IOException | ClassNotFoundException ioex) {
            System.out.println("IOException occurred while deserialization: " + ioex.getMessage());
        }

        return studentList;

    }



}
