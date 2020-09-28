package com.api.demo.bootstrap;

import com.api.demo.domain.Task;
import com.api.demo.repository.CustomerRepository;
import com.api.demo.repository.TaskRepository;
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
//            taskRepository.save(new Task("Second task","AAdded another task to test"));
//        System.out.println("Customer Saved: " + customerRepository.count());
    }
}
