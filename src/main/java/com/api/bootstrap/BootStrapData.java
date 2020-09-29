package com.api.bootstrap;

import com.api.domain.Task;
import com.api.repository.CustomerRepository;
import com.api.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final TaskRepository taskRepository;

    public BootStrapData(CustomerRepository customerRepository, TaskRepository taskRepository) {
        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) {
//
//        System.out.println("Loading Customer Data");
//        customerRepository.save(new Customer("Michael","West"));
//            taskRepository.save(new Task("First task","Added task to test db"));
//            taskRepository.save(new Task("Second task","Added another task to test"));
//        System.out.println("Customer Saved: " + customerRepository.count());
    }
}
