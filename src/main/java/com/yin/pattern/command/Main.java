package com.yin.pattern.command;

/**
 * Created by Administrator on 2019/11/5.
 */
public class Main {

    public static void main(String[] args) {
        Content content = new Content();
        Command insertCommand = new InsertCommand(content);
        insertCommand.doit();
        System.out.println(content.msg);
        insertCommand.undo();
        System.out.println(content.msg);


        Command deleteCommand = new DeleteCommand(content);
        deleteCommand.doit();
        System.out.println(content.msg);
        deleteCommand.undo();
        System.out.println(content.msg);

        Command copyCommand = new CopyCommand(content);
        copyCommand.doit();
        System.out.println(content.msg);
        copyCommand.undo();
        System.out.println(content.msg);


    }
}
