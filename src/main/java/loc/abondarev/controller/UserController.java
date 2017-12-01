package loc.abondarev.controller;

import loc.abondarev.entity.User;
import loc.abondarev.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author abondarev.
 * @since 28.11.2017.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "showUser";
    }

    @GetMapping("/add")
    public String createUser() {
        return "addUser";
    }

    @PostMapping("/add")
    public String saveUser(@ModelAttribute("user") User user) {
        this.userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }

    @PostMapping("/update")
    public String setUser(@ModelAttribute("user") User user) {
        this.userService.update(user);
        return String.format("redirect:/user/%s", user.getId());
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        this.userService.delete(id);
        return "redirect:/users";
    }
}
