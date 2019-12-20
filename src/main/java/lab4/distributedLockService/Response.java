package lab4.distributedLockService;

public class Response {
    String title;
    String text;
    String status;

    ExampleFile exampleFile;
    Boolean availability;

    public Response(String title, String text, String status, ExampleFile exampleFile, Boolean availability) {
        this.title = title;
        this.text = text;
        this.status = status;
        this.exampleFile = exampleFile;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExampleFile getExampleFile() {
        return exampleFile;
    }

    public void setExampleFile(ExampleFile exampleFile) {
        this.exampleFile = exampleFile;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
