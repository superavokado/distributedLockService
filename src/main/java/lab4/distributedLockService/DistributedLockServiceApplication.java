package lab4.distributedLockService;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributedLockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedLockServiceApplication.class, args);
	}

}
