import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream charStream = new ANTLRFileStream("src/input.txt");

        MathLexer lexer = new MathLexer(charStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MathParser parser = new MathParser(tokenStream);

        parser.setBuildParseTree(true);

        MathParser.MathContext mathContext = parser.math();

        ParseTreeWalker treeWalker = new ParseTreeWalker();

        MathBaseListener listener = new MathBaseListener();

        treeWalker.walk(listener, mathContext);
    }
}
