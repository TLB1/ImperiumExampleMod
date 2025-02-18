package com.example;

import tlb1.imperium.core.Command;
import tlb1.imperium.core.Commands;
import tlb1.imperium.mods.GenericModLauncher;

import static tlb1.imperium.core.ConsoleOut.Dialogue.*;

public class ModLauncher implements GenericModLauncher {

    @Override
    public void onInitialise() {

        Commands.register(new Command("example", "world",
                (args) -> System.out.println(formatColor("Hello, World!", ANSI_PURPLE))
        ));

        Commands.register(new Command("example", "hello", new String[]{"name"},
                (args) -> {
                    System.out.println(formatColor("Hello, World %s!".formatted(args[0]), ANSI_CYAN));
                    System.out.println(formatColor("1+1 = %s".formatted(1+1), ANSI_PURPLE));
                }
        ));

    }

    @Override
    public void onDestroy() {

    }
}
