package me.oddlyoko.permission;

import me.oddlyoko.ejws.EJWS;
import me.oddlyoko.ejws.module.Module;
import me.oddlyoko.ejws.module.TheModule;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PermissionAttachment {
    private final Permissible permissible;
    private final Module module;
    private final TheModule<? extends Module> theModule;
    private final Map<String, Boolean> permissions;

    public PermissionAttachment(Permissible permissible, Module module) {
        this.permissible = permissible;
        this.module = module;
        Optional<? extends TheModule<? extends Module>> theModule = EJWS.get().getModuleManager().getTheModule(module.getClass());
        if (theModule.isEmpty())
            throw new IllegalArgumentException(String.format("Cannot find TheModule of given module (%s)", module.getClass().getName()));
        this.theModule = theModule.get();
        this.permissions = new HashMap<>();
    }

    public Permissible getPermissible() {
        return permissible;
    }

    public Module getModule() {
        return module;
    }

    public TheModule<? extends Module> getTheModule() {
        return theModule;
    }

    public boolean hasPermission(String permission) {
        return permissions.get(permission);
    }

    public void setPermission(String permission, boolean value) {
        permissions.put(permission, value);
    }

    public void unsetPermission(String permission) {
        permissions.remove(permission);
    }
}
