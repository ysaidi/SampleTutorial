package de.hahn.blog.gittest;

public class Calculator {
    public Calculator() {
        super();
    }
    
public Integer add(Integer param1,Integer param2){
        if(param1!=null && param2!=null)
            return param1 + param2;
        else
            return null;
    }

    public Integer subtraction(Integer param1,Integer param2){
            if(param1!=null && param2!=null)
                return param1 - param2;
            else
                return null;
        }
}
