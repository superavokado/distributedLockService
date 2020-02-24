package lab4.distributedLockService;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ReplicatedMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class MyController {
    private static HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
    private static ReplicatedMap<String, ExampleFile> IdAndFile = hazelcastInstance.getReplicatedMap("IdAndFile");


    @GetMapping("/exampleFileNames")
    public Set<String> getExampleFileNames() {
        for (int i = 0; i < 5; i++) {
            String someText = "";
            for (int j = 0; j < 5; j++) {
                someText = someText + "SOME TEXT ";
            }
            ExampleFile file = new ExampleFile("SOME TITLE " + i, someText);
            IdAndFile.put(file.title, file);
        }
        return IdAndFile.keySet();
    }

    @PostMapping("/openFile")
    public Response openFile(@RequestBody Request request) {
        try {
            System.out.println(request.currentFile);
            System.out.println(request.desiredFile);
            System.out.println("HERE");
            if (IdAndFile.get(request.desiredFile).freeOrNot()) {
                try {
                    IdAndFile.get(request.currentFile).doFree();
                } catch (Exception e) {

                }
                Response response = new Response("Поздравляем!", "Файл доступен!", "success", IdAndFile.get(request.desiredFile), true);
                return response;
            } else {
                Response response = new Response("Извините!", "Ресурс занят, подождите!", "warning",false);
                return response;
            }
        } catch (Exception e) {
            System.out.println(e);
            Response response = new Response("Извините!", "Ошибка сервера!", "error",false);
            return response;
        }
    }
}

