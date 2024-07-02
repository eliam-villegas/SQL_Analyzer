package sql;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;

public class ErrorListener extends BaseErrorListener {
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        Token token = (Token) offendingSymbol;
        CharStream inputStream = token.getTokenSource().getInputStream();
        String input = inputStream.getText(new Interval(0, inputStream.size() - 1));
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];

        StringBuilder highlightedErrorLine = new StringBuilder();
        highlightedErrorLine.append(errorLine, 0, charPositionInLine);
        highlightedErrorLine.append("\"\"\"");  // Inicio
        highlightedErrorLine.append(errorLine, charPositionInLine, charPositionInLine + token.getText().length());
        highlightedErrorLine.append("\"\"\"");  // Fin
        highlightedErrorLine.append(errorLine.substring(charPositionInLine + token.getText().length()));

        String errorMsg = String.format("Error en la linea %d:%d %s%n%s",
                line, charPositionInLine, msg, highlightedErrorLine.toString());
        errors.add(errorMsg);
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
