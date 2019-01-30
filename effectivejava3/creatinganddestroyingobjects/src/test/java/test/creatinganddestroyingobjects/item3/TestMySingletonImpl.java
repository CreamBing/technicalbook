package test.creatinganddestroyingobjects.item3;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3.MySingleton;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3.MySingletonImpl;
import org.junit.Test;

public class TestMySingletonImpl {

    private MySingleton singleton = MySingletonImpl.getInstance();

    @Test
    public void testDoSomething(){
        singleton.doSomething();
    }
}
