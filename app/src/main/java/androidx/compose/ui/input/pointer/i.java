package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int a;
    public int b;
    public long c;
    public final Cloneable d;
    public final Cloneable e;
    public final Object f;
    public Object g;

    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Cloneable] */
    public i(int i) {
        switch (i) {
            case 1:
                this.d = new byte[8];
                this.e = new ArrayDeque();
                this.f = new androidx.media3.extractor.mkv.f();
                break;
            default:
                this.d = new SparseLongArray();
                this.e = new SparseBooleanArray();
                this.f = new ArrayList();
                this.g = new androidx.collection.s((Object) null);
                this.a = -1;
                this.b = -1;
                break;
        }
    }

    public void a(MotionEvent motionEvent) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.c;
                this.c = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.c;
            this.c = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                ((SparseBooleanArray) this.e).put(pointerId2, true);
            }
        }
    }

    public void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.a && source == this.b) {
            return;
        }
        this.a = toolType;
        this.b = source;
        ((SparseBooleanArray) this.e).clear();
        ((SparseLongArray) this.d).clear();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    public androidx.compose.foundation.text.input.internal.o c(MotionEvent motionEvent, androidx.compose.ui.platform.u uVar) {
        int actionIndex;
        long jValueAt;
        float f;
        long j;
        long jT;
        long jI;
        int toolType;
        int i;
        int historySize;
        int i2;
        char c;
        char c2;
        long jFloatToRawIntBits;
        float historicalX;
        i iVar = this;
        SparseLongArray sparseLongArray = (SparseLongArray) iVar.d;
        ArrayList arrayList = (ArrayList) iVar.f;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) iVar.e;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = true;
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        while (i4 < pointerCount) {
            boolean z4 = (z2 || i4 == actionIndex || (z3 && motionEvent.getButtonState() == 0)) ? false : z;
            int pointerId = motionEvent.getPointerId(i4);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j2 = iVar.c;
                iVar.c = j2 + 1;
                sparseLongArray.put(pointerId, j2);
                jValueAt = j2;
            }
            float pressure = motionEvent.getPressure(i4);
            char c3 = ' ';
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i4))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i4))) << 32);
            long jA = androidx.compose.ui.geometry.b.a(jFloatToRawIntBits2, 0.0f, i3);
            if (i4 == 0) {
                f = 0.0f;
                jT = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jI = uVar.I(jT);
            } else {
                f = 0.0f;
                if (Build.VERSION.SDK_INT >= 29) {
                    jT = j.a(motionEvent, i4);
                    jI = uVar.I(jT);
                } else {
                    j = jFloatToRawIntBits2;
                    jT = uVar.t(jFloatToRawIntBits2);
                }
                toolType = motionEvent.getToolType(i4);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i = 1;
                    } else if (toolType != 2) {
                        i = i3;
                    } else if (toolType != i3) {
                        i = 2;
                    } else if (toolType != 4) {
                        i = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i2 = 0;
                    while (i2 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i4, i2);
                        float historicalY = motionEvent.getHistoricalY(i4, i2);
                        char c4 = c3;
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c4) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                            arrayList2.add(new c(motionEvent.getHistoricalEventTime(i2), jFloatToRawIntBits3, jFloatToRawIntBits3));
                        }
                        i2++;
                        c3 = c4;
                        sparseLongArray = sparseLongArray;
                    }
                    SparseLongArray sparseLongArray2 = sparseLongArray;
                    c = c3;
                    if (motionEvent.getActionMasked() == 8) {
                        c2 = '\n';
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c);
                    } else {
                        c2 = '\n';
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList2, jFloatToRawIntBits, jA));
                    i4++;
                    i3 = 3;
                    z = true;
                    z2 = z2;
                    z3 = z3;
                    sparseLongArray = sparseLongArray2;
                    iVar = this;
                }
                i = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i4, i2);
                    float historicalY2 = motionEvent.getHistoricalY(i4, i2);
                    char c5 = c3;
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                    }
                    i2++;
                    c3 = c5;
                    sparseLongArray = sparseLongArray;
                }
                SparseLongArray sparseLongArray3 = sparseLongArray;
                c = c3;
                if (motionEvent.getActionMasked() == 8) {
                    c2 = '\n';
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c);
                } else {
                    c2 = '\n';
                    jFloatToRawIntBits = 0;
                }
                arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList3, jFloatToRawIntBits, jA));
                i4++;
                i3 = 3;
                z = true;
                z2 = z2;
                z3 = z3;
                sparseLongArray = sparseLongArray3;
                iVar = this;
            }
            j = jI;
            toolType = motionEvent.getToolType(i4);
            if (toolType == 0) {
                if (toolType != 1) {
                    i = 1;
                } else if (toolType != 2) {
                    i = i3;
                } else if (toolType != i3) {
                    i = 2;
                } else if (toolType != 4) {
                    i = 4;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i4, i2);
                    float historicalY3 = motionEvent.getHistoricalY(i4, i2);
                    char c6 = c3;
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                    }
                    i2++;
                    c3 = c6;
                    sparseLongArray = sparseLongArray;
                }
                SparseLongArray sparseLongArray4 = sparseLongArray;
                c = c3;
                if (motionEvent.getActionMasked() == 8) {
                    c2 = '\n';
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c);
                } else {
                    c2 = '\n';
                    jFloatToRawIntBits = 0;
                }
                arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList4, jFloatToRawIntBits, jA));
                i4++;
                i3 = 3;
                z = true;
                z2 = z2;
                z3 = z3;
                sparseLongArray = sparseLongArray4;
                iVar = this;
            }
            i = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i2 = 0;
            while (i2 < historySize) {
                historicalX = motionEvent.getHistoricalX(i4, i2);
                float historicalY4 = motionEvent.getHistoricalY(i4, i2);
                char c7 = c3;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                }
                i2++;
                c3 = c7;
                sparseLongArray = sparseLongArray;
            }
            SparseLongArray sparseLongArray5 = sparseLongArray;
            c = c3;
            if (motionEvent.getActionMasked() == 8) {
                c2 = '\n';
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c);
            } else {
                c2 = '\n';
                jFloatToRawIntBits = 0;
            }
            arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList5, jFloatToRawIntBits, jA));
            i4++;
            i3 = 3;
            z = true;
            z2 = z2;
            z3 = z3;
            sparseLongArray = sparseLongArray5;
            iVar = this;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new androidx.compose.foundation.text.input.internal.o(14, arrayList, motionEvent);
    }

    public long d(androidx.media3.extractor.o oVar, int i) {
        byte[] bArr = (byte[]) this.d;
        oVar.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public void e(MotionEvent motionEvent) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.e;
        SparseLongArray sparseLongArray = (SparseLongArray) this.d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
