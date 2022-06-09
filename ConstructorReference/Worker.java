package ConstructorReference;

public class Worker {
    private String name;
    private String id;

    public Worker(){
        System.out.println("Worker() 실행");
    }

    public Worker(String id){
        System.out.println("Worker(String id) 실행");
        this.id=id;
    }

    public Worker(String name, String id){
        System.out.println("Worker(String name, String id) 실행");
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
