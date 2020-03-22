package ru.job4j.ex;

/**
 * Возникает когда найденное слово попадает в
 * запрещенный список.
 */
public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException(String message) {
        super(message);
    }
}
