package de.hahn.blog.gittest;

public class GitTestMain {
    public GitTestMain() {
        super();
    }
    
    public String sayHello(String name){
        return "Hello "+name;
    }

    public static void main(String[] args) {
        GitTestMain gitTestMain = new GitTestMain();
        
        System.out.println("For test run - no actions");
    }
}
