package me.oddlyoko.command.command.executor;

public interface CommandExecutor {
    /**
     * Get the name of the executor of a command<br />
     * Used to know who entered the command
     *
     * @return
     */
    String getName();

    /**
     * Check if this {@link CommandExecutor} is a server
     *
     * @return <i>true</i> if this {@link CommandExecutor} is a server.
     * <i>false</i> otherwise
     */
    default boolean isServer() {
        return false;
    }
}
