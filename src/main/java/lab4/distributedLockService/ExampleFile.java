package lab4.distributedLockService;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ILock;

import java.io.Serializable;

public class ExampleFile implements Serializable {
    String title;
    String someText;

    public ExampleFile(String title, String someText) {
        this.title = title;
        this.someText = someText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
