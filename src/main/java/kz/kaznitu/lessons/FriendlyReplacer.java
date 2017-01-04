package kz.kaznitu.lessons;


import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class FriendlyReplacer implements MethodReplacer{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Сәлем " + objects[0]);
        return null;
     }
}
