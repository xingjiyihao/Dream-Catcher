package me.moxun.dreamcatcher.connector.websocket;

class MaskingHelper {
  public static void unmask(byte[] key, byte[] data, int offset, int count) {
    int index = 0;
    while (count-- > 0) {
      data[offset++] ^= key[index++ % key.length];
    }
  }
}
