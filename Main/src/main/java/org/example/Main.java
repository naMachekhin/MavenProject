package org.example;
import org.example.Output;
import org.example.Reader;
public class Main {
    public static void main(String[] args) {
        Output.print_with_delim(Reader.read_from_file("FileReader\\src\\main\\resources\\testFile.txt"));
    }
}
