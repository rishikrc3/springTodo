package com.Rishik.springboot.springTodo.topics;

public class Topic {

    private String id;
    private String name ;


    public Topic(String id,String name)
    {
        this.id=id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public String  getId()
    {
        return id;
    }

    public void  setName(String name)
    {
        this.name = name;
    }
    public void setId(String id)
    {
        this.id = id;
    }

}