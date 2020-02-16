package lab4.distributedLockService;

public class Request {
    String currentFile;
    String desiredFile;

    public String getCurrentFile() {
        return currentFile;
    }

    public void setCurrentFile(String currentFile) {
        this.currentFile = currentFile;
    }

    public String getDesiredFile() {
        return desiredFile;
    }

    public void setDesiredFile(String desiredFile) {
        this.desiredFile = desiredFile;
    }
}
