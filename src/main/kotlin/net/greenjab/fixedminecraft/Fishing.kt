package net.greenjab.fixedminecraft

import net.minecraft.entity.data.TrackedData
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

class Fishing {
    public val TEXTURE = Identifier("textures/entity/fishing/fishing_no_bait.png")
    public val BAD_BAIT_TEXTURE = Identifier("textures/entity/fishing/fishing_bad_bait.png")
    public val GOOD_BAIT_TEXTURE = Identifier("textures/entity/fishing/fishing_good_bait.png")
    public val BAIT_LEVEL: TrackedData<Int>? = null
    public val BAIT_STACK: TrackedData<ItemStack>? = null

    //in FishingRodItem use at if user.fishHook != null: if attached to entity (mob or fish), play as normal.
    // If in no entity or cancelling give back BAIT_STACK.
    // else: get offhand stack, if either spider eye, take one out of the stack and store it in BAIT_STACK and
    // set BAIT_LEVEL to 0: neither, 1: spider_eye, 2: fermented_spider_eye.

    //in FishingBobberEntity use at this.hookCountdown > 0: set loot table based on BAIT_LEVEL

    //in client.FishingBobberEntityRenderer getTexture: return texture based off BAIT_LEVEL


}
