package me.oddlyoko.command.command.handler;

import java.util.Optional;

@FunctionalInterface
public interface CommandHandler {

    /**
     * Transform given argument into a usable object if specific argument matches {@link CommandHandler}
     *
     * @param arg The argument
     * @param ctx The {@link ContextCommandHandler}
     * @return Transformed object, or empty Optional if given argument doesn't match {@link CommandHandler}
     */
    Optional<Object> transform(String arg, ContextCommandHandler ctx);
}
