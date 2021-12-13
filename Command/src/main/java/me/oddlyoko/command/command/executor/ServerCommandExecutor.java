package me.oddlyoko.command.command.executor;

public class ServerCommandExecutor implements CommandExecutor {
    @Override
    public String getName() {
        return "EJWS";
    }

    @Override
    public boolean isServer() {
        return true;
    }
}
