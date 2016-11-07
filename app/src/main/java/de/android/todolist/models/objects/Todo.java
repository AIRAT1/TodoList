package de.android.todolist.models.objects;

/**
 * This class is intended to represented data which we can expect to be associated with a To Do object
 */
public class Todo {
    private String todoContent, todoCreationDate, todoReminderDate;

    /**
     * @param todoReminderDate - Date specified for App to remind user
     * @param todoCreationDate - Date which the to do was create
     * @param todoContent      - Description of what the to do is supposed to remind the user of
     */
    public Todo(String todoContent, String todoCreationDate, String todoReminderDate) {
        this.todoContent = todoContent;
        this.todoCreationDate = todoCreationDate;
        this.todoReminderDate = todoReminderDate;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public String getTodoCreationDate() {
        return todoCreationDate;
    }

    public void setTodoCreationDate(String todoCreationDate) {
        this.todoCreationDate = todoCreationDate;
    }

    public String getTodoReminderDate() {
        return todoReminderDate;
    }

    public void setTodoReminderDate(String todoReminderDate) {
        this.todoReminderDate = todoReminderDate;
    }
}
