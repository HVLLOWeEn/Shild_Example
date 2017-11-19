package example14_lambda_expression;
import java.io.*;

// Функциональный интерфейс, с генерацией исключения
public interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
