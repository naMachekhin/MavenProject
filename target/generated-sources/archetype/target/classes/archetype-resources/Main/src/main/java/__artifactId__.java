#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};
import ${package}.Output;
import ${package}.Reader;
public class ${artifactId} {
    public static void main(String[] args) {
        Output.print_with_delim(Reader.read_from_file("FileReader${symbol_escape}${symbol_escape}src${symbol_escape}${symbol_escape}main${symbol_escape}${symbol_escape}resources${symbol_escape}${symbol_escape}testFile.txt"));
    }
}
