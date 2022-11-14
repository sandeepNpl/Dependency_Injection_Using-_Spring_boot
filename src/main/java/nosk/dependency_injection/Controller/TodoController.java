package nosk.dependency_injection.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import nosk.dependency_injection.model.Todo;

import java.util.List;

@RestController
public class TodoController {

      private List<Todo> todoList = List.of(

              new Todo(1, "Read Novel", false),
                new Todo(2, "Play River Cross Game For AI", false)

      );



     @GetMapping("/todos")
    public List<Todo> todos() {
         return todoList;

         }

    @GetMapping("/todos/{id}")
    public Todo getSingleList(@PathVariable int id){
         for(Todo todo : todoList){
             if(todo.getId() == id){
                 return  todo;
             }
         }

        return null;

    }

}
