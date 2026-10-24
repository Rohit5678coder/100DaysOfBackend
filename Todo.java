package com.rohit.todo_api;

public class Todo {
    private int id;
    private String title;
    private boolean completed;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCompleted() { return completed; }[200~cd ~/100DaysOfBackend/projects/todo-api/src/main/java/com/rohit/todo_api
cat > Todo.java << 'EOF'
package com.rohit.todo_api;

public class Todo {
    private int id;
    private String title;
    private boolean completed;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
