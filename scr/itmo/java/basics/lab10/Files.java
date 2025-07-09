package itmo.java.basics.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {
    //чтение тхт-файла и возвращение этого файла в виде списка строк
    public static List<String> readFileToList(String filePath) {
        List<String> readFile = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                readFile.add(line);
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
        return readFile;
    }

    //запись в файл строки, переданной параметром
    public static void writeStringToFile(String filePath, String string) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(string);
            writer.newLine();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //склейка 2-х тхт-файлов в один
    public static void mergeFiles(String file1Path, String file2Path, String outputPath) {
        List<String> readFile1 = readFileToList(file1Path);
        List<String> readFile2 = readFileToList(file2Path);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String line : readFile1) {
                writer.write(line);
                writer.newLine();
            }
            for (String line : readFile2) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //замена всех символов файла, кроме букв и цифр, на $
    public static void replaceWithDollar(String filePath, String outputPath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                String line;
                while((line = reader.readLine()) != null) {
                    String modifiedLine = line.replaceAll("[^a-zA-Zа-яА-Я09]", "\\$");
                    writer.write(modifiedLine);
                    writer.newLine();
                }
        } catch(IOException e) {
               System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\gorle\\IdeaProjects\\itmo-java-basics-labs\\files\\text.txt";
        String filePath2 = "C:\\Users\\gorle\\IdeaProjects\\itmo-java-basics-labs\\files\\text2.txt";
        //1
        System.out.println("Содержимое прочитанного файла: ");
        System.out.println();
        List<String> readFile = readFileToList(filePath);
        for (String line : readFile) {
            System.out.println(line);
        }
        System.out.println();
        //2
        System.out.println("Введите строку, которую хотите добавить в файл: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string == null || string.trim().isEmpty()) {
            System.out.println("В файл нужно что-то добавить!");
        } else {
            writeStringToFile(filePath, string);
            System.out.println("Ура! Строка \"" + string + "\" добавлена в файл \"" + filePath + "\"");
        }
        //3
        mergeFiles(filePath, filePath2, "C:\\Users\\gorle\\IdeaProjects\\itmo-java-basics-labs\\files\\mergedFile.txt");
        //4
        replaceWithDollar(filePath, "C:\\Users\\gorle\\IdeaProjects\\itmo-java-basics-labs\\files\\modifiedFile.txt");
    }
}
