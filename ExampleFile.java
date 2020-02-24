package lab4.distributedLockService;

import java.io.Serializable;

public class ExampleFile implements Serializable {
    String title;
    String someText;
    Boolean isFree;

    public ExampleFile(String title, String someText) {
        this.title = title;
        this.someText = someText;
        isFree = true;
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

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public synchronized boolean freeOrNot () {
        if (isFree) {
            isFree = false;
            return true;
        } else {
            return false;
        }
    }

    public synchronized void doFree () {
        isFree = true;
    }
}
