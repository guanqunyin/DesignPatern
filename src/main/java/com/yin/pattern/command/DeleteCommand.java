package com.yin.pattern.command;

/**
 * Created by Administrator on 2019/11/5.
 */
public class DeleteCommand extends Command {

    private String deleted;

    Content content;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        deleted = content.msg.substring(0, 5);
        content.msg = content.msg.substring(5, content.msg.length());
    }

    @Override
    public void undo() {
        content.msg = deleted + content.msg;
    }
}
