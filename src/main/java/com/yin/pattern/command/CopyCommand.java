package com.yin.pattern.command;

/**
 * Created by Administrator on 2019/11/5.
 */
public class CopyCommand extends Command {

    private Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg += content.msg;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length()/2);
    }
}
