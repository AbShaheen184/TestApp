package org.msgpack.core;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);

    public static final b[] i0 = new b[LibretroCore.SCREEN_WIDTH];
    public final int e;

    static {
        b bVar;
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & (-128)) != 0) {
                int i2 = b & (-32);
                if (i2 == -32) {
                    bVar = NEGFIXINT;
                } else if (i2 != -96) {
                    int i3 = b & (-16);
                    if (i3 == -112) {
                        bVar = FIXARRAY;
                    } else if (i3 != -128) {
                        switch (b) {
                            case -64:
                                bVar = NIL;
                                break;
                            case -63:
                            default:
                                bVar = NEVER_USED;
                                break;
                            case -62:
                            case -61:
                                bVar = BOOLEAN;
                                break;
                            case -60:
                                bVar = BIN8;
                                break;
                            case -59:
                                bVar = BIN16;
                                break;
                            case -58:
                                bVar = BIN32;
                                break;
                            case -57:
                                bVar = EXT8;
                                break;
                            case -56:
                                bVar = EXT16;
                                break;
                            case -55:
                                bVar = EXT32;
                                break;
                            case -54:
                                bVar = FLOAT32;
                                break;
                            case -53:
                                bVar = FLOAT64;
                                break;
                            case -52:
                                bVar = UINT8;
                                break;
                            case -51:
                                bVar = UINT16;
                                break;
                            case -50:
                                bVar = UINT32;
                                break;
                            case -49:
                                bVar = UINT64;
                                break;
                            case -48:
                                bVar = INT8;
                                break;
                            case -47:
                                bVar = INT16;
                                break;
                            case -46:
                                bVar = INT32;
                                break;
                            case -45:
                                bVar = INT64;
                                break;
                            case -44:
                                bVar = FIXEXT1;
                                break;
                            case -43:
                                bVar = FIXEXT2;
                                break;
                            case -42:
                                bVar = FIXEXT4;
                                break;
                            case -41:
                                bVar = FIXEXT8;
                                break;
                            case -40:
                                bVar = FIXEXT16;
                                break;
                            case -39:
                                bVar = STR8;
                                break;
                            case -38:
                                bVar = STR16;
                                break;
                            case -37:
                                bVar = STR32;
                                break;
                            case -36:
                                bVar = ARRAY16;
                                break;
                            case -35:
                                bVar = ARRAY32;
                                break;
                            case -34:
                                bVar = MAP16;
                                break;
                            case -33:
                                bVar = MAP32;
                                break;
                        }
                    } else {
                        bVar = FIXMAP;
                    }
                } else {
                    bVar = FIXSTR;
                }
            } else {
                bVar = POSFIXINT;
            }
            i0[i] = bVar;
        }
    }

    b(int i) {
        this.e = i;
    }
}
