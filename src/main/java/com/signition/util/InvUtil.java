package com.signition.util;

import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class InvUtil {

    public static ItemStack itemFromBase64(String data) throws IOException {
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(Base64Coder.decodeLines(data));
            BukkitObjectInputStream dataInput = new BukkitObjectInputStream(inputStream);
            ItemStack[] is = new ItemStack[dataInput.readInt()];
            for (int i = 0; i < is.length; i++) {
                is[i] = (ItemStack) dataInput.readObject();
            }
            dataInput.close();
            return is[0];

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
            throw new IOException("Could not decode item.", e);
        }
    }

    public static String itemToBase64(ItemStack item) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BukkitObjectOutputStream dataOutput = new BukkitObjectOutputStream(outputStream);
            dataOutput.writeInt(1);
            dataOutput.writeObject(item);
            dataOutput.close();
            return Base64Coder.encodeLines(outputStream.toByteArray());

        } catch (Exception e) {
            throw new IllegalStateException("failed to convert item", e);
        }
    }

}
