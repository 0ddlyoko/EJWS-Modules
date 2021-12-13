package me.oddlyoko.command.command;

import me.oddlyoko.command.command.handler.CommandHandler;

import java.util.*;

public class Command {
    private final Set<CommandHandler> children;

    private Command(Set<CommandHandler> children) {
        this.children = Collections.unmodifiableSet(children);
    }

    public Set<CommandHandler> getChildren() {
        return children;
    }

    public static CommandBuilder builder() {
        return new CommandBuilder();
    }

    public static class CommandBuilder {
        private final Set<CommandHandler> children = new HashSet<>();

        private CommandBuilder() {}

        public CommandBuilder child(CommandHandler... child) {
            this.children.addAll(Arrays.asList(child));
            return this;
        }

        public Command build() {
            return new Command(children);
        }
    }
}
