package me.oddlyoko.command;

import me.oddlyoko.ejws.EJWS;
import me.oddlyoko.ejws.base.exceptions.InvalidModuleDescriptorException;
import me.oddlyoko.ejws.base.exceptions.ModuleLoadException;
import me.oddlyoko.ejws.module.ModuleDescriptor;
import me.oddlyoko.ejws.module.TheModule;
import me.oddlyoko.ejws.util.ModuleHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class TestCommandModule {
    private CommandModule commandModule;

    @BeforeEach
    public void beforeEach() throws ModuleLoadException, IOException, InvalidModuleDescriptorException {
        EJWS.main(new String[]{});
        // Register this module
        ModuleDescriptor moduleDescriptor = ModuleHelper.getModuleDescriptorFromReader(
                new InputStreamReader(
                        Objects.requireNonNull(TestCommandModule.class.getClassLoader().getResourceAsStream("module_test.json"))));
        commandModule = new CommandModule();
        EJWS.get().getModuleManager().loadModule(TheModule.builder(moduleDescriptor, commandModule).build());
    }

    @AfterEach
    public void afterEach() {
        EJWS.get().unload();
    }

    @Test
    @DisplayName("Test getMagicNumber()")
    public void testGetMagicNumber() {
    }
}
