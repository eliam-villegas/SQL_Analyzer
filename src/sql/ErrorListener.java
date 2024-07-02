package sql;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

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
        String input = ((Token) offendingSymbol).getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        StringBuilder errorPointer = new StringBuilder();
        for (int i = 0; i < charPositionInLine; i++) {
            errorPointer.append(" ");
        }
        errorPointer.append("^^^");

        String errorMsg = String.format("line %d:%d %s%n%s%n%s",
                line, charPositionInLine, msg, errorLine, errorPointer.toString());
        errors.add(errorMsg);
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
