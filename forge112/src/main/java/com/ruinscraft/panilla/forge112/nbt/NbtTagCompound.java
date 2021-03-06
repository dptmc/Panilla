package com.ruinscraft.panilla.forge112.nbt;

import com.ruinscraft.panilla.api.nbt.INbtTagCompound;
import com.ruinscraft.panilla.api.nbt.INbtTagList;
import com.ruinscraft.panilla.api.nbt.NbtDataType;
import net.minecraft.nbt.NBTTagCompound;

import java.util.Set;

public class NbtTagCompound implements INbtTagCompound {

    private final NBTTagCompound handle;

    public NbtTagCompound(NBTTagCompound handle) {
        this.handle = handle;
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    @Override
    public boolean hasKey(String key) {
        return handle.hasKey(key);
    }

    @Override
    public boolean hasKeyOfType(String key, NbtDataType nbtDataType) {
        return handle.hasKey(key, nbtDataType.id);
    }

    @Override
    public Set<String> getKeys() {
        return handle.getKeySet();
    }

    @Override
    public int getInt(String key) {
        return handle.getInteger(key);
    }

    @Override
    public short getShort(String key) {
        return handle.getShort(key);
    }

    @Override
    public String getString(String key) {
        return handle.getString(key);
    }

    @Override
    public INbtTagList getList(String key, NbtDataType nbtDataType) {
        return new NbtTagList(handle.getTagList(key, nbtDataType.id));
    }

    @Override
    public INbtTagList getList(String key) {
        return null;
    }

    @Override
    public INbtTagCompound getCompound(String key) {
        return new NbtTagCompound(handle.getCompoundTag(key));
    }

}
