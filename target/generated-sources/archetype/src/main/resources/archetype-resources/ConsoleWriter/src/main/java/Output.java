#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class Output {
    public static void print_with_delim(String text)
    {
        delimiter();
        System.out.print(text);
        delimiter();
    }

    public static void delimiter()
    {
        System.out.println("--------------------");
    }
}
