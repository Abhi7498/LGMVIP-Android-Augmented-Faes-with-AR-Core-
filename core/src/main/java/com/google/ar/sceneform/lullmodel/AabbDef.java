// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

import java.nio.*;

import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AabbDef extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public AabbDef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public Vec3 min() { return min(new Vec3()); }
  public Vec3 min(Vec3 obj) { return obj.__assign(bb_pos + 0, bb); }
  public Vec3 max() { return max(new Vec3()); }
  public Vec3 max(Vec3 obj) { return obj.__assign(bb_pos + 12, bb); }

  public static int createAabbDef(FlatBufferBuilder builder, float min_x, float min_y, float min_z, float max_x, float max_y, float max_z) {
    builder.prep(4, 24);
    builder.prep(4, 12);
    builder.putFloat(max_z);
    builder.putFloat(max_y);
    builder.putFloat(max_x);
    builder.prep(4, 12);
    builder.putFloat(min_z);
    builder.putFloat(min_y);
    builder.putFloat(min_x);
    return builder.offset();
  }
}

