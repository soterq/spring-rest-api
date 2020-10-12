package com.api.bootstrap;

import com.api.domain.Task;
import com.api.domain.User;
import com.api.enums.Severity;
import com.api.repository.CustomerRepository;
import com.api.repository.TaskRepository;
import com.api.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public BootStrapData(CustomerRepository customerRepository, TaskRepository taskRepository, UserRepository userRepository) {
        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
//
//        System.out.println("Loading Customer Data");
//        customerRepository.save(new Customer("Michael","West"));
            taskRepository.save(new Task("Severity Test","Test if severity field is working", Severity.LOW));
//            taskRepository.save(new Task("Second task","Added another task to test"));
//        System.out.println("Customer Saved: " + customerRepository.count());
//            userRepository.save(new User("sudo","admin","SudoAdmin@global.com"));

    }
}
