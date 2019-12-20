package lab4.distributedLockService;

import com.hazelcast.core.ReplicatedMap;

public class FileCreator {

    public static ReplicatedMap<String, ExampleFile> create() {
        ReplicatedMap<String, ExampleFile> IdAndFile = DistributedLockServiceApplication.hazelcastInstance.getReplicatedMap("IdAndFile");

        ExampleFile file1 = new ExampleFile("Hazelcast Delivers.", "New data-enabled applications can deliver transformative business power – if they meet today’s requirement of immediacy. The Hazelcast platform lets you build the fastest applications by accessing a scalable, shared pool of RAM across a cluster of computers.");
        ExampleFile file2 = new ExampleFile("Long Live Distributed Locks!", "In line with Hazelcast’s tradition, the coordinating component of the protocol is an object that extends the semantics of java.util.concurrent.locks.Lock. We call it FencedLock, following the naming used in Martin Kleppmann’s 2016 post “How to Do Distributed Locking”.");
        ExampleFile file3 = new ExampleFile("Зачёт у Ивана)", "Можно 25?))");

        IdAndFile.put(file1.title, file1);
        IdAndFile.put(file2.title, file2);
        IdAndFile.put(file3.title, file3);

        return IdAndFile;
    }
}
