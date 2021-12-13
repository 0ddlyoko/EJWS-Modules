import me.oddlyoko.command.CommandModule;

module CommandModule {
    requires EJWS;

    provides me.oddlyoko.ejws.module.Module with CommandModule;
}
