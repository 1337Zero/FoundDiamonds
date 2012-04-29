/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.seed419.FoundDiamonds;

/**
 *
 * @author seed419
 */
public class Config {


    private FoundDiamonds fd;

//Main
    public static String disableInCreative = "Found Diamonds Configuration.Main.Disable in creative mode";
    public static String opsAsFDAdmin = "Found Diamonds Configuration.Main.Give OPs all permissions";


//Light level
    public static String percentOfLightRequired = "Found Diamonds Configuration.Light Level.Minimum amount of light required to mine ore";
    public static String lightLevelBlocks = "Found Diamonds Configuration.Light Level.Monitored Blocks";

    public static String kickOnTrapBreak = "Found Diamonds Configuration.Traps.Kick players on trap break";
    //Message not configurable in game
    public static String kickMessage = "Found Diamonds Configuration.Traps.Kick message";
    public static String banOnTrapBreak = "Found Diamonds Configuration.Traps.Ban players on trap break";
    public static String adminAlertsOnAllTrapBreaks = "Found Diamonds Configuration.Traps.Admin alerts on all trap breaks";

//Items
    public static String itemsForFindingDiamonds = "Found Diamonds Configuration.Awards.Items.Random items for finding diamonds";
    public static String chanceToGetItem = "Found Diamonds Configuration.Awards.Items.Percent of time items are given";
    //Random items not configurable in game
    public static String randomItem1 = "Found Diamonds Configuration.Awards.Items.Random Item 1";
    public static String randomItem2 = "Found Diamonds Configuration.Awards.Items.Random Item 2";
    public static String randomItem3 = "Found Diamonds Configuration.Awards.Items.Random Item 3";

//Spells
    public static String mushrooms = "Found Diamonds Configuration.Awards.Spells.Psychoactive mushrooms";
    public static String potionsForFindingDiamonds = "Found Diamonds Configuration.Awards.Spells.Random spells for finding diamonds";
    public static String potionStrength = "Found Diamonds Configuration.Awards.Spells.Spell strength (1-5)";
    public static String chanceToGetPotion = "Found Diamonds Configuration.Awards.Spells.Percent of time spells are casted";
    //Spell messages
    public static String jump = "Found Diamonds Configuration.Awards.Spells.Messages.Jump";
    public static String fireresist = "Found Diamonds Configuration.Awards.Spells.Messages.Fire Resistance";
    public static String strength = "Found Diamonds Configuration.Awards.Spells.Messages.Strength";
    public static String waterbreathe = "Found Diamonds Configuration.Awards.Spells.Messages.Water Breathing";
    public static String resist = "Found Diamonds Configuration.Awards.Spells.Messages.Resistance";
    public static String fastdig = "Found Diamonds Configuration.Awards.Spells.Messages.Fast Digging";
    public static String regeneration = "Found Diamonds Configuration.Awards.Spells.Messages.Regeneration";
    public static String speed = "Found Diamonds Configuration.Awards.Spells.Messages.Speed";

//Broadcasts
    public static String broadcastedBlocks = "Found Diamonds Configuration.Broadcasts.Broadcasted Blocks";
    //Message not configurable in game
    public static String bcMessage = "Found Diamonds Configuration.Broadcasts.Options.Message";
    public static String useNick = "Found Diamonds Configuration.Broadcasts.Options.Use player nicknames";
    public static String useOreColors = "Found Diamonds Configuration.Broadcasts.Options.Use classic ore colors for ores";

//Logging
    public static String logTrapBreaks = "Found Diamonds Configuration.Logging.Trap breaks";
    public static String logLightLevelViolations = "Found Diamonds Configuration.Logging.Light Level Violations";
    public static String logDiamondBreaks = "Found Diamonds Configuration.Logging.Log all diamond ore breaks";
    public static String cleanLog = "Found Diamonds Configuration.Logging.Clean log (all ores)";
    public static String enabledWorlds = "Found Diamonds Configuration.Enabled Worlds";

//Admin messages
    public static String adminMessageBlocks = "Found Diamonds Configuration.Admin Messages.Admin Message Blocks";

//Debug
    public static String debug = "Found Diamonds Configuration.Debug.Enabled";


    public Config(FoundDiamonds fd) {
        this.fd = fd;
    }

    public void load() {
        fd.getConfig().options().copyDefaults(true);
        fd.saveConfig();
    }
}