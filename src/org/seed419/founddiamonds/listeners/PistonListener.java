package org.seed419.founddiamonds.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.seed419.founddiamonds.handlers.TrapHandler;

/**
 * Attribute Only (Public) License
 * Version 0.a3, July 11, 2011
 * <p/>
 * Copyright (C) 2012 Blake Bartenbach <seed419@gmail.com> (@seed419)
 * <p/>
 * Anyone is allowed to copy and distribute verbatim or modified
 * copies of this license document and altering is allowed as long
 * as you attribute the author(s) of this license document / files.
 * <p/>
 * ATTRIBUTE ONLY PUBLIC LICENSE
 * TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 * <p/>
 * 1. Attribute anyone attached to the license document.
 * Do not remove pre-existing attributes.
 * <p/>
 * Plausible attribution methods:
 * 1. Through comment blocks.
 * 2. Referencing on a site, wiki, or about page.
 * <p/>
 * 2. Do whatever you want as long as you don't invalidate 1.
 *
 * @license AOL v.a3 <http://aol.nexua.org>
 */
public class PistonListener implements Listener {


    public TrapHandler trap;


    public PistonListener(TrapHandler trap) {
        this.trap = trap;
    }


    @EventHandler
    void onPistonExtend(BlockPistonRetractEvent event) {
        if (trap.isTrapBlock(event.getBlock().getLocation())) {
            System.out.println("It's a trap block");
            event.setCancelled(true);
        }
    }

    @EventHandler
    void onPistonRetract(BlockPistonExtendEvent event) {
        if (trap.isTrapBlock(event.getBlock().getLocation())) {
            System.out.println("Trap block attempted to move");
            event.setCancelled(true);
        }
    }

}
