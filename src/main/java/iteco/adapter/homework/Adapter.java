package iteco.adapter.homework;

public class Adapter {

    private RandomGenerator generator;

    public Adapter(RandomGenerator generator) {
        this.generator = generator;
    }

    public int[] generate(int length) {
        int[] values = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = generator.getRandomNumber();
        }
        return values;
    }

}
