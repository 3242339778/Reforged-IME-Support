package com.gtnh.reforged.ime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.neoforged.fml.common.Mod;

/**
 * Entry point for the client-side IME compatibility mod.
 *
 * The first milestone intentionally observes the runtime without changing
 * Minecraft's input behavior. Platform hooks will be added after the SDL/IME
 * event path has been verified against the 26.3 runtime.
 */
@Mod(ReforgedIme.MOD_ID)
public final class ReforgedIme {
    public static final String MOD_ID = "reforged_ime";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public ReforgedIme() {
        LOGGER.info("Reforged IME Support initialized. Diagnostic hooks are not enabled yet.");
    }
}
