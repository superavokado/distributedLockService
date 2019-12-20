package lab4.distributedLockService;

import com.hazelcast.core.ILock;

public class ExampleFile {
    String title;
    String someText;
    private static ILock lock = DistributedLockServiceApplication.hazelcastInstance.getLock("Lock");

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
