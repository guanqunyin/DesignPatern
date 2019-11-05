package com.yin.pattern.command;

/**
 * Created by Administrator on 2019/11/5.
 */
public class InsertCommand extends Command{

    String insertMsg = ", www.guanqunyin.com";

    private Content content;

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg += insertMsg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.lastIndexOf(insertMsg));
    }
}
