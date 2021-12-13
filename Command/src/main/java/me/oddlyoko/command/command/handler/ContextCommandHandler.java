package me.oddlyoko.command.command.handler;

import me.oddlyoko.command.command.executor.CommandExecutor;

/**
 * Context used for
 */
public class ContextCommandHandler {
    private final CommandExecutor executor;

    static class ContextCommandHandlerBuilder {
        private CommandExecutor executor;

        public ContextCommandHandlerBuilder executor(CommandExecutor executor) {
            this.executor = executor;
            return this;
        }

        public void build() {
        }
    }
}
