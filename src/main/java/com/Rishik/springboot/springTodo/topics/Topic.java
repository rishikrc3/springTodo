package com.Rishik.springboot.springTodo.topics;

public class Topic {

    private int id;
    private String name ;


    public Topic(int id,String name)
    {
        this.id=id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

    public void  setName(String name)
    {
        this.name = name;
    }
    public void setId(int id)
    {
        this.id = id;
    }

}
