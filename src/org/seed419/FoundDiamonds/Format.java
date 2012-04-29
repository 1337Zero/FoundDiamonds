package org.seed419.FoundDiamonds;

import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;

/**
 * Created with IntelliJ IDEA.
 * User: seed419
 * Date: 4/12/12
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Format {

    FoundDiamonds fd;
    Config config;


    public Format(FoundDiamonds fd, Config config) {
        this.fd = fd;
        this.config = config;

    }

    // Handles special material names that don't work right with the broadcast.
    public static String getFormattedName(Material mat, int total) {
        String matName;
        if (mat == Material.GLOWING_REDSTONE_ORE || mat == Material.REDSTONE_ORE) {
            if (total > 1) {
                matName = "redstone ores";
            } else {
                matName = "redstone ore";
            }
        } else if (mat == Material.OBSIDIAN) {
            matName = "obsidian";
        } else if (mat == Material.LONG_GRASS) {
            if (total > 1) {
                matName = "long grasses";
            } else {
                matName = "long grass";
            }
        } else if (mat == Material.ICE) {
            if (total > 1) {
                matName = "blocks of ice";
            } else {
                matName = "block of ice";
            }
        } else if (mat == Material.SNOW || mat == Material.SNOW_BLOCK) {
            if (total > 1) {
                matName = "snow blocks";
            } else {
                matName = "snow block";
            }
        } else if (mat == Material.CLAY) {
            if (total > 1) {
                matName = "clay blocks";
            } else {
                matName = "clay block";
            }
        } else if (mat == Material.JUKEBOX) {
            if (total > 1) {
                matName = "jukeboxes";
            } else {
                matName = "jukebox";
            }
        } else if (mat == Material.BED_BLOCK) {
            if (total > 1) {
                matName = "beds";
            } else {
                matName = "bed";
            }
        } else if (mat == Material.BOOKSHELF) {
            if (total > 1) {
                matName = "bookshelves";
            } else {
                matName = "bookshelf";
            }
        } else if (mat == Material.LEAVES) {
            if (total > 1) {
                matName = "leaves";
            } else {
                matName = "leaf";
            }
        } else if (mat == Material.IRON_DOOR_BLOCK) {
            if (total > 1) {
                matName = "iron doors";
            } else {
                matName = "iron door";
            }
        } else if (mat == Material.REDSTONE_TORCH_ON || mat == Material.REDSTONE_TORCH_OFF) {
            if (total > 1) {
                matName = "redstone torches";
            } else {
                matName = "redstone torch";
            }
        }  else if (mat == Material.NETHER_WARTS) {
            if (total > 1) {
                matName = "nether warts";
            } else {
                matName = "nether wart";
            }
        } else if (mat == Material.WOOD_STAIRS) {
            matName = "wooden stairs";
        } else if (mat == Material.COBBLESTONE_STAIRS) {
            matName = "cobblestone stairs";
        } else if (mat == Material.STONE) {
            matName = "stone";
        } else if (mat == Material.GLASS) {
            matName = "glass";
        } else if (mat == Material.TNT) {
            matName = "TNT";
        } else if (mat == Material.SAND) {
            matName = "sand";
        } else if (mat == Material.DIRT) {
            matName = "dirt";
        } else if (mat == Material.NETHERRACK) {
            matName = "netherrack";
        } else if (mat == Material.SOUL_SAND) {
            matName = "soul sand";
        } else if (mat == Material.BEDROCK) {
            matName = "bedrock";
        } else if (mat == Material.SOIL) {
            if (total > 1) {
                matName = "soil blocks";
            } else {
                matName = "soil block";
            }
        } else if (mat == Material.DIODE_BLOCK_OFF || mat == Material.DIODE_BLOCK_ON) {
            if (total > 1) {
                matName = "repeaters";
            } else {
                matName = "repeater";
            }
        } else if (mat == Material.CAKE_BLOCK) {
            if (total > 1) {
                matName = "cakes";
            } else {
                matName = "cake";
            }
        } else if (mat == Material.THIN_GLASS) {
            if (total > 1) {
                matName = "pieces of thin glass";
            } else {
                matName = "piece of thin glass";
            }
        } else if (mat == Material.MELON_BLOCK) {
            if (total > 1) {
                matName = "melons";
            } else {
                matName = "melon";
            }
        } else if (mat == Material.GRAVEL) {
            if (total > 1) {
                matName = "gravel blocks";
            } else {
                matName = "gravel block";
            }
        } else if (mat == Material.GRASS) {
            if (total > 1) {
                matName = "grass blocks";
            } else {
                matName = "grass block";
            }
        } else if (mat == Material.SUGAR_CANE_BLOCK) {
            if (total > 1) {
                matName = "sugar canes";
            } else {
                matName = "sugar cane";
            }
        } else if (mat == Material.CROPS) {
            if (total > 1) {
                matName = "crops";
            } else {
                matName = "crop";
            }
        } else if (mat == Material.RAILS) {
            if (total > 1) {
                matName = "rails";
            } else {
                matName = "rail";
            }
        } else if (mat == Material.WOOD) {
            if (total > 1) {
                matName = "wooden planks";
            } else {
                matName = "wooden plank";
            }
        } else if (mat == Material.CACTUS) {
            if (total > 1) {
                matName = "cacti";
            } else {
                matName = "cactus";
            }
        } else if (mat == Material.WOOL) {
            matName = "wool";
        } else if (mat == Material.TORCH) {
            if (total > 1) {
                matName = "torches";
            } else {
                matName = "torch";
            }
        } else if (mat == Material.COBBLESTONE) {
            matName = "cobblestone";
        } else if (mat == Material.SANDSTONE) {
            matName = "sandstone";
        } else {
            matName = material(mat);
            if (total > 1) {
                matName+="s";
            }
            if (mat == Material.DIAMOND_ORE) {
                matName+="!";
            }
        }
        return matName;
    }

    public static String material(Material mat) {
        return mat.name().toLowerCase().replace("_", " ");
    }

    public static String chatColor(ChatColor color) {
        return color.name().toLowerCase().replace("_", " ");
    }

    public static String capitalize(String string) {
        String[] words = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String x : words) {
            String capped = WordUtils.capitalize(x);
            System.out.println(WordUtils.capitalize(x));
            sb.append(capped + " ");
        }
        return sb.toString().trim();
    }
}
