package view;

public interface Promptable {
    /**
     * Получение String
     */
    String promptString(String message);

    /**
     * Получение Int
     */
    Integer promptInt(String message);

    /**
     * Получение Double
     */
    Double promptDouble(String message);
}
