package basics;

import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            canThrowAnException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        canThrowRuntimeException();
    }

    private static void canThrowRuntimeException() {
        throw new IllegalStateException();
    }

    static void canThrowAnException() throws IOException {
        throw new IOException();
    }
}
