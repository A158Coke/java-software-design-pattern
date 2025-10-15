package com.yuChen.design_pattern.patterns.Order;

public abstract class Command {
    public abstract void execute();
}

class ExitCommand extends Command {
    @Override
    public void execute() {
        System.out.println("退出系统");
    }
}
class AddCommand extends Command {
    @Override
    public void execute() {
        System.out.println("添加用户");
    }
}

class FunctionButton {
    private final Command command;

    public FunctionButton(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }

    public static void main(String[] args) {
        FunctionButton exitButton = new FunctionButton(new ExitCommand());
        exitButton.onClick();
    }
}
