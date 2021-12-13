package me.oddlyoko.permission;

import me.oddlyoko.ejws.event.Event;
import me.oddlyoko.ejws.module.Module;

import java.util.List;

public class PermissionModule extends Module {
    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public List<Class<? extends Event>> getModuleEvents() {
        return List.of();
    }
}
