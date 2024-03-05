import java.io.File;
import java.io.*;

public class TextFiles {
    File file;
     void createTextFIle() {
        file = new File("File.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(System.err);
        }
    }

    void deleteTextFile() {
         if (file.delete()) {
             System.out.println("Deleted the file: " + file.getName());
         } else {
                System.out.println("Failed to delete the file.");
         }
    }

    //Método para escribir archivo de texto
     void writeTextFile() {
        FileWriter writer = null;
        try {

            // Crea un objeto FileWriter con el archivo especificado y el modo de anexar establecido en verdadero.
            // Luego, escribe la cadena "Greetings" en el archivo.
            writer = new FileWriter(file, true);
            writer.write("Greetings");            writer.write("Greetings" );
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("An error occurred while closing the file writer: "
                            + e.getMessage());
                }
            }
        }
    }

    //Método para leer archivo de texto
    void readFile() {
         String content;
         try {
             FileReader reader = new FileReader(file); //se indica el archivo a leer
             BufferedReader reading = new BufferedReader(reader); //se pasa el archivo a leer

             content = reading.readLine();

             while(content != null) {
                 System.out.println(content);
                 content = reading.readLine();
             }
         } catch(IOException e) {
             e.printStackTrace(System.err);
         }
    }

    public static void main(String[] args) {
        TextFiles textFiles = new TextFiles();
        textFiles.createTextFIle();
        textFiles.writeTextFile();
      //  textFiles.deleteTextFile();
        textFiles.readFile();
     }
}