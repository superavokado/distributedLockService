package lab4.distributedLockService;

import com.hazelcast.core.ReplicatedMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Set;

@RestController
public class MyController {
    private static ArrayList<Result> results = new ArrayList<>();
    private static ReplicatedMap<String, ExampleFile> IdAndFile = FileCreator.create();;


    @GetMapping("/exampleFileNames")
    public Set<String> getExampleFileNames() {
        return IdAndFile.keySet();
    }

    @PostMapping("/openFile")
    public Response openFile(@RequestBody String currentFile, String desiredFile) {

        Response response = new Response("OK", "OK", "success", new ExampleFile("ok", "ok"), true);
        return response;
    }
}

