package com.ruinscraft.panilla.api.nbt.checks;

import com.ruinscraft.panilla.api.IPanilla;
import com.ruinscraft.panilla.api.config.PStrictness;
import com.ruinscraft.panilla.api.nbt.INbtTagCompound;
import com.ruinscraft.panilla.api.nbt.INbtTagList;
import com.ruinscraft.panilla.api.nbt.NbtDataType;

public class NbtCheck_Fireworks extends NbtCheck {

    public NbtCheck_Fireworks() {
        super("Fireworks", PStrictness.AVERAGE);
    }

    @Override
    public NbtCheckResult check(INbtTagCompound tag, String itemName, IPanilla panilla) {
        INbtTagCompound fireworks = tag.getCompound("Fireworks");

        int flight = fireworks.getInt("Flight");

        if (flight > panilla.getProtocolConstants().maxFireworksFlight()
                || flight < panilla.getProtocolConstants().minFireworksFlight()) {
            return NbtCheckResult.FAIL;
        }

        INbtTagList explosions = fireworks.getList("Explosions", NbtDataType.COMPOUND);

        if (explosions != null
                && explosions.size() > panilla.getProtocolConstants().maxFireworksExplosions()) {
            return NbtCheckResult.FAIL;
        }

        return NbtCheckResult.PASS;
    }

}
