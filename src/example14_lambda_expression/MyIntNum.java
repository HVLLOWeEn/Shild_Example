package example14_lambda_expression;

// Демонстрация ссылки на методы экземпляров
public class MyIntNum {
    private int v;

    public MyIntNum(int v) { this.v = v; }
    public int getNum() { return this.v; }

    // Возвращает true, если n делитель v
    public boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
