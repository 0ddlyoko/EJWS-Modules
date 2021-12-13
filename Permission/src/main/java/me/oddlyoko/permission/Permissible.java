package me.oddlyoko.permission;

import me.oddlyoko.ejws.module.Module;

public interface Permissible {

    /**
     * @return The name of the entity
     */
    String getName();

    /**
     * Check if this entity has given permission
     *
     * @param permission The permission to check if given entity has
     * @return <i>true</i> If current {@link Permissible} has given permission
     */
    boolean hasPermission(String permission);

    /**
     * Add a new {@link PermissionAttachment}
     *
     * @param module The {@link Module} that wants to assign a new {@link PermissionAttachment} to this {@link Permissible}
     * @return A new {@link PermissionAttachment} where you can add permissions to this {@link Permissible}
     */
    PermissionAttachment addAttachment(Module module);

    /**
     * Add a new {@link PermissionAttachment} with given permission set to given value
     *
     * @param module     The {@link Module} that wants to assign a new {@link PermissionAttachment} to this {@link Permissible}
     * @param permission The permission to add to created {@link PermissionAttachment}
     * @param value      The value of the permission
     * @return A new {@link PermissionAttachment} where you can add permissions to this {@link Permissible}
     */
    PermissionAttachment addAttachment(Module module, String permission, boolean value);

    /**
     * Remove given {@link PermissionAttachment}
     *
     * @param attachment The {@link PermissionAttachment} to remove
     */
    void removeAttachment(PermissionAttachment attachment);

    /**
     * Recalculate permissions for this {@link Permissible} if a {@link PermissionAttachment} has been edited
     */
    void recalculatePermissions();
}
