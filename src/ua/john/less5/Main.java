package ua.john.less5;

import java.util.HashMap;
import java.util.List;

public class Main {

    {
        i = 4;
        System.out.println(this.i);
    }
    int i = 5;

    enum Type {
        INT(true) {
            public Object parse(String string) { return Integer.valueOf(string); }
        },
        INTEGER(false) {
            public Object parse(String string) { return Integer.valueOf(string); }
        },
        STRING(false) {
            public Object parse(String string) { return string; }
        };

        boolean primitive;
        Type(boolean primitive) { this.primitive = primitive; }

        public boolean isPrimitive() { return primitive; }
        public abstract Object parse(String string);
    }

    static HashMap<String,String[]> models = new HashMap<>();
    {
        models.put("AUDI",new String[]{"A1","A2"});
    }

    enum colors{

    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Type.class);
        System.out.println(Type.INT.getClass() + " " + Type.INT.getClass().getSuperclass());
        System.out.println(Type.INTEGER.getClass() + " " + Type.INTEGER.getClass().getSuperclass());
        System.out.println(Type.STRING.getClass()  + " " + Type.STRING.getClass().getSuperclass());
    }
}
