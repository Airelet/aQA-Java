package homework3;

public class Homework3 {
    public static void main(String[] args) {

        final char character = 'a';
        System.out.println(character);

        final byte age = 26;
        System.out.println(age);

        final short year = 2007;
        System.out.println(year);

        final int index = 2;
        System.out.println(index);

        final long taxID = 1234567890;
        System.out.println(taxID);

        final float height = 1.65f;
        System.out.println(height);

        final double weight = 145.84157327;
        System.out.println(weight);

        final boolean isActive = true;
        System.out.println(isActive);

        short temp = year + age;
        System.out.println(temp);

        temp -= index;
        System.out.println(temp);

        float heightCm =  height * 100;
        System.out.println(heightCm);

        double weightTons = weight/1000;
        System.out.println(weightTons);
    }
}