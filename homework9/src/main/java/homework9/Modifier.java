package homework9;

public class Modifier {
    public static void applyModifications(String text) {

        char a = text.charAt(text.length() - 1);
        System.out.println("Последний символ строки: " + a);
        System.out.println("Заканчивается ли ваша строка подстрокой “!!!”: " + text.endsWith("!!!"));
        System.out.println("Начинается ли ваша строка подстрокой “I like”: " + text.startsWith("I like"));
        System.out.println("Содержит ли ваша строка подстроку “Java”: " + text.contains("Java"));
        int x = text.indexOf("Java");
        System.out.println("Позиция подстроки “Java”: " + x);
        System.out.println("Все символы “а” заменены на “о”: " + text.replaceAll("a", "o"));
        System.out.println("Строка в верхнем регистре: " + text.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + text.toLowerCase());
        System.out.println("Вырезать строку Java”: " + text.substring(x, 4 + x));

    }
}
