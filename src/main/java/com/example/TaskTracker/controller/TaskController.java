package com.example.TaskTracker.controller;
import com.example.TaskTracker.model.Task;
import com.example.TaskTracker.repository.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getTasks(Model model) {
        model.addAttribute("tasks", repository.findAll());
        model.addAttribute("task", new Task());
        return "tasks";
    }

    @PostMapping
    public String addTask(@ModelAttribute Task task) {
        repository.save(task);
        return "redirect:/tasks";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/tasks";
    }

    @PostMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        Task task = repository.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        repository.save(task);
        return "redirect:/tasks";
    }
    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable Long id, Model model) {
        Task task = repository.findById(id).orElseThrow();
        model.addAttribute("task", task);
        return "edit-task";
    }

    @PostMapping("/update")
    public String updateTask(@ModelAttribute Task task) {
        repository.save(task); // save() updates when ID exists
        return "redirect:/tasks";
    }
}